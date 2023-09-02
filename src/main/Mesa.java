package main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa {

    private boolean[] tenedores;
    private UIFilosofos ui;
    private boolean filosofos[];

    public Mesa() {
        tenedores = new boolean[5];
    }

    public Mesa(UIFilosofos ui) {
        tenedores = new boolean[5];
        this.ui = ui;
        this.filosofos = new boolean[5];

        for (int i = 0; i < 5; i++) {
            filosofos[i] = false;
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

        while (tenedores[tenedorIzquierda(filosofo)] || tenedores[tenedorDerecha(filosofo)]) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Mesa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        tenedores[tenedorIzquierda(filosofo)] = true;
        tenedores[tenedorDerecha(filosofo)] = true;
    }

    public synchronized void dejarTenedores(int filosofo) {
        tenedores[tenedorIzquierda(filosofo)] = false;
        tenedores[tenedorDerecha(filosofo)] = false;
        notifyAll();
    }

    public void validarDatos() {
        ui.actualizarUI();
    }

    public void setFilosofosComiendo(int filosofo, boolean valor) {
        this.filosofos[filosofo] = valor;
        validarDatos();
    }

    public boolean isFilosofosComiendo(int i) {
        return filosofos[i];
    }

}
