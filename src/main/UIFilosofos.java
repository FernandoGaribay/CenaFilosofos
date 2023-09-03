package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static main.Estados.COMIENDO;
import static main.Estados.ESPERANDO;
import static main.Estados.PENSANDO;

public class UIFilosofos extends javax.swing.JFrame {

    private final ImageHandler objImagen;
    private final Mesa objMesa;
    private boolean pausa;

    public UIFilosofos() {
        initComponents();
        this.objMesa = new Mesa(this);
        this.pausa = false;
        this.objImagen = new ImageHandler("/imagenes/");

        imgFilosofo1.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo2.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo3.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo4.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
        imgFilosofo5.setIcon(objImagen.redimencionarImagen("pensando.png", new Dimension(60, 60)));
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
        pnlFilosofo1 = new javax.swing.JPanel();
        txtFilosofo1 = new javax.swing.JLabel();
        pnlFilosofo1Estados = new javax.swing.JPanel();
        pnlPensandoFilosofo1 = new javax.swing.JPanel();
        pnlEsperandoFilosofo1 = new javax.swing.JPanel();
        pnlComiendoFilosofo1 = new javax.swing.JPanel();
        scrollHistorialFilofoso1 = new javax.swing.JScrollPane();
        textHistorialFilofoso1 = new javax.swing.JTextArea();
        pnlFilosofo2 = new javax.swing.JPanel();
        txtFilosofo2 = new javax.swing.JLabel();
        pnlFilosofo1Estados1 = new javax.swing.JPanel();
        pnlPensandoFilosofo2 = new javax.swing.JPanel();
        pnlEsperandoFilosofo2 = new javax.swing.JPanel();
        pnlComiendoFilosofo2 = new javax.swing.JPanel();
        scrollHistorialFilofoso2 = new javax.swing.JScrollPane();
        textHistorialFilofoso2 = new javax.swing.JTextArea();
        pnlFilosofo3 = new javax.swing.JPanel();
        txtFilosofo3 = new javax.swing.JLabel();
        pnlFilosofo1Estados2 = new javax.swing.JPanel();
        pnlPensandoFilosofo3 = new javax.swing.JPanel();
        pnlEsperandoFilosofo3 = new javax.swing.JPanel();
        pnlComiendoFilosofo3 = new javax.swing.JPanel();
        scrollHistorialFilofoso3 = new javax.swing.JScrollPane();
        textHistorialFilofoso3 = new javax.swing.JTextArea();
        pnlFilosofo4 = new javax.swing.JPanel();
        txtFilosofo4 = new javax.swing.JLabel();
        pnlFilosofo1Estados3 = new javax.swing.JPanel();
        pnlPensandoFilosofo4 = new javax.swing.JPanel();
        pnlEsperandoFilosofo4 = new javax.swing.JPanel();
        pnlComiendoFilosofo4 = new javax.swing.JPanel();
        scrollHistorialFilofoso4 = new javax.swing.JScrollPane();
        textHistorialFilofoso4 = new javax.swing.JTextArea();
        pnlFilosofo5 = new javax.swing.JPanel();
        txtFilosofo5 = new javax.swing.JLabel();
        pnlFilosofo1Estados4 = new javax.swing.JPanel();
        pnlPensandoFilosofo5 = new javax.swing.JPanel();
        pnlEsperandoFilosofo5 = new javax.swing.JPanel();
        pnlComiendoFilosofo5 = new javax.swing.JPanel();
        scrollHistorialFilofoso5 = new javax.swing.JScrollPane();
        textHistorialFilofoso5 = new javax.swing.JTextArea();
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

        pnlFilosofo1.setBackground(new java.awt.Color(250, 250, 250));
        pnlFilosofo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFilosofo1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtFilosofo1.setText("Filosofo 1");
        pnlFilosofo1.add(txtFilosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 120, -1));

        pnlFilosofo1Estados.setLayout(new java.awt.GridLayout(3, 0, 0, 3));

        pnlPensandoFilosofo1.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnlPensandoFilosofo1Layout = new javax.swing.GroupLayout(pnlPensandoFilosofo1);
        pnlPensandoFilosofo1.setLayout(pnlPensandoFilosofo1Layout);
        pnlPensandoFilosofo1Layout.setHorizontalGroup(
            pnlPensandoFilosofo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlPensandoFilosofo1Layout.setVerticalGroup(
            pnlPensandoFilosofo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados.add(pnlPensandoFilosofo1);

        pnlEsperandoFilosofo1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlEsperandoFilosofo1Layout = new javax.swing.GroupLayout(pnlEsperandoFilosofo1);
        pnlEsperandoFilosofo1.setLayout(pnlEsperandoFilosofo1Layout);
        pnlEsperandoFilosofo1Layout.setHorizontalGroup(
            pnlEsperandoFilosofo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlEsperandoFilosofo1Layout.setVerticalGroup(
            pnlEsperandoFilosofo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados.add(pnlEsperandoFilosofo1);

        pnlComiendoFilosofo1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlComiendoFilosofo1Layout = new javax.swing.GroupLayout(pnlComiendoFilosofo1);
        pnlComiendoFilosofo1.setLayout(pnlComiendoFilosofo1Layout);
        pnlComiendoFilosofo1Layout.setHorizontalGroup(
            pnlComiendoFilosofo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlComiendoFilosofo1Layout.setVerticalGroup(
            pnlComiendoFilosofo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados.add(pnlComiendoFilosofo1);

        pnlFilosofo1.add(pnlFilosofo1Estados, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 32, -1, 55));

        scrollHistorialFilofoso1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textHistorialFilofoso1.setEditable(false);
        textHistorialFilofoso1.setBackground(new java.awt.Color(255, 255, 255));
        textHistorialFilofoso1.setColumns(20);
        textHistorialFilofoso1.setRows(5);
        scrollHistorialFilofoso1.setViewportView(textHistorialFilofoso1);

        pnlFilosofo1.add(scrollHistorialFilofoso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 250, 55));

        pnlContenedorPaneles.add(pnlFilosofo1);

        pnlFilosofo2.setBackground(new java.awt.Color(250, 250, 250));
        pnlFilosofo2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFilosofo2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtFilosofo2.setText("Filosofo 2");
        pnlFilosofo2.add(txtFilosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 120, -1));

        pnlFilosofo1Estados1.setLayout(new java.awt.GridLayout(3, 0, 0, 3));

        pnlPensandoFilosofo2.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnlPensandoFilosofo2Layout = new javax.swing.GroupLayout(pnlPensandoFilosofo2);
        pnlPensandoFilosofo2.setLayout(pnlPensandoFilosofo2Layout);
        pnlPensandoFilosofo2Layout.setHorizontalGroup(
            pnlPensandoFilosofo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlPensandoFilosofo2Layout.setVerticalGroup(
            pnlPensandoFilosofo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados1.add(pnlPensandoFilosofo2);

        pnlEsperandoFilosofo2.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlEsperandoFilosofo2Layout = new javax.swing.GroupLayout(pnlEsperandoFilosofo2);
        pnlEsperandoFilosofo2.setLayout(pnlEsperandoFilosofo2Layout);
        pnlEsperandoFilosofo2Layout.setHorizontalGroup(
            pnlEsperandoFilosofo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlEsperandoFilosofo2Layout.setVerticalGroup(
            pnlEsperandoFilosofo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados1.add(pnlEsperandoFilosofo2);

        pnlComiendoFilosofo2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlComiendoFilosofo2Layout = new javax.swing.GroupLayout(pnlComiendoFilosofo2);
        pnlComiendoFilosofo2.setLayout(pnlComiendoFilosofo2Layout);
        pnlComiendoFilosofo2Layout.setHorizontalGroup(
            pnlComiendoFilosofo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlComiendoFilosofo2Layout.setVerticalGroup(
            pnlComiendoFilosofo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados1.add(pnlComiendoFilosofo2);

        pnlFilosofo2.add(pnlFilosofo1Estados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 32, -1, 55));

        scrollHistorialFilofoso2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textHistorialFilofoso2.setEditable(false);
        textHistorialFilofoso2.setBackground(new java.awt.Color(255, 255, 255));
        textHistorialFilofoso2.setColumns(20);
        textHistorialFilofoso2.setRows(5);
        scrollHistorialFilofoso2.setViewportView(textHistorialFilofoso2);

        pnlFilosofo2.add(scrollHistorialFilofoso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 250, 55));

        pnlContenedorPaneles.add(pnlFilosofo2);

        pnlFilosofo3.setBackground(new java.awt.Color(250, 250, 250));
        pnlFilosofo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFilosofo3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtFilosofo3.setText("Filosofo 3");
        pnlFilosofo3.add(txtFilosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 120, -1));

        pnlFilosofo1Estados2.setLayout(new java.awt.GridLayout(3, 0, 0, 3));

        pnlPensandoFilosofo3.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnlPensandoFilosofo3Layout = new javax.swing.GroupLayout(pnlPensandoFilosofo3);
        pnlPensandoFilosofo3.setLayout(pnlPensandoFilosofo3Layout);
        pnlPensandoFilosofo3Layout.setHorizontalGroup(
            pnlPensandoFilosofo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlPensandoFilosofo3Layout.setVerticalGroup(
            pnlPensandoFilosofo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados2.add(pnlPensandoFilosofo3);

        pnlEsperandoFilosofo3.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlEsperandoFilosofo3Layout = new javax.swing.GroupLayout(pnlEsperandoFilosofo3);
        pnlEsperandoFilosofo3.setLayout(pnlEsperandoFilosofo3Layout);
        pnlEsperandoFilosofo3Layout.setHorizontalGroup(
            pnlEsperandoFilosofo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlEsperandoFilosofo3Layout.setVerticalGroup(
            pnlEsperandoFilosofo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados2.add(pnlEsperandoFilosofo3);

        pnlComiendoFilosofo3.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlComiendoFilosofo3Layout = new javax.swing.GroupLayout(pnlComiendoFilosofo3);
        pnlComiendoFilosofo3.setLayout(pnlComiendoFilosofo3Layout);
        pnlComiendoFilosofo3Layout.setHorizontalGroup(
            pnlComiendoFilosofo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlComiendoFilosofo3Layout.setVerticalGroup(
            pnlComiendoFilosofo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados2.add(pnlComiendoFilosofo3);

        pnlFilosofo3.add(pnlFilosofo1Estados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 32, -1, 55));

        scrollHistorialFilofoso3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textHistorialFilofoso3.setEditable(false);
        textHistorialFilofoso3.setBackground(new java.awt.Color(255, 255, 255));
        textHistorialFilofoso3.setColumns(20);
        textHistorialFilofoso3.setRows(5);
        scrollHistorialFilofoso3.setViewportView(textHistorialFilofoso3);

        pnlFilosofo3.add(scrollHistorialFilofoso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 250, 55));

        pnlContenedorPaneles.add(pnlFilosofo3);

        pnlFilosofo4.setBackground(new java.awt.Color(250, 250, 250));
        pnlFilosofo4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFilosofo4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtFilosofo4.setText("Filosofo 4");
        pnlFilosofo4.add(txtFilosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 120, -1));

        pnlFilosofo1Estados3.setLayout(new java.awt.GridLayout(3, 0, 0, 3));

        pnlPensandoFilosofo4.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnlPensandoFilosofo4Layout = new javax.swing.GroupLayout(pnlPensandoFilosofo4);
        pnlPensandoFilosofo4.setLayout(pnlPensandoFilosofo4Layout);
        pnlPensandoFilosofo4Layout.setHorizontalGroup(
            pnlPensandoFilosofo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlPensandoFilosofo4Layout.setVerticalGroup(
            pnlPensandoFilosofo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados3.add(pnlPensandoFilosofo4);

        pnlEsperandoFilosofo4.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlEsperandoFilosofo4Layout = new javax.swing.GroupLayout(pnlEsperandoFilosofo4);
        pnlEsperandoFilosofo4.setLayout(pnlEsperandoFilosofo4Layout);
        pnlEsperandoFilosofo4Layout.setHorizontalGroup(
            pnlEsperandoFilosofo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlEsperandoFilosofo4Layout.setVerticalGroup(
            pnlEsperandoFilosofo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados3.add(pnlEsperandoFilosofo4);

        pnlComiendoFilosofo4.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlComiendoFilosofo4Layout = new javax.swing.GroupLayout(pnlComiendoFilosofo4);
        pnlComiendoFilosofo4.setLayout(pnlComiendoFilosofo4Layout);
        pnlComiendoFilosofo4Layout.setHorizontalGroup(
            pnlComiendoFilosofo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlComiendoFilosofo4Layout.setVerticalGroup(
            pnlComiendoFilosofo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados3.add(pnlComiendoFilosofo4);

        pnlFilosofo4.add(pnlFilosofo1Estados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 32, -1, 55));

        scrollHistorialFilofoso4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textHistorialFilofoso4.setEditable(false);
        textHistorialFilofoso4.setBackground(new java.awt.Color(255, 255, 255));
        textHistorialFilofoso4.setColumns(20);
        textHistorialFilofoso4.setRows(5);
        scrollHistorialFilofoso4.setViewportView(textHistorialFilofoso4);

        pnlFilosofo4.add(scrollHistorialFilofoso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 250, 55));

        pnlContenedorPaneles.add(pnlFilosofo4);

        pnlFilosofo5.setBackground(new java.awt.Color(250, 250, 250));
        pnlFilosofo5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFilosofo5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtFilosofo5.setText("Filosofo 5");
        pnlFilosofo5.add(txtFilosofo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 120, -1));

        pnlFilosofo1Estados4.setLayout(new java.awt.GridLayout(3, 0, 0, 3));

        pnlPensandoFilosofo5.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnlPensandoFilosofo5Layout = new javax.swing.GroupLayout(pnlPensandoFilosofo5);
        pnlPensandoFilosofo5.setLayout(pnlPensandoFilosofo5Layout);
        pnlPensandoFilosofo5Layout.setHorizontalGroup(
            pnlPensandoFilosofo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlPensandoFilosofo5Layout.setVerticalGroup(
            pnlPensandoFilosofo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados4.add(pnlPensandoFilosofo5);

        pnlEsperandoFilosofo5.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlEsperandoFilosofo5Layout = new javax.swing.GroupLayout(pnlEsperandoFilosofo5);
        pnlEsperandoFilosofo5.setLayout(pnlEsperandoFilosofo5Layout);
        pnlEsperandoFilosofo5Layout.setHorizontalGroup(
            pnlEsperandoFilosofo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlEsperandoFilosofo5Layout.setVerticalGroup(
            pnlEsperandoFilosofo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados4.add(pnlEsperandoFilosofo5);

        pnlComiendoFilosofo5.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout pnlComiendoFilosofo5Layout = new javax.swing.GroupLayout(pnlComiendoFilosofo5);
        pnlComiendoFilosofo5.setLayout(pnlComiendoFilosofo5Layout);
        pnlComiendoFilosofo5Layout.setHorizontalGroup(
            pnlComiendoFilosofo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        pnlComiendoFilosofo5Layout.setVerticalGroup(
            pnlComiendoFilosofo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        pnlFilosofo1Estados4.add(pnlComiendoFilosofo5);

        pnlFilosofo5.add(pnlFilosofo1Estados4, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 32, -1, 55));

        scrollHistorialFilofoso5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textHistorialFilofoso5.setEditable(false);
        textHistorialFilofoso5.setBackground(new java.awt.Color(255, 255, 255));
        textHistorialFilofoso5.setColumns(20);
        textHistorialFilofoso5.setRows(5);
        scrollHistorialFilofoso5.setViewportView(textHistorialFilofoso5);

        pnlFilosofo5.add(scrollHistorialFilofoso5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, 250, 55));

        pnlContenedorPaneles.add(pnlFilosofo5);

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
        objMesa.iniciar();
        btnReiniciar.setEnabled(false);
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        this.pausa = true;
        objMesa.pausarFilosofos(true);
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnReanudarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReanudarActionPerformed
        this.pausa = false;
        objMesa.pausarFilosofos(false);
    }//GEN-LAST:event_btnReanudarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    public void actualizarUI(Estados[] filosofos, Estados[] tenedores) {
        for (int i = 0; i < 5; i++) {

            switch (filosofos[i]) {
                case COMIENDO ->
                    comerFilosofo(i);
                case ESPERANDO ->
                    esperarFilosofo(i);
                case PENSANDO ->
                    pensarFilosofo(i);
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

    // <editor-fold defaultstate="collapsed" desc="-- Colores estados --">  
    public Color Frojo() {
        return new Color(255, 0, 0);
    }

    public Color Brojo() {
        return new Color(255, 204, 204);
    }

    public Color Famarillo() {
        return new Color(255, 255, 0);
    }

    public Color Bamarillo() {
        return new Color(255, 255, 204);
    }

    public Color Fverde() {
        return new Color(0, 255, 0);
    }

    public Color Bverde() {
        return new Color(204, 255, 204);
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
    private javax.swing.JPanel pnlComiendoFilosofo1;
    private javax.swing.JPanel pnlComiendoFilosofo2;
    private javax.swing.JPanel pnlComiendoFilosofo3;
    private javax.swing.JPanel pnlComiendoFilosofo4;
    private javax.swing.JPanel pnlComiendoFilosofo5;
    private javax.swing.JPanel pnlContenedorGrafico;
    private javax.swing.JPanel pnlContenedorPaneles;
    private javax.swing.JPanel pnlEsperandoFilosofo1;
    private javax.swing.JPanel pnlEsperandoFilosofo2;
    private javax.swing.JPanel pnlEsperandoFilosofo3;
    private javax.swing.JPanel pnlEsperandoFilosofo4;
    private javax.swing.JPanel pnlEsperandoFilosofo5;
    private javax.swing.JPanel pnlFilosofo1;
    private javax.swing.JPanel pnlFilosofo1Estados;
    private javax.swing.JPanel pnlFilosofo1Estados1;
    private javax.swing.JPanel pnlFilosofo1Estados2;
    private javax.swing.JPanel pnlFilosofo1Estados3;
    private javax.swing.JPanel pnlFilosofo1Estados4;
    private javax.swing.JPanel pnlFilosofo2;
    private javax.swing.JPanel pnlFilosofo3;
    private javax.swing.JPanel pnlFilosofo4;
    private javax.swing.JPanel pnlFilosofo5;
    private javax.swing.JPanel pnlPensandoFilosofo1;
    private javax.swing.JPanel pnlPensandoFilosofo2;
    private javax.swing.JPanel pnlPensandoFilosofo3;
    private javax.swing.JPanel pnlPensandoFilosofo4;
    private javax.swing.JPanel pnlPensandoFilosofo5;
    private javax.swing.JScrollPane scrollHistorialFilofoso1;
    private javax.swing.JScrollPane scrollHistorialFilofoso2;
    private javax.swing.JScrollPane scrollHistorialFilofoso3;
    private javax.swing.JScrollPane scrollHistorialFilofoso4;
    private javax.swing.JScrollPane scrollHistorialFilofoso5;
    private javax.swing.JPanel tenedor1;
    private javax.swing.JPanel tenedor2;
    private javax.swing.JPanel tenedor3;
    private javax.swing.JPanel tenedor4;
    private javax.swing.JPanel tenedor5;
    private javax.swing.JTextArea textHistorialFilofoso1;
    private javax.swing.JTextArea textHistorialFilofoso2;
    private javax.swing.JTextArea textHistorialFilofoso3;
    private javax.swing.JTextArea textHistorialFilofoso4;
    private javax.swing.JTextArea textHistorialFilofoso5;
    private javax.swing.JLabel txtFilosofo1;
    private javax.swing.JLabel txtFilosofo2;
    private javax.swing.JLabel txtFilosofo3;
    private javax.swing.JLabel txtFilosofo4;
    private javax.swing.JLabel txtFilosofo5;
    // End of variables declaration//GEN-END:variables
}
