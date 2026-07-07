package Vistas_Admin;

import Modelos.Categoria;
import Modelos.Producto;
import OAD.OAD_Categoria;
import OAD.OAD_Producto;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class Actualizar_Producto extends javax.swing.JFrame {

    private int idProducto;
    HashMap<String, Integer> categoriasMap = new HashMap<>();

    public Actualizar_Producto(int idProducto) {
        initComponents();
        jBMatriz.setVisible(false);
        jBMonteCarlo.setVisible(false);

        this.idProducto = idProducto;

        cargarCategoriasCombo();
        cargarDatosProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFCosto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFExistencias = new javax.swing.JTextField();
        jTFActualizar = new javax.swing.JButton();
        jCBCategorias = new javax.swing.JComboBox<>();
        jTFCodigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jPanelLateral3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jBInicio2 = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBPedidos = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBMatriz = new javax.swing.JButton();
        jBMonteCarlo = new javax.swing.JButton();
        jBUsuarios = new javax.swing.JButton();
        jBModelos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 98));
        jLabel1.setText("Modificar producto");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 61, 98));
        jLabel4.setText("Id ");

        jTFId.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 61, 98));
        jLabel5.setText("Codigo");

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 61, 98));
        jLabel6.setText("Categoria");

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 61, 98));
        jLabel7.setText("Precio Costo");

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 61, 98));
        jLabel8.setText("Precio Venta");

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 61, 98));
        jLabel9.setText("Existencias");

        jTFActualizar.setBackground(new java.awt.Color(10, 61, 98));
        jTFActualizar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jTFActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jTFActualizar.setText("Actualizar Producto");
        jTFActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFActualizarActionPerformed(evt);
            }
        });

        jCBCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(10, 61, 98));
        jLabel10.setText("Nombre");

        jPanelLateral3.setBackground(new java.awt.Color(10, 61, 98));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono usuario.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));

        jBInicio2.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 16)); // NOI18N
        jBInicio2.setForeground(new java.awt.Color(255, 255, 255));
        jBInicio2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono inicio.png"))); // NOI18N
        jBInicio2.setText("   Inicio");
        jBInicio2.setActionCommand("    Inicio");
        jBInicio2.setBorderPainted(false);
        jBInicio2.setContentAreaFilled(false);
        jBInicio2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jBInicio2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicio2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelLateral3Layout = new javax.swing.GroupLayout(jPanelLateral3);
        jPanelLateral3.setLayout(jPanelLateral3Layout);
        jPanelLateral3Layout.setHorizontalGroup(
            jPanelLateral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLateral3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanelLateral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLateral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBModelos))
                    .addGroup(jPanelLateral3Layout.createSequentialGroup()
                        .addGroup(jPanelLateral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBMonteCarlo)
                            .addComponent(jBMatriz))
                        .addGap(5, 5, 5)))
                .addGap(16, 16, 16))
            .addGroup(jPanelLateral3Layout.createSequentialGroup()
                .addGroup(jPanelLateral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLateral3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLateral3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLateral3Layout.setVerticalGroup(
            jPanelLateral3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateral3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelLateral3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(jTFExistencias))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFVenta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(9, 9, 9)
                                        .addComponent(jCBCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jTFActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1201, 1201, 1201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(39, 39, 39)
                .addComponent(jTFActualizar)
                .addContainerGap(245, Short.MAX_VALUE))
            .addComponent(jPanelLateral3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1215, 786));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatosProducto() {
        Producto p = new OAD_Producto().obtenerProductoPorId(idProducto);

        if (p != null) { //obtenemos los datos del producto y los mostramos en cada campo correspondiente
            jTFId.setText(String.valueOf(p.getIdProducto()));
            jTFCodigo.setText(p.getCodigo());
            jTFNombre.setText(p.getNombre());
            jTFCosto.setText(String.valueOf(p.getPrecioCosto()));
            jTFVenta.setText(String.valueOf(p.getPrecioVenta()));
            jTFExistencias.setText(String.valueOf(p.getExistencias()));

            jCBCategorias.setSelectedItem(p.getCategoriaNombre());
        }
    }

    private void jTFActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFActualizarActionPerformed
        if (jTFCodigo.getText().trim().isEmpty() //evita que el usuario deje campos vacios
                || jTFNombre.getText().trim().isEmpty()
                || jTFCosto.getText().trim().isEmpty()
                || jTFVenta.getText().trim().isEmpty()
                || jTFExistencias.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "No puede dejar campos vacíos");
            return;
        }

        double precioCosto;
        double precioVenta;
        int existencias;

        try {
            precioCosto = Double.parseDouble(jTFCosto.getText()); //Evita que se ingresen datos no numericos en los campos de precios y existencias 
            precioVenta = Double.parseDouble(jTFVenta.getText());
            existencias = Integer.parseInt(jTFExistencias.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese datos numéricos en Costo, Venta y Existencias");
            return;
        }

        //Validamos que seleccione una categoria y no este seleccionada la de agrega una Nueva
        String categoriaSeleccionada = jCBCategorias.getSelectedItem().toString();

        if (categoriaSeleccionada.equals("➕ Agregar nueva categoría...")) {
            JOptionPane.showMessageDialog(null, "Seleccione una categoría válida");
            return;
        }

        String codigo = jTFCodigo.getText();
        String nombre = jTFNombre.getText();
        int categoriaId = categoriasMap.get(jCBCategorias.getSelectedItem().toString());

        Producto p = new Producto(idProducto, codigo, nombre, categoriaId, precioCosto, precioVenta, existencias);

        if (new OAD_Producto().actualizarProducto(p)) { //mandamos a llamar al Oad para actualizar
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
            new Productos().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar producto");
        }
    }//GEN-LAST:event_jTFActualizarActionPerformed

    private void jCBCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCategoriasActionPerformed
        if (jCBCategorias.getSelectedItem().equals("➕ Agregar nueva categoría...")) {//La opcion del Combo Box que permite agregar nuevas categorias
            String nueva = JOptionPane.showInputDialog("Nombre de la nueva categoría:"); //Se despliega el JOption para colocar el nombre de la nueva categoria

            if (nueva != null && !nueva.trim().isEmpty()) {
                Categoria c = new Categoria(nueva);

                if (new OAD_Categoria().agregarCategoria(c)) {
                    JOptionPane.showMessageDialog(null, "Categoría agregada");
                    cargarCategoriasCombo();
                    jCBCategorias.setSelectedItem(nueva);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo agregar la categoría"); //Si se repite
                }
            }
        }
    }//GEN-LAST:event_jCBCategoriasActionPerformed

    private void jBInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicio2ActionPerformed
        new Inicio_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBInicio2ActionPerformed

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

    private void jBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuariosActionPerformed
        new Agregar_Usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBUsuariosActionPerformed

    private void cargarCategoriasCombo() {
        jCBCategorias.removeAllItems();
        categoriasMap.clear();

        List<Categoria> lista = new OAD_Categoria().obtenerCategorias();
        for (Categoria c : lista) {
            jCBCategorias.addItem(c.getNombre());
            categoriasMap.put(c.getNombre(), c.getId());
        }
        jCBCategorias.addItem("➕ Agregar nueva categoría...");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBInicio2;
    private javax.swing.JButton jBMatriz;
    private javax.swing.JButton jBModelos;
    private javax.swing.JButton jBMonteCarlo;
    private javax.swing.JButton jBPedidos;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBUsuarios;
    private javax.swing.JComboBox<String> jCBCategorias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLateral3;
    private javax.swing.JButton jTFActualizar;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCosto;
    private javax.swing.JTextField jTFExistencias;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFVenta;
    // End of variables declaration//GEN-END:variables
}
