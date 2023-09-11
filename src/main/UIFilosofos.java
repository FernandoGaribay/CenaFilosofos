package main;

import logica.paneles.PanelFilosofo;
import logica.Estados;
import logica.Mesa;
import librerias.ImageHandler;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static logica.Estados.COMIENDO;
import static logica.Estados.ESPERANDO;
import static logica.Estados.PENSANDO;

public class UIFilosofos extends javax.swing.JFrame {

    private ImageHandler objImagen;
    private final Mesa objMesa;
    private PanelFilosofo[] panelesFilosofos;

    public UIFilosofos() {
        initComponents();
        initImagenes();
        initPaneles();
        this.objMesa = new Mesa(this);
    }

    public void initImagenes() {
        this.objImagen = new ImageHandler("/imagenes/");
        imgFilosofo1.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo2.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo3.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo4.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo5.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
    }

    public void initPaneles() {
        panelesFilosofos = new PanelFilosofo[5];
        for (int i = 0; i < 5; i++) {
            panelesFilosofos[i] = new PanelFilosofo(i + 1);
            pnlContenedorPaneles.add(panelesFilosofos[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        pnlContenedorGrafico = new javax.swing.JPanel();
        tenedor1 = new javax.swing.JPanel();
        lblTenedor1 = new javax.swing.JLabel();
        tenedor2 = new javax.swing.JPanel();
        lblTenedor2 = new javax.swing.JLabel();
        tenedor3 = new javax.swing.JPanel();
        lblTenedor3 = new javax.swing.JLabel();
        tenedor4 = new javax.swing.JPanel();
        lblTenedor4 = new javax.swing.JLabel();
        tenedor5 = new javax.swing.JPanel();
        lblTenedor5 = new javax.swing.JLabel();
        imgFilosofo1 = new javax.swing.JLabel();
        imgFilosofo2 = new javax.swing.JLabel();
        imgFilosofo3 = new javax.swing.JLabel();
        imgFilosofo4 = new javax.swing.JLabel();
        imgFilosofo5 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnReanudar = new javax.swing.JButton();
        pnlContenedorPaneles = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContenedorGrafico.setBackground(new java.awt.Color(204, 204, 204));
        pnlContenedorGrafico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenedor1.setBackground(new java.awt.Color(240, 240, 240));
        tenedor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenedor1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTenedor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenedor1.setText("[1]");
        tenedor1.add(lblTenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnlContenedorGrafico.add(tenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 30));

        tenedor2.setBackground(new java.awt.Color(240, 240, 240));
        tenedor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenedor2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTenedor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenedor2.setText("[2]");
        tenedor2.add(lblTenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnlContenedorGrafico.add(tenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 30, 30));

        tenedor3.setBackground(new java.awt.Color(240, 240, 240));
        tenedor3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenedor3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTenedor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenedor3.setText("[3]");
        tenedor3.add(lblTenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnlContenedorGrafico.add(tenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 30, 30));

        tenedor4.setBackground(new java.awt.Color(240, 240, 240));
        tenedor4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenedor4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTenedor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenedor4.setText("[4]");
        tenedor4.add(lblTenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnlContenedorGrafico.add(tenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 30, 30));

        tenedor5.setBackground(new java.awt.Color(240, 240, 240));
        tenedor5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenedor5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTenedor5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenedor5.setText("[5]");
        tenedor5.add(lblTenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        pnlContenedorGrafico.add(tenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 30, 30));
        pnlContenedorGrafico.add(imgFilosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 60, 60));
        pnlContenedorGrafico.add(imgFilosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 60, 60));
        pnlContenedorGrafico.add(imgFilosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 60, 60));
        pnlContenedorGrafico.add(imgFilosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 60, 60));
        pnlContenedorGrafico.add(imgFilosofo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

        background.add(pnlContenedorGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 390));

        btnReiniciar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        background.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 210, 50));

        btnPausar.setText("Pausar");
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });
        background.add(btnPausar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 110, -1));

        btnReanudar.setText("Reanudar");
        btnReanudar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReanudarActionPerformed(evt);
            }
        });
        background.add(btnReanudar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 110, -1));

        pnlContenedorPaneles.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenedorPaneles.setLayout(new java.awt.GridLayout(5, 0, 0, 5));
        background.add(pnlContenedorPaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 300, 500));

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        background.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed

    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        objMesa.pausarFilosofos(true);
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReanudarActionPerformed
        objMesa.pausarFilosofos(false);
    }//GEN-LAST:event_btnReanudarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        objMesa.iniciar();
        btnIniciar.setEnabled(false);
    }//GEN-LAST:event_btnIniciarActionPerformed

    public void actualizarUI(Estados[] filosofos, Estados[] tenedores) {
        for (int i = 0; i < 5; i++) {

            switch (filosofos[i]) {
                case COMIENDO:
                    comerFilosofo(i);
                    panelesFilosofos[i].comer();
                    break;
                case ESPERANDO:
                    esperarFilosofo(i);
                    panelesFilosofos[i].esperar();
                    break;
                case PENSANDO:
                    pensarFilosofo(i);
                    panelesFilosofos[i].pensar();
                    break;
            }

            if (tenedores[i] == Estados.OCUPADO) {
                ocuparTenedor(i);
            } else if (tenedores[i] == Estados.LIBRE) {
                liberarTenedor(i);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="-- Estados filosofos --">  
    private void comerFilosofo(int filosofoId) {
        getImagenFilosofo(filosofoId).setIcon(objImagen.redimencionarImagen("comiendo.png", new Dimension(60, 60)));
    }

    private void esperarFilosofo(int filosofoId) {
        getImagenFilosofo(filosofoId).setIcon(objImagen.redimencionarImagen("esperando.png", new Dimension(60, 60)));
    }

    private void pensarFilosofo(int filosofoId) {
        getImagenFilosofo(filosofoId).setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
    }

    private JLabel getImagenFilosofo(int filosofoId) {
        switch (filosofoId) {
            case 0:
                return imgFilosofo1;
            case 1:
                return imgFilosofo2;
            case 2:
                return imgFilosofo3;
            case 3:
                return imgFilosofo4;
            case 4:
                return imgFilosofo5;
            default:
                return null;
        }
    }// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="-- Estados tenedoes --">  
    private void ocuparTenedor(int tenedorId) {
        getTenedor(tenedorId).setBackground(new Color(255, 0, 0));
    }

    private void liberarTenedor(int tenedorId) {
        getTenedor(tenedorId).setBackground(new Color(240, 240, 240));
    }

    private JPanel getTenedor(int tenedorId) {
        switch (tenedorId) {
            case 0:
                return tenedor1;
            case 1:
                return tenedor2;
            case 2:
                return tenedor3;
            case 3:
                return tenedor4;
            case 4:
                return tenedor5;
            default:
                return null;
        }
    }// </editor-fold> 

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIFilosofos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIFilosofos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReanudar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel imgFilosofo1;
    private javax.swing.JLabel imgFilosofo2;
    private javax.swing.JLabel imgFilosofo3;
    private javax.swing.JLabel imgFilosofo4;
    private javax.swing.JLabel imgFilosofo5;
    private javax.swing.JLabel lblTenedor1;
    private javax.swing.JLabel lblTenedor2;
    private javax.swing.JLabel lblTenedor3;
    private javax.swing.JLabel lblTenedor4;
    private javax.swing.JLabel lblTenedor5;
    private javax.swing.JPanel pnlContenedorGrafico;
    private javax.swing.JPanel pnlContenedorPaneles;
    private javax.swing.JPanel tenedor1;
    private javax.swing.JPanel tenedor2;
    private javax.swing.JPanel tenedor3;
    private javax.swing.JPanel tenedor4;
    private javax.swing.JPanel tenedor5;
    // End of variables declaration//GEN-END:variables
}
