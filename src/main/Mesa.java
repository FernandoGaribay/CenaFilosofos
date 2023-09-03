package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa {

    private Estados[] filosofos;
    private Estados[] tenedores;
    private UIFilosofos ui;

    public Mesa() {
        tenedores = new Estados[5];
    }

    public Mesa(UIFilosofos ui) {
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
            Filosofo filosofo = new Filosofo(this, i);
            filosofo.start();
        }
    }

    public int tenedorIzquierda(int tenedor) {
        return tenedor;
    }

    public int tenedorDerecha(int tenedor) {
        return (tenedor + 1) % 5;
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
}
