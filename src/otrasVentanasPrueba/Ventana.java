package otrasVentanasPrueba;

import java.awt.Color;

public class Ventana extends javax.swing.JFrame {
    
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblConversor = new javax.swing.JLabel();
        btn$_U$S = new javax.swing.JButton();
        btnU$S_$ = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        txtConversor = new javax.swing.JTextField();
        lblMousePosition = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        lblConversor.setText("Ingrese Monto:");
        lblConversor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConversorMouseClicked(evt);
            }
        });

        btn$_U$S.setText("$ a U$S");
        btn$_U$S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn$_U$SActionPerformed(evt);
            }
        });

        btnU$S_$.setText("U$S a $");
        btnU$S_$.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnU$S_$ActionPerformed(evt);
            }
        });

        lblMousePosition.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblConversor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConversor, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btn$_U$S)
                        .addGap(89, 89, 89)
                        .addComponent(btnU$S_$))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMousePosition)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblConversor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn$_U$S)
                    .addComponent(btnU$S_$))
                .addGap(38, 38, 38)
                .addComponent(txtConversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(lblMousePosition)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn$_U$SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn$_U$SActionPerformed
        String texto = txtMonto.getText();
        double valor = Double.parseDouble(texto);
        double resultado = valor / 280;
        txtConversor.setText(String.format("%.2f", resultado));
    }//GEN-LAST:event_btn$_U$SActionPerformed

    private void btnU$S_$ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU$S_$ActionPerformed
        String texto = txtMonto.getText();
        double valor = Double.parseDouble(texto);
        double resultado = valor * 280;
        txtConversor.setText(String.format("%.1f", resultado));
    }//GEN-LAST:event_btnU$S_$ActionPerformed

    private void lblConversorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConversorMouseClicked
        if (lblConversor.getForeground().equals(Color.blue)) {
            lblConversor.setForeground(Color.black);
        } else {
            lblConversor.setForeground(Color.blue);
        }
    }//GEN-LAST:event_lblConversorMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        lblMousePosition.setText("(" + evt.getX() + ") , (" + evt.getY() + ")");
    }//GEN-LAST:event_formMouseMoved
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn$_U$S;
    private javax.swing.JButton btnU$S_$;
    private javax.swing.JLabel lblConversor;
    private javax.swing.JLabel lblMousePosition;
    private javax.swing.JTextField txtConversor;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
