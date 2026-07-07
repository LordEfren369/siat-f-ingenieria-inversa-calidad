package Vistas_Admin;

import Modelos.VentaCategoria;
import OAD.OAD_Estadisticas;
import OAD.OAD_Graficas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Inicio_Admin extends javax.swing.JFrame {

    public Inicio_Admin() {
        initComponents();
        jBMatriz.setVisible(false);//para que los botones de los 2 metodos de Decision, no sean visibles hasta seleecionar el principal
        jBMonteCarlo.setVisible(false);

        OAD_Estadisticas est = new OAD_Estadisticas(); //con el que se genera la información de las tarjetas dinamicas 

        double ventas = est.obtenerVentasDelMes();
        double ganancia = est.obtenerGananciaDelMes();
        int productos = est.obtenerCantidadProductos();

        jLVentas.setText("$ " + String.format("%.2f", ventas)); //los resultados estadisticos, se muestran en los Text Field asignados
        jLGanancia.setText("$ " + String.format("%.2f", ganancia));
        jLProductos.setText(String.valueOf(productos));

        crearGraficaCategoriasMensual(); //metodos para generar las 3 gráficas de barras (Solo se mandan a llamar en el constructor porque el metodo completo esta más abajo)
        crearGraficaTopProductos();
        crearGraficaTopZonas();
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
        jButton1 = new javax.swing.JButton();
        jBModelos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLVentas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLGanancia = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLProductos = new javax.swing.JLabel();
        jPanelGraficaCategorias = new javax.swing.JPanel();
        jPanelGraficaProductos = new javax.swing.JPanel();
        jPanelGraficaZonas = new javax.swing.JPanel();

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

        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/minicono usuario.png"))); // NOI18N
        jButton1.setText("   Usuarios");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBModelos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMonteCarlo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jBInicio.getAccessibleContext().setAccessibleName("       Inicio");

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 98));
        jLabel1.setText("Dashboard Administrador");

        jPanel2.setBackground(new java.awt.Color(10, 61, 98));

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ventas del mes");

        jLVentas.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        jLVentas.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 61, 98));
        jLabel4.setText("Ganancia del mes");

        jLGanancia.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        jLGanancia.setForeground(new java.awt.Color(10, 61, 98));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(10, 61, 98));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Productos en Inventario");

        jLProductos.setFont(new java.awt.Font("Baskerville Old Face", 1, 30)); // NOI18N
        jLProductos.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanelGraficaCategorias.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelGraficaCategoriasLayout = new javax.swing.GroupLayout(jPanelGraficaCategorias);
        jPanelGraficaCategorias.setLayout(jPanelGraficaCategoriasLayout);
        jPanelGraficaCategoriasLayout.setHorizontalGroup(
            jPanelGraficaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGraficaCategoriasLayout.setVerticalGroup(
            jPanelGraficaCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        jPanelGraficaProductos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelGraficaProductosLayout = new javax.swing.GroupLayout(jPanelGraficaProductos);
        jPanelGraficaProductos.setLayout(jPanelGraficaProductosLayout);
        jPanelGraficaProductosLayout.setHorizontalGroup(
            jPanelGraficaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanelGraficaProductosLayout.setVerticalGroup(
            jPanelGraficaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jPanelGraficaZonas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelGraficaZonasLayout = new javax.swing.GroupLayout(jPanelGraficaZonas);
        jPanelGraficaZonas.setLayout(jPanelGraficaZonasLayout);
        jPanelGraficaZonasLayout.setHorizontalGroup(
            jPanelGraficaZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanelGraficaZonasLayout.setVerticalGroup(
            jPanelGraficaZonasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanelGraficaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelGraficaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelGraficaZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(46, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelGraficaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelGraficaZonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelGraficaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1212, 787));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Para las gráficas usamos la libreria JfreeChart
    private void crearGraficaCategoriasMensual() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        OAD_Graficas oad = new OAD_Graficas(); //se llama al OAD donde se hacen los calculos para poder mostrar cada gráfica
        List<VentaCategoria> lista = oad.obtenerVentasPorCategoriaMesActual();

        for (VentaCategoria vc : lista) { //Para mostrar los datos de la grafica, por cada venta en cada una de las categorias se va agregando.
            dataset.addValue(vc.getTotal(), "Ventas", vc.getCategoria());
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Ventas por Categoría (Mensual)", //Titulo de la gráfica
                "Categoría", //Titulo del eje horizontal _
                "Total", //Titulo del eje vertical |
                dataset
        );

        CategoryPlot plot = chart.getCategoryPlot();
        BarRenderer renderer = (BarRenderer) plot.getRenderer();

        //Los colores que van a tener las barras en el modelo de color RGB (red, green y blue)
        Color[] azules = new Color[]{
            new Color(0, 102, 204),
            new Color(51, 153, 255),
            new Color(102, 178, 255),
            new Color(153, 204, 255),
            new Color(0, 76, 153),
            new Color(0, 128, 255)
        };

        for (int i = 0; i < lista.size(); i++) { //Este for no tiene como tal una funcionalidad, solo es para darle estetica a ña grafica y asigne un color a cada barra de la grafica
            renderer.setSeriesPaint(i, azules[i % azules.length]);
        }
 
        //Las dimensiones del panel donde se mostrara la gráfica, pues no queremos que abarque todo el Frame
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(880, 300));
        chartPanel.setMaximumSize(new Dimension(880, 300));
        chartPanel.setMinimumSize(new Dimension(880, 300));

        jPanelGraficaCategorias.removeAll();
        jPanelGraficaCategorias.setLayout(new BorderLayout());
        jPanelGraficaCategorias.add(chartPanel, BorderLayout.CENTER);

        jPanelGraficaCategorias.revalidate();
        jPanelGraficaCategorias.repaint();
    }

    private void crearGraficaTopProductos() {

        OAD_Graficas oad = new OAD_Graficas();
        List<VentaCategoria> lista = oad.obtenerTop10ProductosMesActual();

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (VentaCategoria v : lista) { //Para asignar secciones en la grafica de pastel.
            dataset.setValue(v.getCategoria(), v.getTotal());
        }

        JFreeChart grafica = ChartFactory.createPieChart(
                "Top 10 Productos más vendidos del mes",
                dataset,
                false,
                true,
                false
        );

        PiePlot plot = (PiePlot) grafica.getPlot();

        Color[] azulesPie = {
            new Color(0, 76, 153),
            new Color(0, 102, 204),
            new Color(0, 128, 255),
            new Color(51, 153, 255),
            new Color(102, 178, 255),
            new Color(153, 204, 255),
            new Color(0, 51, 102),
            new Color(30, 144, 255),
            new Color(70, 130, 180),
            new Color(100, 149, 237)
        };

        int i = 0;
        for (Object key : dataset.getKeys()) {
            plot.setSectionPaint((Comparable) key, azulesPie[i % azulesPie.length]);
            i++;
        }

        ChartPanel panel = new ChartPanel(grafica);
        panel.setPreferredSize(new Dimension(430, 200));

        jPanelGraficaProductos.removeAll();
        jPanelGraficaProductos.setLayout(new BorderLayout());
        jPanelGraficaProductos.add(panel, BorderLayout.CENTER);
        jPanelGraficaProductos.revalidate();
        jPanelGraficaProductos.repaint();
    }

    private void crearGraficaTopZonas() {

        OAD_Graficas oad = new OAD_Graficas();
        List<VentaCategoria> lista = oad.obtenerTop10ZonasMesActual();

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (VentaCategoria v : lista) { //Igualmente llena el dataset de la grafica de pastel
            dataset.setValue(v.getCategoria(), v.getTotal());
        }

        JFreeChart grafica = ChartFactory.createPieChart(
                "Top 10 Zonas con más ventas del mes",
                dataset,
                false,
                true,
                false
        );

        PiePlot plot = (PiePlot) grafica.getPlot();

        Color[] azulesPie = {
            new Color(0, 76, 153),
            new Color(0, 102, 204),
            new Color(0, 128, 255),
            new Color(51, 153, 255),
            new Color(102, 178, 255),
            new Color(153, 204, 255),
            new Color(0, 51, 102),
            new Color(30, 144, 255),
            new Color(70, 130, 180),
            new Color(100, 149, 237)
        };

        int i = 0;
        for (Object key : dataset.getKeys()) {
            plot.setSectionPaint((Comparable) key, azulesPie[i % azulesPie.length]);
            i++;
        }

        ChartPanel panel = new ChartPanel(grafica);
        panel.setPreferredSize(new Dimension(430, 200));

        jPanelGraficaZonas.removeAll();
        jPanelGraficaZonas.setLayout(new BorderLayout());
        jPanelGraficaZonas.add(panel, BorderLayout.CENTER);
        jPanelGraficaZonas.revalidate();
        jPanelGraficaZonas.repaint();
    }


    private void jBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductosActionPerformed
        new Productos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBProductosActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModelosActionPerformed
        jBMatriz.setVisible(true);
        jBMonteCarlo.setVisible(true);
    }//GEN-LAST:event_jBModelosActionPerformed

    private void jBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientesActionPerformed
        new Clientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBClientesActionPerformed

    private void jBPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPedidosActionPerformed
        new Pedidos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBPedidosActionPerformed

    private void jBMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatrizActionPerformed
        new Matriz_Ponderacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBMatrizActionPerformed

    private void jBMonteCarloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMonteCarloActionPerformed
        new MonteCarlo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBMonteCarloActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        new Inicio_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Agregar_Usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBMatriz;
    private javax.swing.JButton jBModelos;
    private javax.swing.JButton jBMonteCarlo;
    private javax.swing.JButton jBPedidos;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLGanancia;
    private javax.swing.JLabel jLProductos;
    private javax.swing.JLabel jLVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelGraficaCategorias;
    private javax.swing.JPanel jPanelGraficaProductos;
    private javax.swing.JPanel jPanelGraficaZonas;
    private javax.swing.JPanel jPanelLateral;
    // End of variables declaration//GEN-END:variables
}
