package Vistas_Admin;

import Modelos.Usuario;
import OAD.OAD_Usuario;
import Vistas_Vendedor.Inicio_Vendedor;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLateral1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelLateral = new javax.swing.JPanel();
        jPanelLateral2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jPFContraseña = new javax.swing.JPasswordField();
        jBIngresar = new javax.swing.JButton();

        jPanelLateral1.setBackground(new java.awt.Color(10, 61, 98));

        javax.swing.GroupLayout jPanelLateral1Layout = new javax.swing.GroupLayout(jPanelLateral1);
        jPanelLateral1.setLayout(jPanelLateral1Layout);
        jPanelLateral1Layout.setHorizontalGroup(
            jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanelLateral1Layout.setVerticalGroup(
            jPanelLateral1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jPanelLateral.setBackground(new java.awt.Color(10, 61, 98));

        javax.swing.GroupLayout jPanelLateralLayout = new javax.swing.GroupLayout(jPanelLateral);
        jPanelLateral.setLayout(jPanelLateralLayout);
        jPanelLateralLayout.setHorizontalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelLateralLayout.setVerticalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jPanelLateral2.setBackground(new java.awt.Color(10, 61, 98));

        javax.swing.GroupLayout jPanelLateral2Layout = new javax.swing.GroupLayout(jPanelLateral2);
        jPanelLateral2.setLayout(jPanelLateral2Layout);
        jPanelLateral2Layout.setHorizontalGroup(
            jPanelLateral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        jPanelLateral2Layout.setVerticalGroup(
            jPanelLateral2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 61, 98));
        jLabel1.setText("Bienvenido");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 61, 98));
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 61, 98));
        jLabel3.setText("Contraseña");

        jBIngresar.setBackground(new java.awt.Color(10, 61, 98));
        jBIngresar.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        jBIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jBIngresar.setText("Ingresar");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(392, 392, 392))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(jPFContraseña))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(527, 527, 527)
                    .addComponent(jBIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(527, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelLateral2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(jPanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(338, 338, 338)
                    .addComponent(jBIngresar)
                    .addContainerGap(338, Short.MAX_VALUE)))
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

        setSize(new java.awt.Dimension(1214, 737));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        String usuario = jTFUsuario.getText().trim(); //para eliminar los espacios en blanco tanto al inicio como al final
        String contraseña = jPFContraseña.getText().trim();

        Usuario u = new OAD_Usuario().validarUsuario(usuario, contraseña); //se manda a llamar al OAD
        
        if (u != null) {
            JOptionPane.showMessageDialog(null, "Bienvenido ", "Acceso permitido", JOptionPane.INFORMATION_MESSAGE);

            //aqui se valida que tipo de perfil tiene el usuario una vez que ya coloco sus credenciales y son correctas.
            //de esta forma evitamos que el usuario seleccione el tipo de perfil desde un combo Box, mas bien el sistema hace esa validación
            if (u.getTipoPerfil().equalsIgnoreCase("Administrador")) {
                new Inicio_Admin().setVisible(true);
            } else if (u.getTipoPerfil().equalsIgnoreCase("Vendedor")) {
                new Inicio_Vendedor().setVisible(true);
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBIngresarActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPFContraseña;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JPanel jPanelLateral1;
    private javax.swing.JPanel jPanelLateral2;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
