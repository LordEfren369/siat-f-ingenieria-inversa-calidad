package Vistas_Admin;

import Modelos.Cliente;
import Modelos.Pedido;
import Modelos.PedidoDetalle;
import Modelos.Producto;
import OAD.OAD_Cliente;
import OAD.OAD_Pedido;
import OAD.OAD_Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agregar_Pedido extends javax.swing.JFrame {

    public static DefaultTableModel mt = new DefaultTableModel();

    public Agregar_Pedido() {
        initComponents();
        jBMatriz.setVisible(false);
        jBMonteCarlo.setVisible(false);

        String ids[] = {"ID", "Producto", "Existencias", "Cantidad", "Precio", "SubTotal"};
        mt.setColumnIdentifiers(ids);
        jTablePedido.setModel(mt);

        generarNuevoFolio();
        String fechaHoy = new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date()); //Formato de la fecha
        jTFecha.setText(fechaHoy); //la insertamos en el text field

        llenarCBClientes(); //llenamos el combo box de clienets y productos para que el usuario pueda seleccionar las opciones dispommibles
        llenarCBProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFolio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFTotal = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanelLateral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBPedidos = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBMatriz = new javax.swing.JButton();
        jBMonteCarlo = new javax.swing.JButton();
        jBUsuarios = new javax.swing.JButton();
        jBModelos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTFecha = new javax.swing.JTextField();
        jCBProductos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedido = new javax.swing.JTable();
        jCBClientes = new javax.swing.JComboBox<>();
        jBMás = new javax.swing.JButton();
        jBMenos = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 98));
        jLabel1.setText("Nuevo pedido");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 61, 98));
        jLabel4.setText("Folio");

        jTFolio.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 61, 98));
        jLabel5.setText("Cliente");

        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 61, 98));
        jLabel9.setText("Total");

        jBGuardar.setBackground(new java.awt.Color(10, 61, 98));
        jBGuardar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar Pedido");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(10, 61, 98));
        jLabel10.setText("Producto");

        jPanelLateral.setBackground(new java.awt.Color(10, 61, 98));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono usuario.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

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
                    .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBModelos))
                    .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBMatriz)
                        .addComponent(jBMonteCarlo)))
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
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(10, 61, 98));
        jLabel11.setText("Fecha");

        jTFecha.setEnabled(false);

        jCBProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProductosActionPerformed(evt);
            }
        });

        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePedido);

        jCBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBClientesActionPerformed(evt);
            }
        });

        jBMás.setBackground(new java.awt.Color(10, 61, 98));
        jBMás.setForeground(new java.awt.Color(255, 255, 255));
        jBMás.setText("+");
        jBMás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMásActionPerformed(evt);
            }
        });

        jBMenos.setBackground(new java.awt.Color(10, 61, 98));
        jBMenos.setForeground(new java.awt.Color(255, 255, 255));
        jBMenos.setText("-");
        jBMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenosActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(10, 61, 98));
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBLimpiar.setBackground(new java.awt.Color(10, 61, 98));
        jBLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBLimpiar.setText("Limpiar Pedido");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
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
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCBClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(355, 355, 355))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(620, 620, 620))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jCBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBMás, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jCBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar)
                    .addComponent(jBMás)
                    .addComponent(jBMenos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBGuardar)
                .addGap(20, 20, 20))
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(1210, 786));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private List<Cliente> listaClientes = new ArrayList<>();

    private void llenarCBClientes() {
        listaClientes = new OAD_Cliente().obtenerClientes(); //Para llenar el combo box solo llamamos el OAD que obtiene todos en BD
        jCBClientes.removeAllItems();
        jCBClientes.addItem("Seleccione cliente");

        for (Cliente c : listaClientes) { //recorremos a traves de un for
            jCBClientes.addItem(c.getNombreCliente()); //los insertamos en el CB
        }
    }

    private List<Producto> listaProductos = new ArrayList<>();

    private void llenarCBProductos() {
        listaProductos = new OAD_Producto().obtenerProductos(); //Usamos el OAD para obtener todos los productos
        jCBProductos.removeAllItems();
        jCBProductos.addItem("Seleccione producto");

        for (Producto p : listaProductos) { //Recorremos a traves de un for
            jCBProductos.addItem(p.getNombre()); //insertamos
        }
    }

    private Cliente clienteSeleccionado;
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (clienteSeleccionado == null) { //No deja agregar un nuevo pedido si no selecciona un cliente 
            JOptionPane.showMessageDialog(this, "Selecciona un cliente.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (mt.getRowCount() == 0) { //No deja guardar un pedido si no se selecciona al menos un producto a vender
            JOptionPane.showMessageDialog(this, "Agrega productos al pedido.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        double totalPedido = Double.parseDouble(jTFTotal.getText());

        Pedido pedido = new Pedido(clienteSeleccionado.getIdCliente(), totalPedido); //estos datos unicamente son del pedido

        List<PedidoDetalle> detalles = new ArrayList<>();

        for (int i = 0; i < mt.getRowCount(); i++) {

            int idProducto = Integer.parseInt(mt.getValueAt(i, 0).toString());   // ID oculto
            String nombre = mt.getValueAt(i, 1).toString();
            int existencia = Integer.parseInt(mt.getValueAt(i, 2).toString());
            int cantidad = Integer.parseInt(mt.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(mt.getValueAt(i, 4).toString());

            detalles.add(new PedidoDetalle(idProducto, nombre, existencia, cantidad, precio)); //estos datos se agregan al detalle del pedido
        }

        boolean ok = new OAD_Pedido().agregarPedido(pedido, detalles); //al tener ambos datos del pedido, agregamos un nuevo pedido

        if (!ok) {
            JOptionPane.showMessageDialog(this, "Error al guardar pedido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Pedido guardado correctamente.");

        //Al agregar un nuevo pedido:
        mt.setRowCount(0); //se limpia la tabla
        jTFTotal.setText("0.00"); //se limpia el campo del total
        generarNuevoFolio(); //generamos un nuevo folio
        cargarExistenciasActualizadas(); //actualizamos existencias
        jCBClientes.setSelectedIndex(-1); //Deselecciona el cliente elegido
        clienteSeleccionado = null; //limpiar la variable de cliente para que no tome el ultimo seleccionado 
        jCBProductos.setSelectedIndex(-1); //Deselecciona el ultimo producto elegido
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void generarNuevoFolio() {
        int siguiente = new OAD_Pedido().obtenerSiguienteFolio();
        jTFolio.setText(String.valueOf(siguiente));
    }

    private void cargarExistenciasActualizadas() {
        listaProductos = new OAD_Producto().obtenerProductos();
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

    private void jCBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProductosActionPerformed
        int index = jCBProductos.getSelectedIndex() - 1;
        if (index >= 0) {
            Producto p = listaProductos.get(index);
            agregarProductoATabla(p);
        }
    }//GEN-LAST:event_jCBProductosActionPerformed

    private void jTablePedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePedidoMouseClicked

    }//GEN-LAST:event_jTablePedidoMouseClicked

    //Este es el boton de MÁS para agregar mas cantidades de un producto
    private void jBMásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMásActionPerformed
        int fila = jTablePedido.getSelectedRow(); //primero debe seleccionar un producto de la tabla
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla.");
            return;
        }

        int existencias = Integer.parseInt(jTablePedido.getValueAt(fila, 2).toString());
        int cantidad = Integer.parseInt(jTablePedido.getValueAt(fila, 3).toString());
        double precio = Double.parseDouble(jTablePedido.getValueAt(fila, 4).toString());

        if (cantidad + 1 > existencias) { //verifica la existencia del producto
            JOptionPane.showMessageDialog(this, "No hay stock suficiente.");
            return;
        }

        cantidad++;
        jTablePedido.setValueAt(cantidad, fila, 3);  //Actualizamos la cantidad

        double subtotal = precio * cantidad; //Formula para sacar el subtotal de cada producto a vender
        jTablePedido.setValueAt(subtotal, fila, 5); //Actualizamos el subtotal de cada producto

        recalcularTotal(); //Se recalcula el total, si es que agregamos cantidad en cierto producto
    }//GEN-LAST:event_jBMásActionPerformed

    private void jBMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenosActionPerformed
        int fila = jTablePedido.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto de la tabla.");
            return;
        }

        int cantidad = Integer.parseInt(jTablePedido.getValueAt(fila, 3).toString());
        double precio = Double.parseDouble(jTablePedido.getValueAt(fila, 4).toString());

        if (cantidad - 1 <= 0) { //verifica que la cantidad minima a vender de un producto sea 1
            JOptionPane.showMessageDialog(this, "La cantidad mínima es 1.");
            return;
        }

        cantidad--; //descontamos cantidad 
        jTablePedido.setValueAt(cantidad, fila, 3);

        double subtotal = precio * cantidad; //calculamos el subtotal
        jTablePedido.setValueAt(subtotal, fila, 5);

        recalcularTotal();
    }//GEN-LAST:event_jBMenosActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = jTablePedido.getSelectedRow(); //que seleccione el producto a elimianr

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto.");
            return;
        }

        //Que confirne eliminar el producto a traves del JOption
        int opc = JOptionPane.showConfirmDialog(
                this,
                "¿Eliminar este producto del pedido?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION
        );

        if (opc == JOptionPane.YES_OPTION) { //Si selecciona que si lo quiere eliminar, lo quitamos de la tabla y recalculamos el total
            mt.removeRow(fila);
            recalcularTotal();
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jCBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBClientesActionPerformed
        Object seleccionado = jCBClientes.getSelectedItem();
        if (seleccionado == null) {
            return;
        }

        for (Cliente c : listaClientes) { //llenamos la el combo box de los clientes 
            if (c.getNombreCliente().equals(seleccionado.toString())) {
                clienteSeleccionado = c;
                break;
            }
        }
    }//GEN-LAST:event_jCBClientesActionPerformed

    private void jBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuariosActionPerformed
        new Agregar_Usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBUsuariosActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        mt.setRowCount(0);
        recalcularTotal();
        jCBClientes.setSelectedIndex(-1); //Deselecciona el cliente elegido
        clienteSeleccionado = null; //limpiar la variable de cliente para que no tome el ultimo seleccionado 
        jCBProductos.setSelectedIndex(-1); //Deselecciona el ultimo producto elegido

    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void agregarProductoATabla(Producto p) {
        for (int i = 0; i < mt.getRowCount(); i++) { //Validar que no este repetido el producto en el pedido
            int idExistente = Integer.parseInt(mt.getValueAt(i, 0).toString());
            if (idExistente == p.getIdProducto()) {
                JOptionPane.showMessageDialog(this, "El producto ya está en el pedido.");
                return;
            }
        }

        //Validar existencias del producto
        if (p.getExistencias() <= 0) {
            JOptionPane.showMessageDialog(this, "Este producto no tiene existencias disponibles.");
            return;
        }
        double subtotal = p.getPrecioVenta() * 1;
        mt.addRow(new Object[]{
            p.getIdProducto(),
            p.getNombre(),
            p.getExistencias(),
            1,
            p.getPrecioVenta(),
            subtotal
        });
        recalcularTotal();
    }

    private void recalcularTotal() {
        double total = 0.0;

        for (int i = 0; i < mt.getRowCount(); i++) {
            total += Double.parseDouble(mt.getValueAt(i, 5).toString());
        }

        jTFTotal.setText(String.format("%.2f", total));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBMatriz;
    private javax.swing.JButton jBMenos;
    private javax.swing.JButton jBModelos;
    private javax.swing.JButton jBMonteCarlo;
    private javax.swing.JButton jBMás;
    private javax.swing.JButton jBPedidos;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBUsuarios;
    private javax.swing.JComboBox<String> jCBClientes;
    private javax.swing.JComboBox<String> jCBProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFTotal;
    private javax.swing.JTextField jTFecha;
    private javax.swing.JTextField jTFolio;
    private javax.swing.JTable jTablePedido;
    // End of variables declaration//GEN-END:variables
}
