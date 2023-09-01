package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UIFilosofos extends javax.swing.JFrame {

    private final ImageHandler objImagen;
    private final Mesa objMesa;
    private static boolean[] tenedores;
    private static boolean[] filosofos;

    public UIFilosofos() {
        initComponents();
        objMesa = new Mesa(this);
        objImagen = new ImageHandler("/imagenes/");
        tenedores = new boolean[5];
        filosofos = new boolean[5];

        for (int i = 0; i < 5; i++) {
            tenedores[i] = false;
            filosofos[i] = false;
        }

        imgFilosofo1.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo2.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo3.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo4.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo5.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tenedor1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tenedor2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tenedor3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tenedor4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tenedor5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        imgFilosofo1 = new javax.swing.JLabel();
        imgFilosofo2 = new javax.swing.JLabel();
        imgFilosofo3 = new javax.swing.JLabel();
        imgFilosofo4 = new javax.swing.JLabel();
        imgFilosofo5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenedor1.setBackground(new java.awt.Color(240, 240, 240));
        tenedor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[1]");
        tenedor1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 30));

        tenedor2.setBackground(new java.awt.Color(240, 240, 240));
        tenedor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("[2]");
        tenedor2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 30, 30));

        tenedor3.setBackground(new java.awt.Color(240, 240, 240));
        tenedor3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("[3]");
        tenedor3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 30, 30));

        tenedor4.setBackground(new java.awt.Color(240, 240, 240));
        tenedor4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("[4]");
        tenedor4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 30, 30));

        tenedor5.setBackground(new java.awt.Color(240, 240, 240));
        tenedor5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("[5]");
        tenedor5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 30, 30));
        jPanel2.add(imgFilosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 60, 60));
        jPanel2.add(imgFilosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 60, 60));
        jPanel2.add(imgFilosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 60, 60));
        jPanel2.add(imgFilosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 60, 60));
        jPanel2.add(imgFilosofo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 450, 390));

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        objMesa.iniciar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void actualizarUI() {
        for (int i = 0; i < 5; i++) {
            if (objMesa.isFilosofoComiendo(i)) {
                filosofos[i] = true;
            } else {
                filosofos[i] = false;
            }

            if (objMesa.isTenedorUsando(i)) {
                tenedores[i] = true;
            } else {
                tenedores[i] = false;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (tenedores[i]) {
                ocuparTenedor(i);
            } else {
                liberarTenedor(i);
            }

            if (filosofos[i]) {
                comerFilosofo(i);
            } else {
                pensarFilosofo(i);
            }
        }
    }

    private void comerFilosofo(int filosofoId) {
        getImagenFilosofo(filosofoId).setIcon(objImagen.redimencionarImagen("comiendo.png", new Dimension(60, 60)));
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
    }

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
    }

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
    private javax.swing.JLabel imgFilosofo1;
    private javax.swing.JLabel imgFilosofo2;
    private javax.swing.JLabel imgFilosofo3;
    private javax.swing.JLabel imgFilosofo4;
    private javax.swing.JLabel imgFilosofo5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel tenedor1;
    private javax.swing.JPanel tenedor2;
    private javax.swing.JPanel tenedor3;
    private javax.swing.JPanel tenedor4;
    private javax.swing.JPanel tenedor5;
    // End of variables declaration//GEN-END:variables
}
