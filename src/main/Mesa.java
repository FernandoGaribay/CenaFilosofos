package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa {

    private static Filosofo[] objFilosofos;
    private Estados[] filosofos;
    private Estados[] tenedores;
    private MonitorTenedores monitor;
    private UIFilosofos ui;

    public Mesa() {
        tenedores = new Estados[5];
    }

    public Mesa(UIFilosofos ui) {
        Mesa.objFilosofos = new Filosofo[5];
        this.filosofos = new Estados[5];
        this.tenedores = new Estados[5];
        this.ui = ui;

        for (int i = 0; i < 5; i++) {
            filosofos[i] = Estados.PENSANDO; // Todos los filosofos inician pensando
            tenedores[i] = Estados.LIBRE; // Todos los tenedores inician estando libres
        }
    }

    public void iniciar() {
        for (int i = 0; i < 5; i++) {
            objFilosofos[i] = new Filosofo(this, i);
            objFilosofos[i].start();
        }
    }

    public synchronized void ocuparTenedores(int filosofo) {

        while (tenedores[tenedorIzquierda(filosofo)] == Estados.OCUPADO || tenedores[tenedorDerecha(filosofo)] == Estados.OCUPADO) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tenedores[tenedorIzquierda(filosofo)] = Estados.OCUPADO;
        tenedores[tenedorDerecha(filosofo)] = Estados.OCUPADO;
    }

    public synchronized void dejarTenedores(int filosofo) {
        tenedores[tenedorIzquierda(filosofo)] = Estados.LIBRE;
        tenedores[tenedorDerecha(filosofo)] = Estados.LIBRE;
        notifyAll();
    }

    public synchronized void actualizarFilosofo(int i, Estados valor) {
        filosofos[i] = valor;
        ui.actualizarUI(filosofos, tenedores);
    }

    public int tenedorIzquierda(int tenedor) {
        return tenedor;
    }

    public int tenedorDerecha(int tenedor) {
        return (tenedor + 1) % 5;
    }

    public void pausarFilosofos(boolean valor) {
        for (int i = 0; i < 5; i++) {
            objFilosofos[i].setPausa(valor);
        }
    }
}
