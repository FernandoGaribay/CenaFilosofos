package logica;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread {

    private static Mesa mesa;
    private boolean pausa;
    private final int filosofo;
    private Estados estado;

    public Filosofo(Mesa mesa, int filosofo) {
        Filosofo.mesa = mesa;
        this.pausa = false;
        this.filosofo = filosofo;
    }

    @Override
    public void run() {
        while (true) {
            if (!pausa) {
                pensando();
                esperando();
                comiendo();
            }
            System.out.println("PAUSA: " + pausa);
        }
    }

    public void pensando() {
        estado = Estados.PENSANDO;
        mesa.dejarTenedores(filosofo);
        mesa.actualizarFilosofo(filosofo, Estados.PENSANDO);
        
        System.out.println("Filosofo " + filosofo + " " + estado);
        sleep(3, 1);

    }

    public void esperando() {
        estado = Estados.ESPERANDO;
        mesa.actualizarFilosofo(filosofo, Estados.ESPERANDO);

        System.out.println("Filosofo " + filosofo + " " + estado);

    }

    public void comiendo() {
        estado = Estados.COMIENDO;
        mesa.ocuparTenedores(filosofo);
        mesa.actualizarFilosofo(filosofo, Estados.COMIENDO);

        System.out.println("Filosofo " + filosofo + " " + estado);
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

    public void setPausa(boolean valor) {
        this.pausa = valor;
    }
}
