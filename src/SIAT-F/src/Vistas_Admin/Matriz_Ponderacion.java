package Vistas_Admin;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Matriz_Ponderacion extends javax.swing.JFrame {

    public Matriz_Ponderacion() {
        initComponents();
        jBMatriz.setVisible(false);
        jBMonteCarlo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLateral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBPedidos = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBMatriz = new javax.swing.JButton();
        jBMonteCarlo = new javax.swing.JButton();
        jBUsuarios = new javax.swing.JButton();
        jBModelos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBAgregarCriterio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNombreDecision = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFPorcentaje = new javax.swing.JTextField();
        jTFCriterio = new javax.swing.JTextField();
        jTFAlternativa = new javax.swing.JTextField();
        jBAgregarAlternativa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDecision = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePonderada = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCBCriterios = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jCBAlternativas = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTFCalificacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jBCalcular = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jBAgregarCalificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jPanelLateral.setBackground(new java.awt.Color(10, 61, 98));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono usuario.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        jBInicio.setForeground(new java.awt.Color(255, 255, 255));
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono inicio.png"))); // NOI18N
        jBInicio.setText("   Inicio");
        jBInicio.setActionCommand("    Inicio");
        jBInicio.setBorderPainted(false);
        jBInicio.setContentAreaFilled(false);
        jBInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBInicio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jBProductos.setBackground(new java.awt.Color(255, 255, 255));
        jBProductos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jBProductos.setForeground(new java.awt.Color(255, 255, 255));
        jBProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono productos.png"))); // NOI18N
        jBProductos.setText("   Productos");
        jBProductos.setBorderPainted(false);
        jBProductos.setContentAreaFilled(false);
        jBProductos.setDefaultCapable(false);
        jBProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProductosActionPerformed(evt);
            }
        });

        jBClientes.setBackground(new java.awt.Color(255, 255, 255));
        jBClientes.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jBClientes.setForeground(new java.awt.Color(255, 255, 255));
        jBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono cliente.png"))); // NOI18N
        jBClientes.setText("   Clientes");
        jBClientes.setBorderPainted(false);
        jBClientes.setContentAreaFilled(false);
        jBClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientesActionPerformed(evt);
            }
        });

        jBPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jBPedidos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jBPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jBPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono pedido.png"))); // NOI18N
        jBPedidos.setText("   Pedidos");
        jBPedidos.setBorderPainted(false);
        jBPedidos.setContentAreaFilled(false);
        jBPedidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPedidosActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono salir.png"))); // NOI18N
        jBSalir.setText("   Salir");
        jBSalir.setToolTipText("");
        jBSalir.setBorderPainted(false);
        jBSalir.setContentAreaFilled(false);
        jBSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBMatriz.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jBMatriz.setForeground(new java.awt.Color(255, 255, 255));
        jBMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triangulo.png"))); // NOI18N
        jBMatriz.setText("Matriz de Ponderación");
        jBMatriz.setBorderPainted(false);
        jBMatriz.setContentAreaFilled(false);
        jBMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMatrizActionPerformed(evt);
            }
        });

        jBMonteCarlo.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jBMonteCarlo.setForeground(new java.awt.Color(255, 255, 255));
        jBMonteCarlo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triangulo.png"))); // NOI18N
        jBMonteCarlo.setText("Simulación Monte Carlo");
        jBMonteCarlo.setBorderPainted(false);
        jBMonteCarlo.setContentAreaFilled(false);
        jBMonteCarlo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMonteCarloActionPerformed(evt);
            }
        });

        jBUsuarios.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jBUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jBUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minicono usuario.png"))); // NOI18N
        jBUsuarios.setText("   Usuarios");
        jBUsuarios.setBorderPainted(false);
        jBUsuarios.setContentAreaFilled(false);
        jBUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUsuariosActionPerformed(evt);
            }
        });

        jBModelos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jBModelos.setForeground(new java.awt.Color(255, 255, 255));
        jBModelos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono decision.png"))); // NOI18N
        jBModelos.setText("   Modelos de decision");
        jBModelos.setBorderPainted(false);
        jBModelos.setContentAreaFilled(false);
        jBModelos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBModelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModelosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLateralLayout = new javax.swing.GroupLayout(jPanelLateral);
        jPanelLateral.setLayout(jPanelLateralLayout);
        jPanelLateralLayout.setHorizontalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLateralLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLateralLayout.createSequentialGroup()
                        .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBMatriz)
                            .addComponent(jBMonteCarlo))
                        .addGap(1, 1, 1))
                    .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBModelos)))
                .addGap(16, 16, 16))
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLateralLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLateralLayout.setVerticalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jBUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMonteCarlo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 98));
        jLabel1.setText("Matriz de Ponderación");

        jBAgregarCriterio.setBackground(new java.awt.Color(10, 61, 98));
        jBAgregarCriterio.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBAgregarCriterio.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregarCriterio.setText("Agregar Criterio");
        jBAgregarCriterio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarCriterioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 61, 98));
        jLabel5.setText("Nombre de la decisión:");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 61, 98));
        jLabel6.setText("Criterio");

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 61, 98));
        jLabel7.setText("Alternativa");

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 61, 98));
        jLabel8.setText("Porcentaje");

        jBAgregarAlternativa.setBackground(new java.awt.Color(10, 61, 98));
        jBAgregarAlternativa.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBAgregarAlternativa.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregarAlternativa.setText("Agregar Alternativa");
        jBAgregarAlternativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarAlternativaActionPerformed(evt);
            }
        });

        jTableDecision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDecision);

        jTablePonderada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTablePonderada);

        jPanel2.setBackground(new java.awt.Color(10, 61, 98));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Matriz de Decisión");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 61, 98));
        jLabel9.setText("Criterios");

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(10, 61, 98));
        jLabel10.setText("Alternativas");

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(10, 61, 98));
        jLabel11.setText("Calificación");

        jPanel4.setBackground(new java.awt.Color(10, 61, 98));

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Matriz Ponderada");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jBCalcular.setBackground(new java.awt.Color(10, 61, 98));
        jBCalcular.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jScrollPane3.setViewportView(jTAResultado);

        jBAgregarCalificacion.setBackground(new java.awt.Color(10, 61, 98));
        jBAgregarCalificacion.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBAgregarCalificacion.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregarCalificacion.setText("Agregar Calificación");
        jBAgregarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarCalificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(197, 197, 197)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jBCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTFNombreDecision, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTFCriterio))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTFAlternativa)))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jBAgregarAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jBAgregarCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(1, 1, 1)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jCBCriterios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jCBAlternativas, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTFCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jBAgregarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 32, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNombreDecision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jTFPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregarCriterio)
                    .addComponent(jTFCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFAlternativa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAgregarAlternativa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jCBAlternativas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTFCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAgregarCalificacion))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1213, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private List<String> criterios = new ArrayList<>(); //listas de mis valores /criterios, procentajes y categorias)
    private List<Double> porcentajes = new ArrayList<>();
    private List<String> alternativas = new ArrayList<>();

    private Double[][] calificaciones = null;

    private DefaultTableModel modeloDecision; //Tabla principal
    private DefaultTableModel modeloPonderada; //Tabla ponderada

    private void actualizarTablaDecision() {
        int filas = criterios.size(); //cuantas filas y columnas tendra la tabla
        int cols = alternativas.size();

        // Respaldar valores, es decir, guarda los valores existentes
        Double[][] viejo = calificaciones;
        calificaciones = new Double[filas][cols];
        if (viejo != null) {
            for (int i = 0; i < Math.min(viejo.length, filas); i++) {
                for (int j = 0; j < Math.min(viejo[i].length, cols); j++) {
                    calificaciones[i][j] = viejo[i][j];
                }
            }
        }

        //Se crea el modelo
        Object[] colNames = new Object[cols + 2];
        colNames[0] = "Criterio"; //encabezados
        colNames[1] = "Porcentaje";
        for (int j = 0; j < cols; j++) {
            colNames[j + 2] = alternativas.get(j);
        }

        //se crea la tabla y evita que la tabla se pueda editar
        modeloDecision = new DefaultTableModel(colNames, 0) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        //se añaden las filas y se rellena la tabla con los datos
        for (int i = 0; i < filas; i++) {
            Object[] fila = new Object[cols + 2];
            fila[0] = criterios.get(i);
            fila[1] = String.format("%.0f%%", porcentajes.get(i));

            for (int j = 0; j < cols; j++) {
                Double val = calificaciones[i][j];
                fila[j + 2] = (val == null ? "" : val);
            }

            modeloDecision.addRow(fila);
        }

        // Fila total porcentajes
        Object[] total = new Object[cols + 2];
        total[0] = "TOTAL";
        total[1] = String.format("%.0f%%", porcentajes.stream().mapToDouble(d -> d).sum());
        modeloDecision.addRow(total);

        jTableDecision.setModel(modeloDecision);
        actualizarCombos();
    }

    private void actualizarCombos() {
        jCBCriterios.removeAllItems(); //Por cada criterio y alternativa agregada, se van mostrando en su respectivo combo box
        for (String c : criterios) {
            jCBCriterios.addItem(c);
        }

        jCBAlternativas.removeAllItems();
        for (String a : alternativas) {
            jCBAlternativas.addItem(a);
        }
    }


    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        new Inicio_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductosActionPerformed
        new Productos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBProductosActionPerformed

    private void jBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientesActionPerformed
        new Clientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBClientesActionPerformed

    private void jBPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPedidosActionPerformed
        new Pedidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBPedidosActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatrizActionPerformed
        new Matriz_Ponderacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBMatrizActionPerformed

    private void jBMonteCarloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMonteCarloActionPerformed
        new MonteCarlo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBMonteCarloActionPerformed

    private void jBModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModelosActionPerformed
        jBMatriz.setVisible(true);
        jBMonteCarlo.setVisible(true);
    }//GEN-LAST:event_jBModelosActionPerformed

    private void jBAgregarCriterioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarCriterioActionPerformed
        agregarCriterio();
    }//GEN-LAST:event_jBAgregarCriterioActionPerformed

    private void agregarCriterio() {
        String crit = jTFCriterio.getText().trim(); 
        String porcTxt = jTFPorcentaje.getText().trim();

        if (crit.isEmpty()) { //Que no este vacio el campo de criterio
            JOptionPane.showMessageDialog(this, "Escribe un criterio.");
            return;
        }

        double porc;
        try { //que escriba un porcentaje en tipo numerico y no otro tipo de dato
            porc = Double.parseDouble(porcTxt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Porcentaje inválido.");
            return;
        }

        if (porc < 1 || porc > 99) { //valida que el porcentaje no sea menos a 1 ni mayor a 99. Pues si coloca 100, solo compararia un solo criterio
            JOptionPane.showMessageDialog(this, "El porcentaje debe estar entre 1 y 99.");
            return;
        }

        double suma = porcentajes.stream().mapToDouble(d -> d).sum() + porc;  
        if (suma > 100) { //valida que con base a los anteriores criterios y sus porcentajes, el nuevo a agregar no exceda ek 100%
            JOptionPane.showMessageDialog(this, "La suma NO puede exceder 100%.");
            return;
        }

        criterios.add(crit);
        porcentajes.add(porc);

        actualizarTablaDecision();
        jTFCriterio.setText("");
        jTFPorcentaje.setText("");
    }

    private void jBAgregarAlternativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarAlternativaActionPerformed
        agregarAlternativa();
    }//GEN-LAST:event_jBAgregarAlternativaActionPerformed

    private void agregarAlternativa() {
        String alt = jTFAlternativa.getText().trim();
        if (alt.isEmpty()) { //valida que no este vacio el campo de alternativa
            JOptionPane.showMessageDialog(this, "Escribe una alternativa.");
            return;
        }
        if (alternativas.contains(alt)) { //valida que no este repetida
            JOptionPane.showMessageDialog(this, "Ya existe.");
            return;
        }

        alternativas.add(alt);
        actualizarTablaDecision();
        jTFAlternativa.setText("");

    }

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // Validar que existan criterios y alternativas
        if (criterios.isEmpty() || alternativas.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Debes agregar criterios y alternativas antes de calcular.",
                    "Faltan datos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar que la tabla de calificaciones exista
        if (calificaciones == null) {
            JOptionPane.showMessageDialog(this,
                    "Aún no hay calificaciones registradas.",
                    "Faltan datos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar que todo esté llenado
        for (int i = 0; i < criterios.size(); i++) {
            for (int j = 0; j < alternativas.size(); j++) {
                if (calificaciones[i][j] == null) {
                    JOptionPane.showMessageDialog(this,
                            "Falta calificar la alternativa '" + alternativas.get(j)
                            + "' en el criterio '" + criterios.get(i) + "'.",
                            "Faltan calificaciones",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        }

        //Validar que la suma de los porcentajes sea EXACTAMENTE 100, si no, no se puede hacer el calculo
        double sumaPorcentajes = 0;

        for (double p : porcentajes) {
            sumaPorcentajes += p;
        }

        if (sumaPorcentajes != 100) {
            JOptionPane.showMessageDialog(this,
                    "La suma de los porcentajes debe ser exactamente 100%.\nActualmente: "
                    + sumaPorcentajes + "%",
                    "Porcentaje incompleto",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Una vez que se valida todo lo anterior, ya se genera la tabla ponderada
        int filas = criterios.size();
        int cols = alternativas.size();

        Object[] colNames = new Object[cols + 1];
        colNames[0] = "Criterio";
        for (int j = 0; j < cols; j++) {
            colNames[j + 1] = alternativas.get(j);
        }

        modeloPonderada = new DefaultTableModel(colNames, 0) {
            @Override
            public boolean isCellEditable(int a, int b) {
                return false;
            }
        };

        double[] totales = new double[cols];

        for (int i = 0; i < filas; i++) { 
            double peso = porcentajes.get(i) / 100.0;

            Object[] fila = new Object[cols + 1];
            fila[0] = criterios.get(i);

            for (int j = 0; j < cols; j++) {
                double score = peso * calificaciones[i][j]; //Calculo de cada ponderacion
                totales[j] += score; //se suman los totales por alternativa, para poder obtener la de calificacion mayor
                fila[j + 1] = String.format("%.2f", score);
            }

            modeloPonderada.addRow(fila);
        }

        //Se muestra la fila del Total con los resultados por alternativa
        Object[] total = new Object[cols + 1];
        total[0] = "TOTAL";
        for (int j = 0; j < cols; j++) {
            total[j + 1] = String.format("%.2f", totales[j]);
        }
        modeloPonderada.addRow(total);

        jTablePonderada.setModel(modeloPonderada);

        //SE determina la alternativa ganadora
        double mejorPuntaje = -1;
        String ganadora = "";

        for (int j = 0; j < cols; j++) {
            if (totales[j] > mejorPuntaje) { // la mayor es la que entra como la de mayor puntaje
                mejorPuntaje = totales[j];
                ganadora = alternativas.get(j);
            }
        }

        //El texto que saldra en el Text Area para indicar cual es la ganadora
        StringBuilder sb = new StringBuilder();
        sb.append("Alternativa ganadora: ").append(ganadora).append("\n");
        sb.append("Puntaje final: ").append(String.format("%.2f", mejorPuntaje)).append("\n\n");

        sb.append("Se determinó que '").append(ganadora)
                .append("' es la mejor alternativa porque obtuvo el puntaje ponderado más alto,\n")
                .append("considerando los criterios establecidos y sus porcentajes de importancia.\n\n");

        //Texto de lo que se recomienda
        sb.append("Recomendación:\n");

        if (mejorPuntaje >= 4) {
            sb.append("-La alternativa seleccionada muestra un desempeño notablemente superior.\n")
                    .append("   Se recomienda proceder con esta opción, ya que cumple de manera sólida\n")
                    .append("   con los criterios definidos.");
        } else if (mejorPuntaje >= 3) {
            sb.append("✔ La alternativa ganadora es adecuada, pero podría evaluarse más a fondo.\n")
                    .append("   Considera revisar criterios específicos donde otras alternativas estuvieron cerca.");
        } else {
            sb.append("Aunque esta alternativa es la mejor según la ponderación,\n")
                    .append("   los puntajes generales son bajos.\n")
                    .append("   Sería recomendable revisar los criterios o buscar más opciones antes de decidir.");
        }

        jTAResultado.setText(sb.toString()); //se muestra en el text Area
    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jBAgregarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarCalificacionActionPerformed
        agregarCalificacion();
    }//GEN-LAST:event_jBAgregarCalificacionActionPerformed

    private void jBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuariosActionPerformed
        new Agregar_Usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBUsuariosActionPerformed

    private void agregarCalificacion() {
        String crit = (String) jCBCriterios.getSelectedItem(); //dependiendo el criterio seleccionado
        String alt = (String) jCBAlternativas.getSelectedItem(); //y la alternativa seleccionada

        int i = criterios.indexOf(crit); //se localizan las pocisiones en las listas
        int j = alternativas.indexOf(alt); //se busca el indice del criterio y la alternativa

        double cal;
        try {
            cal = Double.parseDouble(jTFCalificacion.getText()); //se lee la calificacion
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Valor inválido.");
            return;
        }

        if (cal < 1 || cal > 10) { //si la calificacion esta dentro del rango (1 a 10), deja guardarla
            JOptionPane.showMessageDialog(this, "La calificacion debe ser entre 1 y 10.");
            return;
        }

        calificaciones[i][j] = cal; //guarda la calificacion en el indice correspondiente
        modeloDecision.setValueAt(cal, i, j + 2);
        jTFCalificacion.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matriz_Ponderacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregarAlternativa;
    private javax.swing.JButton jBAgregarCalificacion;
    private javax.swing.JButton jBAgregarCriterio;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBMatriz;
    private javax.swing.JButton jBModelos;
    private javax.swing.JButton jBMonteCarlo;
    private javax.swing.JButton jBPedidos;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBUsuarios;
    private javax.swing.JComboBox<String> jCBAlternativas;
    private javax.swing.JComboBox<String> jCBCriterios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTAResultado;
    private javax.swing.JTextField jTFAlternativa;
    private javax.swing.JTextField jTFCalificacion;
    private javax.swing.JTextField jTFCriterio;
    private javax.swing.JTextField jTFNombreDecision;
    private javax.swing.JTextField jTFPorcentaje;
    private javax.swing.JTable jTableDecision;
    private javax.swing.JTable jTablePonderada;
    // End of variables declaration//GEN-END:variables
}
