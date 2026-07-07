package Vistas_Admin;

import Modelos.Producto;
import Modelos.Usuario;

import OAD.OAD_Producto;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.Workbook;

public class Productos extends javax.swing.JFrame {

    public static DefaultTableModel mt = new DefaultTableModel();

    public Productos() {
        initComponents();
        jBMatriz.setVisible(false);
        jBMonteCarlo.setVisible(false);

        String ids[] = {"Id", "Codigo", "Nombre", "Categoria", "Precio Costo", "Precio Venta", "Existencias"};
        mt.setColumnIdentifiers(ids);
        jTableProductos.setModel(mt);
        llenarTablaProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLateral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBExcel = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanelLateral1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jBProductos = new javax.swing.JButton();
        jBClientes = new javax.swing.JButton();
        jBPedidos = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBMatriz = new javax.swing.JButton();
        jBMonteCarlo = new javax.swing.JButton();
        jBUsuarios = new javax.swing.JButton();
        jBModelos = new javax.swing.JButton();
        jTFBuscar = new javax.swing.JTextField();

        jPanelLateral.setBackground(new java.awt.Color(10, 61, 98));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono usuario.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelLateralLayout = new javax.swing.GroupLayout(jPanelLateral);
        jPanelLateral.setLayout(jPanelLateralLayout);
        jPanelLateralLayout.setHorizontalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLateralLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLateralLayout.setVerticalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 98));
        jLabel1.setText("Productos");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 61, 98));
        jLabel3.setText("Buscar");

        jBExcel.setBackground(new java.awt.Color(10, 61, 98));
        jBExcel.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBExcel.setForeground(new java.awt.Color(255, 255, 255));
        jBExcel.setText("Generar Excel");
        jBExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcelActionPerformed(evt);
            }
        });

        jBAgregar.setBackground(new java.awt.Color(10, 61, 98));
        jBAgregar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBActualizar.setBackground(new java.awt.Color(10, 61, 98));
        jBActualizar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBActualizar.setText("Actualizar");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(10, 61, 98));
        jBEliminar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableProductos);

        jPanelLateral1.setBackground(new java.awt.Color(10, 61, 98));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono usuario.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanelLateral1Layout = new javax.swing.GroupLayout(jPanelLateral1);
        jPanelLateral1.setLayout(jPanelLateral1Layout);
        jPanelLateral1Layout.setHorizontalGroup(
            jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLateral1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLateral1Layout.createSequentialGroup()
                        .addGroup(jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBMatriz)
                            .addComponent(jBMonteCarlo))
                        .addGap(1, 1, 1))
                    .addGroup(jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBModelos)))
                .addGap(16, 16, 16))
            .addGroup(jPanelLateral1Layout.createSequentialGroup()
                .addGroup(jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLateral1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLateral1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLateral1Layout.setVerticalGroup(
            jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateral1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTFBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTFBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelLateral1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(416, 416, 416)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcel)
                    .addComponent(jBAgregar)
                    .addComponent(jBActualizar)
                    .addComponent(jBEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addComponent(jPanelLateral1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1212, 787));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcelActionPerformed
        List<Producto> lista = new OAD_Producto().obtenerProductos();

        JFileChooser chooser = new JFileChooser(); //se declara un nuevo file chooser para que el usuario elija donde guardar el excel
        chooser.setDialogTitle("Guardar Excel");
        chooser.setSelectedFile(new File("productos.xlsx")); // nombre con el que se va a descargar el excel
        int seleccion = chooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().getAbsolutePath(); //obtiene la ruta que selecciono el usuario

            //nos aseguramos que la extensión sea .xlsx
            if (!ruta.toLowerCase().endsWith(".xlsx")) {
                ruta += ".xlsx";
            }
            //llama al metodo para generar el Excel
            generarExcel(lista, ruta);
        }
    }//GEN-LAST:event_jBExcelActionPerformed

    public void generarExcel(List<Producto> productos, String rutaArchivo) {
        try (Workbook workbook = new XSSFWorkbook()) { //creamos el archivo de excel
            Sheet sheet = workbook.createSheet("Productos");

            //Estos son todos los encabezados del excel
            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("ID");
            header.createCell(1).setCellValue("Código");
            header.createCell(2).setCellValue("Nombre");
            header.createCell(3).setCellValue("Categoria");
            header.createCell(4).setCellValue("Precio Costo");
            header.createCell(5).setCellValue("Precio Venta");
            header.createCell(6).setCellValue("Existencias");

            //llenamos las filas con los datos, recorriendo a traves del for
            int filaNum = 1;
            for (Producto p : productos) {
                Row fila = sheet.createRow(filaNum++);
                fila.createCell(0).setCellValue(p.getIdProducto());
                fila.createCell(1).setCellValue(p.getCodigo());
                fila.createCell(2).setCellValue(p.getNombre());
                fila.createCell(3).setCellValue(p.getCategoriaNombre());
                fila.createCell(4).setCellValue(p.getPrecioCosto());
                fila.createCell(5).setCellValue(p.getPrecioVenta());
                fila.createCell(6).setCellValue(p.getExistencias());
            }

            //ajustamos el ancho de las columnas (para que se vea la informacion completa y no cortada)
            for (int i = 0; i <= 6; i++) {
                sheet.autoSizeColumn(i);
            }

            //se guarda el archivo en la ruta seleccionada
            try (FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
            }

            JOptionPane.showMessageDialog(null, "Excel generado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        new Agregar_Producto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        int fila = jTableProductos.getSelectedRow(); //Debe seleccionar un producto de la tabla

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
            return;
        }

        int idProducto = (int) jTableProductos.getValueAt(fila, 0); //se obtiene el id del producto

        Actualizar_Producto editar = new Actualizar_Producto(idProducto); //lo mandamos a la interfaz de actualizar 
        this.dispose();
        editar.setVisible(true);
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int fila = jTableProductos.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
            return;
        }

        int id = (int) jTableProductos.getValueAt(fila, 0);

        //Primero debe confirmar que desea eliminar el producto
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas eliminar el producto?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (opcion != JOptionPane.YES_OPTION) { //si la respuesta es no (diferente de si)
            return;
        }

        if (new OAD_Producto().eliminarProducto(id)) {
            JOptionPane.showMessageDialog(null, "Producto eliminado"); //Al confirmar la eliminación, muestra el mensaje de confirmacion
            llenarTablaProductos();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed


    private void jBProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProductosActionPerformed
        new Productos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBProductosActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBModelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModelosActionPerformed
        jBMatriz.setVisible(true);
        jBMonteCarlo.setVisible(true);
    }//GEN-LAST:event_jBModelosActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        new Inicio_Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBInicioActionPerformed

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

    private void jTFBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarKeyReleased
        String texto = jTFBuscar.getText();
        List<Producto> lista = new OAD_Producto().buscarProductos(texto);

        DefaultTableModel modelo = (DefaultTableModel) jTableProductos.getModel();
        modelo.setRowCount(0);

        for (Producto p : lista) { //muestra los datos de los productos que coincidan con lo colocado en el buscador
            modelo.addRow(new Object[]{
                p.getIdProducto(),
                p.getCodigo(),
                p.getNombre(),
                p.getCategoriaNombre(),
                p.getPrecioCosto(),
                p.getPrecioVenta(),
                p.getExistencias()
            });
        }
    }//GEN-LAST:event_jTFBuscarKeyReleased

    private void jBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuariosActionPerformed
        new Agregar_Usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBUsuariosActionPerformed

    public void llenarTablaProductos() {
        DefaultTableModel modelo = (DefaultTableModel) jTableProductos.getModel();
        modelo.setRowCount(0);

        List<Producto> lista = new OAD_Producto().obtenerProductos();

        for (Producto p : lista) { //muestra los datos de los productos 
            modelo.addRow(new Object[]{
                p.getIdProducto(),
                p.getCodigo(),
                p.getNombre(),
                p.getCategoriaNombre(),
                p.getPrecioCosto(),
                p.getPrecioVenta(),
                p.getExistencias()
            });
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBExcel;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBMatriz;
    private javax.swing.JButton jBModelos;
    private javax.swing.JButton jBMonteCarlo;
    private javax.swing.JButton jBPedidos;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JPanel jPanelLateral1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables
}
