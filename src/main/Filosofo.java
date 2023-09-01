package main;

public class Filosofo implements Runnable {

    private final int id;
    private static MonitorTenedores monitor;
    private final Mesa mesa;
    private String ultimoMensaje;

    public Filosofo(int id, MonitorTenedores monitor, Mesa mesa) {
        this.id = id;
        Filosofo.monitor = monitor;
        this.mesa = mesa;
    }

    public void pensar() throws InterruptedException {
        System.out.println("Filósofo " + id + " pensando.");
        Thread.sleep(random(10, 3) * 1000);
    }

    public void comer() throws InterruptedException {
        System.out.println("Filósofo " + id + " tiene ambos tenedores y está comiendo.");
        Thread.sleep(random(5, 1) * 1000);
    }

    public void run() {
        try {
            while (true) {
                this.pensar();
                
                System.out.println("El filosofo " + id + " quiere comer.");
                monitor.tomarTenedores(id);
                mesa.setFilosofoComiendo(id, (id + 1) % 5, true);

                this.comer();
                mesa.setFilosofoComiendo(id, (id + 1) % 5, false);
                monitor.liberarTenedores(id);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }
}
