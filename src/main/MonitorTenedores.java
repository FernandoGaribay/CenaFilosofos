package main;

import java.util.concurrent.Semaphore;

public class MonitorTenedores {

    private final Semaphore[] tenedores;

    public MonitorTenedores(int numTenedores) {
        tenedores = new Semaphore[numTenedores];
        for (int i = 0; i < numTenedores; i++) {
            tenedores[i] = new Semaphore(1); // Inicialmente todos los tenedores están disponibles
        }
    }

    public void tomarTenedores(int filosofoId) throws InterruptedException {
        int tenedorIzquierdo = filosofoId;
        int tenedorDerecho = (filosofoId + 1) % tenedores.length;

        tenedores[tenedorIzquierdo].acquire();
        tenedores[tenedorDerecho].acquire();
    }

    public void liberarTenedores(int filosofoId) {
        int tenedorIzquierdo = filosofoId;
        int tenedorDerecho = (filosofoId + 1) % tenedores.length;

        tenedores[tenedorIzquierdo].release();
        tenedores[tenedorDerecho].release();
    }
}
