/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasRegistro;

import Controladores.ControladorProducto;
import static VentanasRegistro.VentanaIngreso.titulo;
import static VentanasRegistro.Colores.btNaranja;
import static VentanasRegistro.Colores.btNaranjaOscuro;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class VentanaProducto extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    
    private Color colorTexto = new Color(0, 0, 0);
    private Color colorTextoOriginal = new Color(229, 178, 126);
    
    private ControladorProducto cProducto = new ControladorProducto();

    /**
     * Creates new form VentanaCategoria
     */
    public VentanaProducto() {
        initComponents();        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.btRegresarP.setForeground(Colores.btTextoSalir);
        this.btSalirP.setForeground(Colores.btTextoSalir);
        this.lbTituloP.setText(titulo);
        this.lbTituloP.setForeground(Colores.btTextoSalir);
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
        jpMarcoP = new javax.swing.JPanel();
        jpSalirP = new javax.swing.JPanel();
        btSalirP = new javax.swing.JButton();
        jpRegresarP = new javax.swing.JPanel();
        btRegresarP = new javax.swing.JButton();
        lbTituloP = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        jpAgregarUsuario.setBackground(new java.awt.Color(214, 122, 30));
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
        btAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarUsuarioActionPerformed(evt);
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

        jpFondo.add(jpContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 370, 450));

        jpMarcoP.setBackground(new java.awt.Color(255, 255, 255));
        jpMarcoP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpMarcoPMouseDragged(evt);
            }
        });
        jpMarcoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpMarcoPMousePressed(evt);
            }
        });
        jpMarcoP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSalirP.setBackground(new java.awt.Color(255, 255, 255));
        jpSalirP.setLayout(new java.awt.BorderLayout());

        btSalirP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btSalirP.setText("X");
        btSalirP.setBorder(null);
        btSalirP.setContentAreaFilled(false);
        btSalirP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalirP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalirPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalirPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalirPMouseExited(evt);
            }
        });
        jpSalirP.add(btSalirP, java.awt.BorderLayout.CENTER);

        jpMarcoP.add(jpSalirP, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 30));

        jpRegresarP.setBackground(new java.awt.Color(255, 255, 255));
        jpRegresarP.setLayout(new java.awt.BorderLayout());

        btRegresarP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btRegresarP.setText("<");
        btRegresarP.setBorder(null);
        btRegresarP.setContentAreaFilled(false);
        btRegresarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRegresarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRegresarPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegresarPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegresarPMouseExited(evt);
            }
        });
        jpRegresarP.add(btRegresarP, java.awt.BorderLayout.CENTER);

        jpMarcoP.add(jpRegresarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        lbTituloP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lbTituloP.setText("jLabel5");
        jpMarcoP.add(lbTituloP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 220, 30));

        jpFondo.add(jpMarcoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        this.jpAgregarUsuario.setBackground(Colores.btNaranjaOscuro);        
    }//GEN-LAST:event_btAgregarUsuarioMouseEntered

    private void btAgregarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAgregarUsuarioMouseExited
        this.jpAgregarUsuario.setBackground(Colores.btNaranja);        
    }//GEN-LAST:event_btAgregarUsuarioMouseExited

    private void btSalirPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirPMouseEntered
        this.jpSalirP.setBackground(Colores.btRojo);
        this.btSalirP.setForeground(Color.white);
    }//GEN-LAST:event_btSalirPMouseEntered

    private void btSalirPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirPMouseExited
        this.jpSalirP.setBackground(Color.white);
        this.btSalirP.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btSalirPMouseExited

    private void jpMarcoPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcoPMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jpMarcoPMousePressed

    private void jpMarcoPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpMarcoPMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
        
    }//GEN-LAST:event_jpMarcoPMouseDragged

    private void btSalirPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirPMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btSalirPMouseClicked

    private void btRegresarPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegresarPMouseEntered
        this.jpRegresarP.setBackground(Colores.btNaranjaClaro);
        this.btRegresarP.setForeground(Color.white);
    }//GEN-LAST:event_btRegresarPMouseEntered

    private void btRegresarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegresarPMouseExited
        this.jpRegresarP.setBackground(Color.white);
        this.btRegresarP.setForeground(Colores.btTextoSalir);
    }//GEN-LAST:event_btRegresarPMouseExited

    private void btRegresarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegresarPMouseClicked
        VentanaMenu vMenu = new VentanaMenu();
        this.cerrarVentana();
    }//GEN-LAST:event_btRegresarPMouseClicked

    private void btAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarUsuarioActionPerformed
        this.cProducto.setCodigoBarras(this.txtCodigoBarras.getText());
        this.cProducto.setNombre(this.txtNombrePro.getText());
        this.cProducto.setPrecio(String.valueOf(this.txtPrecio.getText()));
        this.cProducto.setStock(String.valueOf(this.txtStock.getText()));
        
        if(cProducto.controladorCodigo()){
            JOptionPane.showMessageDialog(null,"No ingreso el código de barras!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.txtCodigoBarras.setText("");
            this.restablecerTextos();
            return;
        }          
        
        if(cProducto.controladorNombre()){
            JOptionPane.showMessageDialog(null,"No ingreso el nombre del producto!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.txtNombrePro.setText("");
            this.restablecerTextos();
            return;
        }
        
        if(cProducto.controladorPrecio()){
            JOptionPane.showMessageDialog(null,"No ingreso el nombre del producto!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.txtPrecio.setText("");
            this.restablecerTextos();
            return;
        }
        
        if(cProducto.controladorStock()){
            JOptionPane.showMessageDialog(null,"No ingreso el nombre del producto!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            this.txtStock.setText("");
            this.restablecerTextos();
            return;
        }
        
        
        
        
        
    }//GEN-LAST:event_btAgregarUsuarioActionPerformed

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
    private javax.swing.JButton btRegresarP;
    private javax.swing.JButton btSalirP;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel jpAgregarUsuario;
    private javax.swing.JPanel jpContenedor;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel jpMarcoP;
    private javax.swing.JPanel jpRegresarP;
    private javax.swing.JPanel jpSalirP;
    private javax.swing.JLabel lbTituloP;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
