/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasRegistro;

import static VentanasRegistro.VentanaIngreso.titulo;
import static VentanasRegistro.VentanaIngreso.btNaranja;
import static VentanasRegistro.VentanaIngreso.btNaranjaOscuro;

import java.awt.Color;

/**
 *
 * @author User
 */
public class VentanaProducto extends javax.swing.JFrame {

    private Color colorTexto = new Color(0, 0, 0);
    private Color colorTextoOriginal = new Color(229, 178, 126);

    /**
     * Creates new form VentanaCategoria
     */
    public VentanaProducto() {
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
        txtCodigoBarras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jpAgregarUsuario = new javax.swing.JPanel();
        btAgregarUsuario = new javax.swing.JButton();
        txtNombrePro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        cbCategoria = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        miVolver = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(62, 169, 204));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpContenedor.setBackground(new java.awt.Color(255, 255, 255));
        jpContenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 122, 30));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Producto");
        jpContenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 360, -1));

        txtCodigoBarras.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoBarras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtCodigoBarras.setForeground(new java.awt.Color(229, 178, 126));
        txtCodigoBarras.setText("Ingrese el codigo de barras");
        txtCodigoBarras.setBorder(null);
        txtCodigoBarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoBarrasMousePressed(evt);
            }
        });
        txtCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoBarrasActionPerformed(evt);
            }
        });
        jpContenedor.add(txtCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 280, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(214, 122, 30));
        jLabel2.setText("Código de barras");
        jpContenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, -1));

        jSeparator1.setBackground(new java.awt.Color(61, 169, 204));
        jSeparator1.setForeground(new java.awt.Color(169, 98, 26));
        jSeparator1.setToolTipText("");
        jpContenedor.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 290, 10));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(214, 122, 30));
        jLabel3.setText("Nombre");
        jpContenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(229, 178, 126));
        txtPrecio.setText("Precio");
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        jpContenedor.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 60, -1));

        jSeparator2.setForeground(new java.awt.Color(169, 98, 26));
        jpContenedor.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, 10));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(214, 122, 30));
        jLabel4.setText("Precio");
        jpContenedor.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        jSeparator3.setForeground(new java.awt.Color(169, 98, 26));
        jpContenedor.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, 10));

        jpAgregarUsuario.setBackground(new java.awt.Color(193, 111, 29));
        jpAgregarUsuario.setLayout(new java.awt.BorderLayout());

        btAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btAgregarUsuario.setText("Agregar");
        btAgregarUsuario.setBorder(null);
        btAgregarUsuario.setContentAreaFilled(false);
        btAgregarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAgregarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAgregarUsuarioMouseExited(evt);
            }
        });
        jpAgregarUsuario.add(btAgregarUsuario, java.awt.BorderLayout.CENTER);

        jpContenedor.add(jpAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 165, 45));

        txtNombrePro.setBackground(new java.awt.Color(255, 255, 255));
        txtNombrePro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNombrePro.setForeground(new java.awt.Color(229, 178, 126));
        txtNombrePro.setText("Ingrese el nombre del producto");
        txtNombrePro.setBorder(null);
        txtNombrePro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreProMousePressed(evt);
            }
        });
        jpContenedor.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(214, 122, 30));
        jLabel6.setText("Categoria");
        jpContenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, -1));

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtStock.setForeground(new java.awt.Color(229, 178, 126));
        txtStock.setText("Stock");
        txtStock.setBorder(null);
        txtStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtStockMousePressed(evt);
            }
        });
        jpContenedor.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 60, 20));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(214, 122, 30));
        jLabel7.setText("Stock");
        jpContenedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, -1));

        jSeparator4.setForeground(new java.awt.Color(169, 98, 26));
        jpContenedor.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, 10));

        cbCategoria.setBackground(new java.awt.Color(255, 255, 255));
        cbCategoria.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        cbCategoria.setForeground(new java.awt.Color(214, 122, 30));
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategoria.setBorder(null);
        cbCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpContenedor.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 120, -1));

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

    private void txtCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoBarrasActionPerformed

    // ****************** PRESSED TXT ****************** 
    private void txtCodigoBarrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoBarrasMousePressed
        this.restablecerTextos();
        if (this.txtCodigoBarras.getText().equals("Ingrese el codigo de barras")) {
            this.txtCodigoBarras.setText("");
            this.txtCodigoBarras.setForeground(colorTexto);
        }


    }//GEN-LAST:event_txtCodigoBarrasMousePressed

    private void txtNombreProMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreProMousePressed
        this.restablecerTextos();
        if (this.txtNombrePro.getText().equals("Ingrese el nombre del producto")) {
            this.txtNombrePro.setText("");
            this.txtNombrePro.setForeground(colorTexto);
        }

    }//GEN-LAST:event_txtNombreProMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        this.restablecerTextos();
        if (this.txtPrecio.getText().equals("Precio")) {
            this.txtPrecio.setText("");
            this.txtPrecio.setForeground(colorTexto);
        }
        
    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStockMousePressed
        this.restablecerTextos();
        if (this.txtStock.getText().equals("Stock")) {
            this.txtStock.setText("");
            this.txtStock.setForeground(colorTexto);
        }
        
    }//GEN-LAST:event_txtStockMousePressed

    // *************** ENTRERED *************
    private void btAgregarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarUsuarioMouseEntered
        this.jpAgregarUsuario.setBackground(btNaranjaOscuro);        
    }//GEN-LAST:event_btAgregarUsuarioMouseEntered

    private void btAgregarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarUsuarioMouseExited
        this.jpAgregarUsuario.setBackground(btNaranja);        
    }//GEN-LAST:event_btAgregarUsuarioMouseExited

    // ****************** METODOS ****************** 
    private void restablecerTextos() {
        if (this.txtCodigoBarras.getText().isEmpty()) {
            this.txtCodigoBarras.setText("Ingrese el codigo de barras");
            this.txtCodigoBarras.setForeground(colorTextoOriginal);
        }

        if (this.txtNombrePro.getText().isEmpty()) {
            this.txtNombrePro.setText("Ingrese el nombre del producto");
            this.txtNombrePro.setForeground(colorTextoOriginal);
        }

        if (this.txtPrecio.getText().isEmpty()) {
            this.txtPrecio.setText("Precio");
            this.txtPrecio.setForeground(colorTextoOriginal);
        }

        if (this.txtStock.getText().isEmpty()) {
            this.txtStock.setText("Stock");
            this.txtStock.setForeground(colorTextoOriginal);
        }

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
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregarUsuario;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}