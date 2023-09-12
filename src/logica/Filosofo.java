package logica;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread {

    private Mesa mesa;
    private boolean pausa;
    private int filosofo;
    private Estados estado;

    public Filosofo(Mesa mesa, int filosofo) {
        this.mesa = mesa;
        this.pausa = false;
        this.filosofo = filosofo;
        this.estado = Estados.PENSANDO;
    }

    @Override
    public void run() {
        while (true) {
            if (!pausa) {
                pensando();
                esperando();
                comiendo();
            }
        }
    }

    public void pensando() {
        mesa.dejarTenedores(filosofo);
        estado = Estados.PENSANDO;

        System.out.println("Filosofo " + (filosofo + 1) + " " + estado);
        mesa.notificarCambios();
        sleep(3, 1);

    }

    public void esperando() {
        estado = Estados.ESPERANDO;

        System.out.println("Filosofo " + (filosofo + 1) + " " + estado);
        mesa.notificarCambios();
    }

    public void comiendo() {
        mesa.ocuparTenedores(filosofo);
        estado = Estados.COMIENDO;

        System.out.println("Filosofo " + (filosofo + 1) + " " + estado);
        mesa.notificarCambios();
        sleep(6, 2);
    }

    private void sleep(int max, int min) {
        try {
            sleep(random(max, min) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public void setPausa(boolean valor) {
        this.pausa = valor;
    }
}
