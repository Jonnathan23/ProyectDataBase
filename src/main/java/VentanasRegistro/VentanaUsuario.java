/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasRegistro;

import static VentanasRegistro.VentanaIngreso.titulo;
import static VentanasRegistro.VentanaIngreso.btCeleste;
import static VentanasRegistro.VentanaIngreso.btCelesteOscuro;
import java.awt.Color;

/**
 *
 * @author User
 */
public class VentanaUsuario extends javax.swing.JFrame{

    private Color colorTextoOriginal = new Color(167,216,232);
    
    /**
     * Creates new form VentanaCategoria
     */
    public VentanaUsuario() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jpContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jpAgregarUsuario = new javax.swing.JPanel();
        btAgregarUusario = new javax.swing.JButton();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmarContrasena = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        miVolver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(214, 122, 30));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpContenedor.setBackground(new java.awt.Color(255, 255, 255));
        jpContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(62, 169, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Usuario");
        jpContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(167, 216, 232));
        txtUsuario.setText("Ingrese el numero de CI");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jpContenedor.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(61, 169, 204));
        jLabel2.setText("Usuario");
        jpContenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 70, -1));

        jSeparator1.setBackground(new java.awt.Color(61, 169, 204));
        jSeparator1.setForeground(new java.awt.Color(40, 110, 133));
        jSeparator1.setToolTipText("");
        jpContenedor.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 290, 10));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(61, 169, 204));
        jLabel3.setText("Nombre");
        jpContenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(167, 216, 232));
        txtNombre.setText("Ingrese el nombre del usuario");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        jpContenedor.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, -1));

        jSeparator2.setForeground(new java.awt.Color(40, 110, 133));
        jpContenedor.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 10));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(61, 169, 204));
        jLabel4.setText("Contraseña");
        jpContenedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        jSeparator3.setForeground(new java.awt.Color(40, 110, 133));
        jpContenedor.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 290, 10));

        jpAgregarUsuario.setBackground(new java.awt.Color(62, 169, 204));
        jpAgregarUsuario.setLayout(new java.awt.BorderLayout());

        btAgregarUusario.setForeground(new java.awt.Color(255, 255, 255));
        btAgregarUusario.setText("Agregar");
        btAgregarUusario.setBorder(null);
        btAgregarUusario.setContentAreaFilled(false);
        btAgregarUusario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAgregarUusario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAgregarUusarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAgregarUusarioMouseExited(evt);
            }
        });
        jpAgregarUsuario.add(btAgregarUusario, java.awt.BorderLayout.CENTER);

        jpContenedor.add(jpAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 165, 45));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(167, 216, 232));
        txtContrasena.setText("************");
        txtContrasena.setBorder(null);
        txtContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContrasenaMousePressed(evt);
            }
        });
        jpContenedor.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 280, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(61, 169, 204));
        jLabel5.setText("Confirmar contraseña");
        jpContenedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 160, -1));

        txtConfirmarContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmarContrasena.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtConfirmarContrasena.setForeground(new java.awt.Color(167, 216, 232));
        txtConfirmarContrasena.setText("************");
        txtConfirmarContrasena.setBorder(null);
        txtConfirmarContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtConfirmarContrasenaMousePressed(evt);
            }
        });
        jpContenedor.add(txtConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 280, -1));

        jSeparator4.setForeground(new java.awt.Color(40, 110, 133));
        jpContenedor.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 290, 10));

        jpFondo.add(jpContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 370, 450));

        jMenu4.setText("Registrar");

        miVolver.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        miVolver.setText("Volver");
        miVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVolverActionPerformed(evt);
            }
        });
        jMenu4.add(miVolver);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVolverActionPerformed
        VentanaMenu ventanaMenu = new VentanaMenu();
        this.cerrarVentana();
    }//GEN-LAST:event_miVolverActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    // ****************** PRESSED ****************
    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        this.restablesTextos();
        if(this.txtUsuario.getText().equals("Ingrese el numero de CI")){
            this.txtUsuario.setText("");
            this.txtUsuario.setForeground(btCeleste);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseEntered

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        this.restablesTextos();
        if(this.txtNombre.getText().equals("Ingrese el nombre del usuario")){
            this.txtNombre.setText("");
            this.txtNombre.setForeground(btCeleste);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContrasenaMousePressed
        this.restablesTextos();
        if(String.valueOf(this.txtContrasena.getPassword()).equals("************")){
            this.txtContrasena.setText("");
            this.txtContrasena.setForeground(btCeleste);
        }
    }//GEN-LAST:event_txtContrasenaMousePressed

    private void txtConfirmarContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmarContrasenaMousePressed
        this.restablesTextos();
        if(String.valueOf(this.txtConfirmarContrasena.getPassword()).equals("************")){
            this.txtConfirmarContrasena.setText("");
            this.txtConfirmarContrasena.setForeground(btCeleste);
        }
    }//GEN-LAST:event_txtConfirmarContrasenaMousePressed

    private void btAgregarUusarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarUusarioMouseEntered
        this.jpAgregarUsuario.setBackground(btCelesteOscuro);
    }//GEN-LAST:event_btAgregarUusarioMouseEntered

    private void btAgregarUusarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarUusarioMouseExited
        this.jpAgregarUsuario.setBackground(btCeleste);
    }//GEN-LAST:event_btAgregarUusarioMouseExited

    
    // ***************** MÉTODOS *****************
    private void restablesTextos(){
        if(this.txtUsuario.getText().isEmpty()){
            this.txtUsuario.setText("Ingrese el numero de CI");
            this.txtUsuario.setForeground(colorTextoOriginal);
        }
        if(this.txtNombre.getText().isEmpty()){
            this.txtNombre.setText("Ingrese el nombre del usuario");
            this.txtNombre.setForeground(colorTextoOriginal);
        }
        if(String.valueOf(this.txtContrasena.getPassword()).isEmpty()){            
            this.txtContrasena.setText("************");
            this.txtContrasena.setForeground(colorTextoOriginal);
        }
        if(String.valueOf(this.txtConfirmarContrasena.getPassword()).isEmpty()){
            this.txtConfirmarContrasena.setText("************");
            this.txtConfirmarContrasena.setForeground(colorTextoOriginal);
        }
    }
    public void cerrarVentana(){
        this.dispose();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarUusario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel jpAgregarUsuario;
    private javax.swing.JPanel jpContenedor;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JMenuItem miVolver;
    private javax.swing.JPasswordField txtConfirmarContrasena;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}