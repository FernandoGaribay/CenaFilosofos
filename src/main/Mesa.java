package main;

public class Mesa {

    private UIFilosofos objUI;
    private Estados[] filosofosComiendo;
    private Estados[] tenedoresUsando;
    private String ultimoMensaje;

    public Mesa(UIFilosofos objUI) {
        this.objUI = objUI;
        this.ultimoMensaje = null;
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

    public String getUltimoMensaje() {
        return ultimoMensaje;
    }

    public void setUltimoMensaje(String ultimoMensaje) {
        this.ultimoMensaje = ultimoMensaje;
    }
    
}
