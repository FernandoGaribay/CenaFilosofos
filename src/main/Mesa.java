package main;

import java.util.concurrent.Semaphore;

public class Mesa {

    public UIFilosofos objUI;
    public boolean[] filosofosComiendo;
    private Semaphore maxComiendo;

    public Mesa(UIFilosofos objUI){
        this.objUI = objUI;
        maxComiendo = new Semaphore(2);
    }
    
    public void iniciar() {
        int numFilosofos = 5;
        filosofosComiendo = new boolean[numFilosofos];

        for (int i = 0; i < numFilosofos; i++) {
            filosofosComiendo[i] = false;
        }

        MonitorTenedores monitor = new MonitorTenedores(numFilosofos);

        for (int i = 0; i < numFilosofos; i++) {
            Thread filosofoThread = new Thread(new Filosofo(i, monitor, this, maxComiendo));
            filosofoThread.start();
        }
    }

    public void setFilosofoComiendo(int filosofoId, boolean comiendo) {
        filosofosComiendo[filosofoId] = comiendo;
        objUI.actualizarUI();
    }

    public boolean isFilosofoComiendo(int filosofoId) {
        return filosofosComiendo[filosofoId];
    }
}
