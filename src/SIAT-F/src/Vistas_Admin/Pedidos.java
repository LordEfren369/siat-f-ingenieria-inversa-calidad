package Vistas_Admin;

import Modelos.Pedido;
import OAD.OAD_Estadisticas;
import OAD.OAD_Pedido;
import OAD.OAD_Producto;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pedidos extends javax.swing.JFrame {

    public static DefaultTableModel mt = new DefaultTableModel();

    public Pedidos() {
        initComponents();
        jBMatriz.setVisible(false);
        jBMonteCarlo.setVisible(false);

        String ids[] = {"Folio", "Fecha", "Nombre Cliente", "Nombre Negocio", "Cantidad productos", "Total del Pedido"};
        mt.setColumnIdentifiers(ids);
        jTablePedidos.setModel(mt);
        cargarPedidos();
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
        jBAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();
        jBPDF = new javax.swing.JButton();

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
        jBUsuarios.setText("    Usuarios");
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
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel1.setText("Pedidos");

        jBAgregar.setBackground(new java.awt.Color(10, 61, 98));
        jBAgregar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablePedidos);

        jBPDF.setBackground(new java.awt.Color(10, 61, 98));
        jBPDF.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBPDF.setForeground(new java.awt.Color(255, 255, 255));
        jBPDF.setText("Generar PDF");
        jBPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBPDF))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1212, 788));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPedidos() {
        mt.setRowCount(0); // vaciar tabla antes de llenar

        List<Object[]> pedidos = new OAD_Pedido().obtenerPedidos();

        for (Object[] p : pedidos) {
            mt.addRow(p);
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

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        new Agregar_Pedido().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuariosActionPerformed
        new Agregar_Usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBUsuariosActionPerformed

    private void jBPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPDFActionPerformed
        hacerPDF(new File("C:/prueba/ReportePedidosMes.pdf")); //Al darle click al boton, que se haga el Pdf y se abra
        abrirPDF(new File("C:/prueba/ReportePedidosMes.pdf"));
    }//GEN-LAST:event_jBPDFActionPerformed

    public void hacerPDF(File pdfNuevo) {
        try {
            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream(pdfNuevo));

            document.open();

            //Se obtiene la fecha actual para colocarla en el encabezado como la fecha en que se genero el reporte
            java.time.LocalDate hoy = java.time.LocalDate.now();
            java.time.format.DateTimeFormatter formatoFecha
                    = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Formato de la fecha

            Font fontEncabezado = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL); //Se coloca como encabezado
            Paragraph encabezado = new Paragraph(
                    "REPORTE GENERADO EL: " + hoy.format(formatoFecha),
                    fontEncabezado
            );
            encabezado.setAlignment(Element.ALIGN_RIGHT);
            document.add(encabezado);

           
            document.add(new Paragraph("\n"));
           
            //Lel logo de la empresa. Se especifica la ruta donde esta guardado
            try {
                Image logo = Image.getInstance("C:/Users/ameri/OneDrive/Trabajos DPF/logoFuentes.png"); //Ruta donde esta el logo 
                logo.scaleAbsolute(180, 110);
                logo.setAlignment(Image.ALIGN_CENTER);//que quede centrado
                document.add(logo);
            } catch (Exception ex) {
                System.out.println("No se pudo cargar el logo: " + ex);
            }

            document.add(new Paragraph("\n"));

            //Se obtiene el mes en curso para mostrarlos en el titulo principal
            java.time.format.DateTimeFormatter formatoMes
                    = java.time.format.DateTimeFormatter.ofPattern("MMMM yyyy", new java.util.Locale("es", "ES"));

            String mesActualEnTexto = hoy.format(formatoMes).toUpperCase();
         
            //Titulo del PDF. Se configura el color (azul), la letra (tipografía, tamaño) y la alineacion (centrado)
            BaseColor azulMarino = new BaseColor(0, 0, 102);
            Font fontTitulo = new Font(Font.FontFamily.TIMES_ROMAN, 32, Font.BOLD, azulMarino);

            Paragraph titulo = new Paragraph("PEDIDOS DE " + mesActualEnTexto + "\n\n", fontTitulo); //Se ocupa el mes obtenido anteriormente para mostrar de que mes son los pedidos
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);

            //Tabla que contendra los pedidos 
            PdfPTable tabla = new PdfPTable(4); //Tabla con 4 columnas (Folio, fecha, cliente y total.
            tabla.setWidthPercentage(100); //para que use todo el ancho del pdf

            Font fontHeader = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD, BaseColor.WHITE); //Para el encabezado de la tabla
            BaseColor azul = new BaseColor(0, 102, 204);

            String[] headers = {"Folio", "Fecha", "Cliente", "Total"}; //Encabezados de la tabla

            for (String h : headers) { //Aqui se recorre el arreglo y se va creando cada celda del encabezado
                PdfPCell celda = new PdfPCell(new Phrase(h, fontHeader)); //crea la celda con el texto
                celda.setBackgroundColor(azul); //el fondo es color azul
                celda.setHorizontalAlignment(Element.ALIGN_CENTER); 
                celda.setPadding(8); //espacio interno en la tabla
                tabla.addCell(celda); //agrega la celda a la tabla
            }

            //A traves del OAD, se obtienen todos los pedidos del mes actual
            List<Pedido> lista = new OAD_Pedido().obtenerPedidosMesActual();
            Font fontFila = new Font(Font.FontFamily.HELVETICA, 11); //los datos que se mostraran 

            for (Pedido p : lista) { //se muestran en la tabla con ayuda del for
                tabla.addCell(new PdfPCell(new Phrase(String.valueOf(p.getFolio()), fontFila)));
                tabla.addCell(new PdfPCell(new Phrase(p.getFecha(), fontFila)));
                tabla.addCell(new PdfPCell(new Phrase(p.getClienteNombre(), fontFila)));
                tabla.addCell(new PdfPCell(new Phrase("$ " + p.getTotal(), fontFila)));
            }

            document.add(tabla);

            //Espacio entre la tabla y el resumen
            document.add(new Paragraph("\n"));

            //OAD donde se obtienen las ventas y ganancia del mes
            OAD_Estadisticas oad = new OAD_Estadisticas();
            double ventasMes = oad.obtenerVentasDelMes();
            double gananciaMes = oad.obtenerGananciaDelMes();

            //Se muestran en el PDF (Se asigna una tipografia y tamaño distinto)
            Font fontResumen = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, azulMarino);

            Paragraph resumen = new Paragraph(
                    "Resumen del Mes:\n\n"
                    + "Ventas totales del mes:    $ " + String.format("%.2f", ventasMes) + "\n"
                    + "Ganancia total del mes:   $ " + String.format("%.2f", gananciaMes) + "\n",
                    fontResumen
            );

            resumen.setAlignment(Element.ALIGN_LEFT); //Para alinear el resumen del mes a lzquierda
            document.add(resumen);

            document.close();

            System.out.println("PDF generado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al generar PDF: " + e);
        }
    }

    private void abrirPDF(File archivoPDF) {
        try {
            Desktop.getDesktop().open(archivoPDF);
        } catch (IOException e) {
            System.out.println("No fue posible abrir el PDF, error: " + e);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBClientes;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBMatriz;
    private javax.swing.JButton jBModelos;
    private javax.swing.JButton jBMonteCarlo;
    private javax.swing.JButton jBPDF;
    private javax.swing.JButton jBPedidos;
    private javax.swing.JButton jBProductos;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePedidos;
    // End of variables declaration//GEN-END:variables
}
