package main;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread {

    private static Mesa mesa;
    private final int filosofo;

    public Filosofo(Mesa mesa, int filosofo) {
        Filosofo.mesa = mesa;
        this.filosofo = filosofo;
    }

    @Override
    public void run() {
        while (true) {
            pensando();
            comiendo();
        }
    }

    public void pensando() {
        mesa.dejarTenedores(filosofo);
        mesa.actualizarFilosofo(filosofo, false);
        System.out.println("Filosofo " + filosofo + " pensando");
        
        try {
            sleep(random(3, 1) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comiendo() {
        mesa.ocuparTenedores(filosofo);
        mesa.actualizarFilosofo(filosofo, true);
        System.out.println("Filosofo " + filosofo + " comiendo");
        
        try {
            sleep(random(6, 2) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }
}
