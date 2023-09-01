package main;

public class Mesa {

    public UIFilosofos objUI;
    public boolean[] filosofosComiendo;
    public boolean[] tenedoresUsando;

    public Mesa(UIFilosofos objUI) {
        this.objUI = objUI;
    }

    public void iniciar() {
        filosofosComiendo = new boolean[5];
        tenedoresUsando = new boolean[5];
        for (int i = 0; i < 5; i++) {
            filosofosComiendo[i] = false;
            tenedoresUsando[i] = false;
        }
        MonitorTenedores monitor = new MonitorTenedores();

        for (int i = 0; i < 5; i++) {
            Thread filosofoThread = new Thread(new Filosofo(i, monitor, this));
            filosofoThread.start();
        }
    }

    public void setFilosofoComiendo(int filosofoId, int tenedor1, int tenedor2, boolean valor) {
        filosofosComiendo[filosofoId] = valor;
        tenedoresUsando[tenedor1] = valor;
        tenedoresUsando[tenedor2] = valor;
        objUI.actualizarUI();
    }

    public boolean isFilosofoComiendo(int filosofoId) {
        return filosofosComiendo[filosofoId];
    }

    public boolean isTenedorUsando(int tenedorId) {
        return tenedoresUsando[tenedorId];
    }
}
