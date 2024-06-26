/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VentanasRegistro;

import static VentanasRegistro.VentanaIngreso.titulo;
import java.awt.Color;

/**
 *
 * @author User
 */
public class VentanaFactura extends javax.swing.JFrame{

    private Color colorTextoOriginal = new Color(60, 63, 65);
    private int xMouse, yMouse;
    
    public VentanaFactura() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle(titulo);
        this.lbTituloF.setText(titulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondoFactura = new javax.swing.JPanel();
        jPDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombreFacturador = new javax.swing.JTextField();
        txtNombreCliente1 = new javax.swing.JTextField();
        txtNumFactura = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jPTotal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTotaliva = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFactura = new javax.swing.JTable();
        jpFactura = new javax.swing.JPanel();
        jpSalirC = new javax.swing.JPanel();
        btSalirF = new javax.swing.JButton();
        jpRegresarC = new javax.swing.JPanel();
        btRegresarF = new javax.swing.JButton();
        lbTituloF = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPFondoFactura.setBackground(new java.awt.Color(62, 169, 204));
        jPFondoFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPDatos.setBackground(new java.awt.Color(255, 255, 255));
        jPDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Fecha:");
        jPDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 9, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Facturador:");
        jPDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 52, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("N° Factura:");
        jPDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 9, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("C.I:");
        jPDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 52, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Código:");
        jPDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 92, -1, -1));

        txtCedula.setBackground(new java.awt.Color(204, 204, 204));
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setText("000000000");
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPDatos.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 49, 90, -1));

        txtNombreFacturador.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreFacturador.setForeground(new java.awt.Color(0, 0, 0));
        jPDatos.add(txtNombreFacturador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 49, 143, -1));

        txtNombreCliente1.setBackground(new java.awt.Color(204, 204, 204));
        txtNombreCliente1.setForeground(new java.awt.Color(0, 0, 0));
        jPDatos.add(txtNombreCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 49, 143, -1));

        txtNumFactura.setBackground(new java.awt.Color(204, 204, 204));
        txtNumFactura.setForeground(new java.awt.Color(0, 0, 0));
        txtNumFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFacturaActionPerformed(evt);
            }
        });
        jPDatos.add(txtNumFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 6, 94, -1));

        txtFecha.setBackground(new java.awt.Color(204, 204, 204));
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setActionCommand("<Not Set>");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPDatos.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 6, 90, -1));

        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPDatos.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 89, 93, -1));

        jPFondoFactura.add(jPDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 36, 878, 120));

        jPTotal.setBackground(new java.awt.Color(255, 255, 255));
        jPTotal.setForeground(new java.awt.Color(255, 255, 255));
        jPTotal.setFocusTraversalPolicyProvider(true);
        jPTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sub Total:");
        jPTotal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 19, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Total IVA:");
        jPTotal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 53, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total: ");
        jPTotal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        txtSubTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        jPTotal.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 16, 93, -1));

        txtTotaliva.setBackground(new java.awt.Color(204, 204, 204));
        txtTotaliva.setForeground(new java.awt.Color(0, 0, 0));
        txtTotaliva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalivaActionPerformed(evt);
            }
        });
        jPTotal.add(txtTotaliva, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 50, 93, -1));

        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPTotal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 90, 93, -1));

        jPFondoFactura.add(jPTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 870, 120));

        jTableFactura.setBackground(new java.awt.Color(255, 255, 255));
        jTableFactura.setForeground(new java.awt.Color(0, 0, 0));
        jTableFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Subtotal", "IVA", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFactura);
        if (jTableFactura.getColumnModel().getColumnCount() > 0) {
            jTableFactura.getColumnModel().getColumn(4).setResizable(false);
        }

        jPFondoFactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 870, 280));

        jpFactura.setBackground(new java.awt.Color(255, 255, 255));
        jpFactura.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpFacturaMouseDragged(evt);
            }
        });
        jpFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpFacturaMousePressed(evt);
            }
        });
        jpFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSalirC.setBackground(new java.awt.Color(255, 255, 255));
        jpSalirC.setLayout(new java.awt.BorderLayout());

        btSalirF.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btSalirF.setText("X");
        btSalirF.setContentAreaFilled(false);
        btSalirF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalirF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalirFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSalirFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSalirFMouseExited(evt);
            }
        });
        btSalirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirFActionPerformed(evt);
            }
        });
        jpSalirC.add(btSalirF, java.awt.BorderLayout.CENTER);

        jpFactura.add(jpSalirC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 50, 30));

        jpRegresarC.setBackground(new java.awt.Color(255, 255, 255));
        jpRegresarC.setLayout(new java.awt.BorderLayout());

        btRegresarF.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btRegresarF.setText("<");
        btRegresarF.setContentAreaFilled(false);
        btRegresarF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRegresarF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegresarFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegresarFMouseExited(evt);
            }
        });
        btRegresarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarFActionPerformed(evt);
            }
        });
        jpRegresarC.add(btRegresarF, java.awt.BorderLayout.CENTER);

        jpFactura.add(jpRegresarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        lbTituloF.setText("jLabel7");
        jpFactura.add(lbTituloF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 200, 30));

        jPFondoFactura.add(jpFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondoFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtNumFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFacturaActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtTotalivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalivaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalivaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btSalirFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirFMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btSalirFMouseClicked

    private void btSalirFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirFMouseEntered
        this.jpSalirC.setBackground(Colores.btRojo);
        this.btSalirF.setForeground(Color.white);
    }//GEN-LAST:event_btSalirFMouseEntered

    private void btSalirFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalirFMouseExited
        this.jpSalirC.setBackground(Color.white);
        this.btSalirF.setForeground(Colores.btTextoSalir);
    }//GEN-LAST:event_btSalirFMouseExited

    private void btSalirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalirFActionPerformed

    private void btRegresarFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegresarFMouseEntered
        this.jpRegresarC.setBackground(Colores.btCeleste);
        this.btRegresarF.setForeground(Color.white);
    }//GEN-LAST:event_btRegresarFMouseEntered

    private void btRegresarFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegresarFMouseExited
        this.jpRegresarC.setBackground(Color.white);
        this.btRegresarF.setForeground(Colores.btTextoSalir);
    }//GEN-LAST:event_btRegresarFMouseExited

    private void btRegresarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarFActionPerformed
        VentanaMenu vMenu = new VentanaMenu();
        this.cerrarVentana();
    }//GEN-LAST:event_btRegresarFActionPerformed

    private void jpFacturaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFacturaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpFacturaMouseDragged

    private void jpFacturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpFacturaMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY();
    }//GEN-LAST:event_jpFacturaMousePressed

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
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaFactura().setVisible(true);
            }
        });
    }
private void pintar() {
        this.lbTituloF.setForeground(Colores.btTextoSalir);
        this.btSalirF.setForeground(Colores.btTextoSalir);
        this.btRegresarF.setForeground(Colores.btTextoSalir);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegresarF;
    private javax.swing.JButton btSalirF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatos;
    private javax.swing.JPanel jPFondoFactura;
    private javax.swing.JPanel jPTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFactura;
    private javax.swing.JPanel jpFactura;
    private javax.swing.JPanel jpRegresarC;
    private javax.swing.JPanel jpSalirC;
    private javax.swing.JLabel lbTituloF;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombreCliente1;
    private javax.swing.JTextField txtNombreFacturador;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotaliva;
    // End of variables declaration//GEN-END:variables
}
