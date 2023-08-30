package main;

public class Filosofo implements Runnable {

    private int id;
    private static MonitorTenedores monitor;
    private Mesa mesa;

    public Filosofo(int id, MonitorTenedores monitor, Mesa mesa) {
        this.id = id;
        this.monitor = monitor;
        this.mesa = mesa;
    }

    public void pensar() throws InterruptedException {
        System.out.println("Filósofo " + id + " pensando.");
        Thread.sleep((int) (Math.random() * (5 - 2) + 2) * 1000);
    }

    public void comer() throws InterruptedException {
        System.out.println("Filósofo " + id + " tiene ambos tenedores y está comiendo.");
        Thread.sleep((int) (Math.random() * (5 - 2) + 2) * 1000);
    }

    public void run() {
        try {
            while (true) {
                this.pensar();
                monitor.tomarTenedores(id);
                mesa.setFilosofoComiendo(id, true);

                this.comer();
                mesa.setFilosofoComiendo(id, false);
                monitor.liberarTenedores(id);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
