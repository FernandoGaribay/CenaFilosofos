package main;

public class Mesa {

    public UIFilosofos objUI;
    public boolean[] filosofosComiendo;
    
    public Mesa(UIFilosofos objUI) {
        this.objUI = objUI;
    }

    public void iniciar() {
        filosofosComiendo = new boolean[5];
        for (int i = 0; i < 5; i++) {
            filosofosComiendo[i] = false;
        }
        MonitorTenedores monitor = new MonitorTenedores();

        for (int i = 0; i < 5; i++) {
            Thread filosofoThread = new Thread(new Filosofo(i, monitor, this));
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
