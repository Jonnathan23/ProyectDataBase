/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasRegistro;

import static VentanasRegistro.Colores.btCeleste;
import static VentanasRegistro.Colores.btCelesteOscuro;
import static VentanasRegistro.VentanaIngreso.titulo;
import java.awt.Color;

/**
 *
 * @author User
 */
public class VentanaCliente extends javax.swing.JFrame {

    private Color colorTextoOriginal = new Color(60, 63, 65);
    private int xMouse, yMouse;

    /**
     * Creates new form VentanaCategoria
     */
    public VentanaCliente() {
        initComponents();

        this.setVisible(true);
        this.setLocationRelativeTo(null);        
        this.lbTituloC.setText(titulo);
        this.lbTituloC.setForeground(Colores.btTextoSalir);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jpAgregarCliente = new javax.swing.JPanel();
        btAgregarCliente = new javax.swing.JButton();
        jpMarcoClie = new javax.swing.JPanel();
        jpSalirC = new javax.swing.JPanel();
        btSalirC = new javax.swing.JButton();
        jpRegresarC = new javax.swing.JPanel();
        btRegresarC = new javax.swing.JButton();
        lbTituloC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(62, 169, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(136, 136, 136));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar un cliente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 440, 20));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("Ingresar el nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 260, 25));

        txtCedula.setBackground(new java.awt.Color(204, 204, 204));
        txtCedula.setForeground(new java.awt.Color(255, 255, 255));
        txtCedula.setText("Ingresar el numero de cedula");
        txtCedula.setBorder(null);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 270, 25));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(136, 136, 136));
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(136, 136, 136));
        jLabel3.setText("CI");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 30, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(136, 136, 136));
        jLabel4.setText("Apellido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 120, -1));

        txtApellido.setBackground(new java.awt.Color(204, 204, 204));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setText("Ingresar el apellido");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 260, 25));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(136, 136, 136));
        jLabel5.setText("Dirección");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 140, -1));

        txtDireccion.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccion.setColumns(20);
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setRows(5);
        txtDireccion.setText("Ingrese la direccion completa");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtDireccion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 260, 40));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(136, 136, 136));
        jLabel6.setText("Telefono");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 80, -1));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setText("Ingresar el numero de telefono");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 260, 25));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(136, 136, 136));
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        txtEmail.setBackground(new java.awt.Color(204, 204, 204));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Ingresar el correo electronico");
        txtEmail.setBorder(null);
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailMousePressed(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 260, 25));

        jpAgregarCliente.setBackground(new java.awt.Color(62, 169, 204));
        jpAgregarCliente.setLayout(new java.awt.BorderLayout());

        btAgregarCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btAgregarCliente.setText("Agregar");
        btAgregarCliente.setBorder(null);
        btAgregarCliente.setContentAreaFilled(false);
        btAgregarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAgregarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAgregarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAgregarClienteMouseExited(evt);
            }
        });
        jpAgregarCliente.add(btAgregarCliente, java.awt.BorderLayout.CENTER);

        jPanel2.add(jpAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 165, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 440, 520));

        jpMarcoClie.setBackground(new java.awt.Color(255, 255, 255));
        jpMarcoClie.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpMarcoClieMouseDragged(evt);
            }
        });
        jpMarcoClie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpMarcoClieMousePressed(evt);
            }
        });
        jpMarcoClie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSalirC.setBackground(new java.awt.Color(255, 255, 255));
        jpSalirC.setLayout(new java.awt.BorderLayout());

        btSalirC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btSalirC.setText("X");
        btSalirC.setContentAreaFilled(false);
        btSalirC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalirCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalirCMouseExited(evt);
            }
        });
        jpSalirC.add(btSalirC, java.awt.BorderLayout.CENTER);

        jpMarcoClie.add(jpSalirC, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 50, 30));

        jpRegresarC.setBackground(new java.awt.Color(255, 255, 255));
        jpRegresarC.setLayout(new java.awt.BorderLayout());

        btRegresarC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btRegresarC.setText("<");
        btRegresarC.setContentAreaFilled(false);
        btRegresarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRegresarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegresarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegresarCMouseExited(evt);
            }
        });
        jpRegresarC.add(btRegresarC, java.awt.BorderLayout.CENTER);

        jpMarcoClie.add(jpRegresarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        lbTituloC.setText("jLabel8");
        jpMarcoClie.add(lbTituloC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 200, 30));

        jPanel1.add(jpMarcoClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        this.restablecerTextos();
        if(this.txtCedula.getText().equals("Ingresar el numero de cedula")){
            this.txtCedula.setText("");
            this.txtCedula.setForeground(colorTextoOriginal);
        }
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
         this.restablecerTextos();
        if(this.txtNombre.getText().equals("Ingresar el nombre")){
            this.txtNombre.setText("");
            this.txtNombre.setForeground(colorTextoOriginal);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
         this.restablecerTextos();
        if(this.txtApellido.getText().equals("Ingresar el apellido")){
            this.txtApellido.setText("");
            this.txtApellido.setForeground(colorTextoOriginal);
        }
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
         this.restablecerTextos();
        if(this.txtDireccion.getText().equals("Ingrese la direccion completa")){
            this.txtDireccion.setText("");
            this.txtDireccion.setForeground(colorTextoOriginal);
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
         this.restablecerTextos();
        if(this.txtTelefono.getText().equals("Ingresar el numero de telefono")){
            this.txtTelefono.setText("");
            this.txtTelefono.setForeground(colorTextoOriginal);
        }
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
         this.restablecerTextos();
        if(this.txtEmail.getText().equals("Ingresar el correo electronico")){
            this.txtEmail.setText("");
            this.txtEmail.setForeground(colorTextoOriginal);
        }
    }//GEN-LAST:event_txtEmailMousePressed

    private void btAgregarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarClienteMouseEntered
        this.jpAgregarCliente.setBackground(Colores.btCelesteOscuro);
    }//GEN-LAST:event_btAgregarClienteMouseEntered

    private void btAgregarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarClienteMouseExited
        this.jpAgregarCliente.setBackground(Colores.btCeleste);
    }//GEN-LAST:event_btAgregarClienteMouseExited

    private void btSalirCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirCMouseEntered
        this.jpSalirC.setBackground(Colores.btRojo);
        this.btSalirC.setForeground(Color.white);
    }//GEN-LAST:event_btSalirCMouseEntered

    private void jpMarcoClieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcoClieMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jpMarcoClieMousePressed

    private void jpMarcoClieMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcoClieMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpMarcoClieMouseDragged

    private void btSalirCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirCMouseExited
        this.jpSalirC.setBackground(Color.white);
        this.btSalirC.setForeground(Colores.btTextoSalir);
    }//GEN-LAST:event_btSalirCMouseExited

    private void btRegresarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegresarCMouseEntered
        this.jpRegresarC.setBackground(btCeleste);
        this.btRegresarC.setForeground(Color.white);
    }//GEN-LAST:event_btRegresarCMouseEntered

    private void btRegresarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegresarCMouseExited
        this.jpRegresarC.setBackground(Color.white);
        this.btRegresarC.setForeground(Colores.btTextoSalir);
    }//GEN-LAST:event_btRegresarCMouseExited

    private void restablecerTextos() {
        if (this.txtCedula.getText().isEmpty()) {
            this.txtCedula.setText("Ingresar el numero de cedula");
            this.txtCedula.setForeground(Color.WHITE);
        }
        if (this.txtNombre.getText().isEmpty()) {
            this.txtNombre.setText("Ingresar el nombre");
            this.txtNombre.setForeground(Color.WHITE);
        }
        if (this.txtApellido.getText().isEmpty()) {
            this.txtApellido.setText("Ingresar el apellido");
            this.txtApellido.setForeground(Color.WHITE);
        }
        if (this.txtDireccion.getText().isEmpty()) {
            this.txtDireccion.setText("Ingrese la direccion completa");
            this.txtDireccion.setForeground(Color.WHITE);
        }
        if (this.txtTelefono.getText().isEmpty()) {
            this.txtTelefono.setText("Ingresar el numero de telefono");
            this.txtTelefono.setForeground(Color.WHITE);
        }
        if (this.txtEmail.getText().isEmpty()) {
            this.txtEmail.setText("Ingresar el correo electronico");
            this.txtEmail.setForeground(Color.WHITE);
        }

    }

    private void pintar(){
        this.lbTituloC.setForeground(Colores.btTextoSalir);
        this.btSalirC.setForeground(Colores.btTextoSalir);
        this.btRegresarC.setForeground(Colores.btTextoSalir);
    }
    
    public void cerrarVentana() {
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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarCliente;
    private javax.swing.JButton btRegresarC;
    private javax.swing.JButton btSalirC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAgregarCliente;
    private javax.swing.JPanel jpMarcoClie;
    private javax.swing.JPanel jpRegresarC;
    private javax.swing.JPanel jpSalirC;
    private javax.swing.JLabel lbTituloC;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
