package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mesa {

    private List<Filosofo> filosofos;
    private Estados[] tenedores;
    private List<MesaListener> listeners;

    public Mesa() {
        this.filosofos = new ArrayList<>(5);
        this.tenedores = new Estados[5];
        this.listeners = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            filosofos.add(new Filosofo(this, i));
            tenedores[i] = Estados.LIBRE;
        }
    }

    public void iniciar() {
        for (int i = 0; i < 5; i++) {
            filosofos.get(i).start();
        }
    }

    public synchronized void addMesaListener(MesaListener listener) {
        listeners.add(listener);
    }

    public void notificarCambios() {
        for (MesaListener listener : listeners) {
            listener.mesaActualizada(filosofos, tenedores);
        }
    }

    public synchronized void ocuparTenedores(int filosofo) {

        while (tenedores[tenedorIzquierda(filosofo)] == Estados.OCUPADO
                || tenedores[tenedorDerecha(filosofo)] == Estados.OCUPADO) {
            try {
                notificarCambios();
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

    public int tenedorIzquierda(int tenedor) {
        return tenedor;
    }

    public int tenedorDerecha(int tenedor) {
        return (tenedor + 1) % 5;
    }

    public void pausarFilosofos() {
        for (int i = 0; i < 5; i++) {
            filosofos.get(i).suspend();
        }
    }

    public void reanudarFilosofos() {
        for (int i = 0; i < 5; i++) {
            filosofos.get(i).resume();
        }
    }
}