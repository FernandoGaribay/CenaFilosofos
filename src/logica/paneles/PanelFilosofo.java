package logica.paneles;

import java.awt.Color;

public class PanelFilosofo extends javax.swing.JPanel {

    private final int idFilosofo;
    private String ultimoEstado;

    public PanelFilosofo(int i) {
        initComponents();
        this.idFilosofo = i;
        this.ultimoEstado = "Esta durmiendo.";
        this.lblFilosofo.setText(this.lblFilosofo.getText() + this.idFilosofo);
    }

    public void setHistorial(String historial) {
        if (!ultimoEstado.equals(historial)) {
            textHistorialFilofoso.append("Filosofo " + this.idFilosofo + ": " + historial + "\n");
            ultimoEstado = historial;
        }
    }

    public void pensar() {
        this.pnlComiendo.setBackground(Brojo());
        this.pnlEsperando.setBackground(Bamarillo());
        this.pnlPensando.setBackground(Fverde());

        this.setHistorial("Esta durmiendo.");
    }

    public void esperar() {
        this.pnlComiendo.setBackground(Brojo());
        this.pnlEsperando.setBackground(Famarillo());
        this.pnlPensando.setBackground(Bverde());

        this.setHistorial("Esta esperando.");
    }

    public void comer() {
        this.pnlComiendo.setBackground(Frojo());
        this.pnlEsperando.setBackground(Bamarillo());
        this.pnlPensando.setBackground(Bverde());

        this.setHistorial("Esta comiendo.");
    }

    // <editor-fold defaultstate="collapsed" desc="-- Colores estados --">  
    public Color Frojo() {
        return new Color(255, 0, 0);
    }

    public Color Brojo() {
        return new Color(255, 240, 240);
    }

    public Color Famarillo() {
        return new Color(255, 200, 0);
    }

    public Color Bamarillo() {
        return new Color(255, 255, 240);
    }

    public Color Fverde() {
        return new Color(0, 255, 0);
    }

    public Color Bverde() {
        return new Color(240, 255, 240);
    }// </editor-fold> 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFilosofo1 = new javax.swing.JPanel();
        lblFilosofo = new javax.swing.JLabel();
        pnlFilosofo1Estados = new javax.swing.JPanel();
        pnlPensando = new javax.swing.JPanel();
        pnlEsperando = new javax.swing.JPanel();
        pnlComiendo = new javax.swing.JPanel();
        scrollHistorialFilofoso = new javax.swing.JScrollPane();
        textHistorialFilofoso = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFilosofo1.setBackground(new java.awt.Color(250, 250, 250));
        pnlFilosofo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFilosofo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblFilosofo.setText("Filosofo ");
        pnlFilosofo1.add(lblFilosofo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 120, -1));

        pnlFilosofo1Estados.setLayout(new java.awt.GridLayout(3, 0, 0, 3));

        pnlPensando.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnlPensandoLayout = new javax.swing.GroupLayout(pnlPensando);
        pnlPensando.setLayout(pnlPensandoLayout);
        pnlPensandoLayout.setHorizontalGroup(
            pnlPensandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlPensandoLayout.setVerticalGroup(
            pnlPensandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados.add(pnlPensando);

        pnlEsperando.setBackground(new java.awt.Color(255, 255, 230));

        javax.swing.GroupLayout pnlEsperandoLayout = new javax.swing.GroupLayout(pnlEsperando);
        pnlEsperando.setLayout(pnlEsperandoLayout);
        pnlEsperandoLayout.setHorizontalGroup(
            pnlEsperandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlEsperandoLayout.setVerticalGroup(
            pnlEsperandoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados.add(pnlEsperando);

        pnlComiendo.setBackground(new java.awt.Color(255, 230, 230));

        javax.swing.GroupLayout pnlComiendoLayout = new javax.swing.GroupLayout(pnlComiendo);
        pnlComiendo.setLayout(pnlComiendoLayout);
        pnlComiendoLayout.setHorizontalGroup(
            pnlComiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlComiendoLayout.setVerticalGroup(
            pnlComiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados.add(pnlComiendo);

        pnlFilosofo1.add(pnlFilosofo1Estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 32, -1, 55));

        scrollHistorialFilofoso.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textHistorialFilofoso.setEditable(false);
        textHistorialFilofoso.setBackground(new java.awt.Color(255, 255, 255));
        textHistorialFilofoso.setColumns(20);
        textHistorialFilofoso.setRows(5);
        scrollHistorialFilofoso.setViewportView(textHistorialFilofoso);

        pnlFilosofo1.add(scrollHistorialFilofoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 250, 55));

        add(pnlFilosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 96));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFilosofo;
    private javax.swing.JPanel pnlComiendo;
    private javax.swing.JPanel pnlEsperando;
    private javax.swing.JPanel pnlFilosofo1;
    private javax.swing.JPanel pnlFilosofo1Estados;
    private javax.swing.JPanel pnlPensando;
    private javax.swing.JScrollPane scrollHistorialFilofoso;
    private javax.swing.JTextArea textHistorialFilofoso;
    // End of variables declaration//GEN-END:variables
}
