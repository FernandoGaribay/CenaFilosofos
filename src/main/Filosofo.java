package main;

public class Filosofo implements Runnable {

    private final int id;
    private static MonitorTenedores monitor;
    private final Mesa mesa;

    public Filosofo(int id, MonitorTenedores monitor, Mesa mesa) {
        this.id = id;
        Filosofo.monitor = monitor;
        this.mesa = mesa;
    }

    public void pensar() throws InterruptedException {
        mesa.setUltimoMensaje("Filósofo " + id + ": Pensando.");
        Thread.sleep(random(10, 3) * 1000);
    }

    public void comer() throws InterruptedException {
        mesa.setUltimoMensaje("Filósofo " + id + ": Comiendo.");
        Thread.sleep(random(5, 1) * 1000);
    }

    public void esperar() {
        mesa.setUltimoMensaje("Filósofo " + id + ": Esperando.");
    }

    public void run() {
        try {
            while (true) {
                this.pensar();
                this.esperar();
                mesa.setFilosofoComiendo(id, (id + 1) % 5, Estados.ESPERANDO);
                monitor.tomarTenedores(id);
                mesa.setFilosofoComiendo(id, (id + 1) % 5, Estados.COMIENDO);

                this.comer();
                mesa.setFilosofoComiendo(id, (id + 1) % 5, Estados.PENSANDO);
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
