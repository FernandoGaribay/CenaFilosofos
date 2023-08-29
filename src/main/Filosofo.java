package main;

import java.util.concurrent.Semaphore;

public class Filosofo implements Runnable {

    private int id;
    private MonitorTenedores monitor;
    private Mesa mesa;
    private Semaphore maxComiendo;

    public Filosofo(int id, MonitorTenedores monitor, Mesa mesa, Semaphore maxComiendo) {
        this.id = id;
        this.monitor = monitor;
        this.mesa = mesa;
        this.maxComiendo = maxComiendo;
    }

    public void pensar() throws InterruptedException {
        System.out.println("Filósofo " + id + " pensando.");
        Thread.sleep((int) (Math.random() * (10 - 5) + 1) * 1000);
    }

    public void comer() throws InterruptedException {
        System.out.println("Filósofo " + id + " tiene ambos tenedores y está comiendo.");
        Thread.sleep((int) (Math.random() * (10 - 5) + 1) * 1000);
    }

    public void run() {
        try {
            while (true) {
                pensar();
                maxComiendo.acquire();
                monitor.tomarTenedores(id);
                mesa.setFilosofoComiendo(id, true);

                comer();
                maxComiendo.release();
                mesa.setFilosofoComiendo(id, false);
                monitor.liberarTenedores(id);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
