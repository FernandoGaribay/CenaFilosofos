package main;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread {

    private static Mesa mesa;
    private int filosofo;

    public Filosofo(Mesa mesa, int filosofo) {
        Filosofo.mesa = mesa;
        this.filosofo = filosofo;
    }

    @Override
    public void run() {
        while (true) {
            pensando();
            mesa.setFilosofosComiendo(filosofo, false);
            mesa.ocuparTenedores(filosofo);
            
            comiendo();
            mesa.setFilosofosComiendo(filosofo, true);
            mesa.dejarTenedores(filosofo);
        }
    }

    public void pensando() {
        System.out.println("El filosofo " + filosofo + " esta pensando");
        try {
            sleep(random(5, 1) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void comiendo() {
        System.out.println("El filosofo " + filosofo + " esta comiendo");
        try {
            sleep(random(5, 1) * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }
}
