package main;

import java.awt.Color;
import java.awt.Dimension;

public class UIFilosofos extends javax.swing.JFrame {

    private ImageHandler objImagen;
    private Mesa objMesa;

    public UIFilosofos() {
        initComponents();
        objMesa = new Mesa(this);
        objImagen = new ImageHandler("/imagenes/");
        objMesa.iniciar();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenedor1.setBackground(new java.awt.Color(240, 240, 240));
        tenedor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("[1]");
        tenedor1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 75, -1, 30));

        tenedor2.setBackground(new java.awt.Color(240, 240, 240));
        tenedor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("[2]");
        tenedor2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 170, 30, 30));

        tenedor3.setBackground(new java.awt.Color(240, 240, 240));
        tenedor3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("[3]");
        tenedor3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 30, 30));

        tenedor4.setBackground(new java.awt.Color(240, 240, 240));
        tenedor4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("[4]");
        tenedor4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 30, 30));

        tenedor5.setBackground(new java.awt.Color(240, 240, 240));
        tenedor5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("[5]");
        tenedor5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel2.add(tenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 170, 30, 30));
        jPanel2.add(imgFilosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 60, 60));
        jPanel2.add(imgFilosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 60, 60));
        jPanel2.add(imgFilosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 60, 60));
        jPanel2.add(imgFilosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 60, 60));
        jPanel2.add(imgFilosofo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 60, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void actualizarUI() {
        pensarFilosofo1();
        pensarFilosofo2();
        pensarFilosofo3();
        pensarFilosofo4();
        pensarFilosofo5();

        if (objMesa.isFilosofoComiendo(0)) {
            comerFilosofo1();
        }
        if (objMesa.isFilosofoComiendo(1)) {
            comerFilosofo2();
        }
        if (objMesa.isFilosofoComiendo(2)) {
            comerFilosofo3();
        }
        if (objMesa.isFilosofoComiendo(3)) {
            comerFilosofo4();
        }
        if (objMesa.isFilosofoComiendo(4)) {
            comerFilosofo5();
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

    public void comerFilosofo1() {
        imgFilosofo1.setIcon(objImagen.redimencionarImagen("comiendo.png", new Dimension(60, 60)));
        ocuparTenedor1();
        ocuparTenedor2();
    }

    public void pensarFilosofo1() {
        imgFilosofo1.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        liberarTenedor1();
        liberarTenedor2();
    }

    public void comerFilosofo2() {
        imgFilosofo2.setIcon(objImagen.redimencionarImagen("comiendo.png", new Dimension(60, 60)));
        ocuparTenedor2();
        ocuparTenedor3();
    }

    public void pensarFilosofo2() {
        imgFilosofo2.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        liberarTenedor2();
        liberarTenedor3();
    }

    public void comerFilosofo3() {
        imgFilosofo3.setIcon(objImagen.redimencionarImagen("comiendo.png", new Dimension(60, 60)));
        ocuparTenedor3();
        ocuparTenedor4();
    }

    public void pensarFilosofo3() {
        imgFilosofo3.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        liberarTenedor3();
        liberarTenedor4();
    }

    public void comerFilosofo4() {
        imgFilosofo4.setIcon(objImagen.redimencionarImagen("comiendo.png", new Dimension(60, 60)));
        ocuparTenedor4();
        ocuparTenedor5();
    }

    public void pensarFilosofo4() {
        imgFilosofo4.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        liberarTenedor4();
        liberarTenedor5();
    }

    public void comerFilosofo5() {
        imgFilosofo5.setIcon(objImagen.redimencionarImagen("comiendo.png", new Dimension(60, 60)));
        ocuparTenedor5();
        ocuparTenedor1();
    }

    public void pensarFilosofo5() {
        imgFilosofo5.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        liberarTenedor5();
        liberarTenedor1();
    }

    private void ocuparTenedor1() {
        tenedor1.setBackground(new Color(255, 0, 0));
    }

    private void liberarTenedor1() {
        tenedor1.setBackground(new Color(240, 240, 240));
    }

    private void ocuparTenedor2() {
        tenedor2.setBackground(new Color(255, 0, 0));
    }

    private void liberarTenedor2() {
        tenedor2.setBackground(new Color(240, 240, 240));
    }

    private void ocuparTenedor3() {
        tenedor3.setBackground(new Color(255, 0, 0));
    }

    private void liberarTenedor3() {
        tenedor3.setBackground(new Color(240, 240, 240));
    }

    private void ocuparTenedor4() {
        tenedor4.setBackground(new Color(255, 0, 0));
    }

    private void liberarTenedor4() {
        tenedor4.setBackground(new Color(240, 240, 240));
    }

    private void ocuparTenedor5() {
        tenedor5.setBackground(new Color(255, 0, 0));
    }

    private void liberarTenedor5() {
        tenedor5.setBackground(new Color(240, 240, 240));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgFilosofo1;
    private javax.swing.JLabel imgFilosofo2;
    private javax.swing.JLabel imgFilosofo3;
    private javax.swing.JLabel imgFilosofo4;
    private javax.swing.JLabel imgFilosofo5;
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