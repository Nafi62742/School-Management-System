/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import schoolmanagementsystem.Database.Accounts;

/**
 *
 * @author Administrator
 */
public class popUp extends javax.swing.JFrame {

    Accounts account;
    public popUp() {
        this.setUndecorated(true);
        initComponents();
    }
    public popUp(Accounts account) {
        this.setUndecorated(true);
        initComponents();
        this.account=account;
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
        teacher = new javax.swing.JButton();
        student = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/teacher.PNG"))); // NOI18N
        teacher.setText("jButton1");
        teacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacher.setOpaque(false);
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        jPanel1.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 200, 60));

        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/stu.PNG"))); // NOI18N
        student.setText("jButton1");
        student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        student.setOpaque(false);
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel1.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 170, 60));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/close.png"))); // NOI18N
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setOpaque(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/pop up.PNG"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.black, java.awt.Color.black));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 500, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/Webp_edited.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setOpaque(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 410, 720));

        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setOpaque(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 840, 30));

        b3.setText("jButton3");
        b3.setActionCommand("");
        b3.setBorder(null);
        b3.setBorderPainted(false);
        b3.setOpaque(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 370, 680));

        b4.setBorder(null);
        b4.setBorderPainted(false);
        b4.setOpaque(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 500, 290));

        b5.setBorder(null);
        b5.setBorderPainted(false);
        b5.setOpaque(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 500, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
        newAccountForm nF = new newAccountForm(account);

        nF.setVisible(true);
        nF.setResizable(false);

        nF.setDefaultCloseOperation(nF.DO_NOTHING_ON_CLOSE);
        
        popUp pU = new popUp();
        dispose();
    }//GEN-LAST:event_studentActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
        newAccountFormT nFT = new newAccountFormT(account);

        nFT.setVisible(true);
        nFT.setResizable(false);

        nFT.setDefaultCloseOperation(nFT.DO_NOTHING_ON_CLOSE);
        
        popUp pU = new popUp();
        dispose();
    }//GEN-LAST:event_teacherActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        logInPage LP= new logInPage();
       
        LP.setVisible(true);
        LP.setResizable(false);
        LP.setDefaultCloseOperation(LP.DO_NOTHING_ON_CLOSE);
        
        popUp pU = new popUp();
        dispose();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        logInPage LP= new logInPage();
       
        LP.setVisible(true);
        LP.setResizable(false);
        LP.setDefaultCloseOperation(LP.DO_NOTHING_ON_CLOSE);
        
        popUp pU = new popUp();
        dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        logInPage LP= new logInPage();
       
        LP.setVisible(true);
        LP.setResizable(false);
        LP.setDefaultCloseOperation(LP.DO_NOTHING_ON_CLOSE);
        
        popUp pU = new popUp();
        dispose();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        logInPage LP= new logInPage();
       
        LP.setVisible(true);
        LP.setResizable(false);
        LP.setDefaultCloseOperation(LP.DO_NOTHING_ON_CLOSE);
        
        popUp pU = new popUp();
        dispose();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        logInPage LP= new logInPage();
       
        LP.setVisible(true);
        LP.setResizable(false);
        LP.setDefaultCloseOperation(LP.DO_NOTHING_ON_CLOSE);
        
        popUp pU = new popUp();
        dispose();
    }//GEN-LAST:event_b5ActionPerformed

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
            java.util.logging.Logger.getLogger(popUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(popUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(popUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(popUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new popUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton student;
    private javax.swing.JButton teacher;
    // End of variables declaration//GEN-END:variables
}
