package main;

public class Mesa {

    public UIFilosofos objUI;
    public Estados[] filosofosComiendo;
    public Estados[] tenedoresUsando;

    public Mesa(UIFilosofos objUI) {
        this.objUI = objUI;
    }

    public void iniciar() {
        filosofosComiendo = new Estados[5];
        tenedoresUsando = new Estados[5];
        for (int i = 0; i < 5; i++) {
            filosofosComiendo[i] = Estados.PENSANDO;
            tenedoresUsando[i] = Estados.ESPERANDO;
        }
        MonitorTenedores monitor = new MonitorTenedores();

        for (int i = 0; i < 5; i++) {
            Thread filosofoThread = new Thread(new Filosofo(i, monitor, this));
            filosofoThread.start();
        }
    }

    public void setFilosofoComiendo(int id1, int id2, Estados valor) {
        filosofosComiendo[id1] = valor;
        tenedoresUsando[id1] = valor;
        tenedoresUsando[id2] = valor;
        objUI.actualizarUI();
    }

    public Estados isFilosofoComiendo(int filosofoId) {
        return filosofosComiendo[filosofoId];
    }

    public Estados isTenedorUsando(int tenedorId) {
        return tenedoresUsando[tenedorId];
    }
}
