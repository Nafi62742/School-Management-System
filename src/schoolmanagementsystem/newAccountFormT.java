/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

public class newAccountFormT extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st;

    public newAccountFormT() {
        this.setUndecorated(true);
        initComponents();
        conn = JConnection.connectdb();
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
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        class_ = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        jTextPane1 = new javax.swing.JTextPane();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        passwordFieldConfirm = new javax.swing.JPasswordField();
        jTextPane2 = new javax.swing.JTextPane();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        back_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        signupButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/close.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 30, 30));

        name.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        name.setBorder(null);
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        name.setOpaque(false);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 440, -1));

        class_.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        class_.setBorder(null);
        class_.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        class_.setOpaque(false);
        class_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_ActionPerformed(evt);
            }
        });
        jPanel1.add(class_, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 430, 30));

        ID.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        ID.setBorder(null);
        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ID.setOpaque(false);
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 440, 30));
        jPanel1.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        usernameField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        usernameField.setBorder(null);
        usernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameField.setOpaque(false);
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 400, 30));

        passwordField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordField.setOpaque(false);
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 440, 30));

        passwordFieldConfirm.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        passwordFieldConfirm.setBorder(null);
        passwordFieldConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordFieldConfirm.setOpaque(false);
        passwordFieldConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(passwordFieldConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 440, 30));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane2.setText("400");
        jTextPane2.setOpaque(false);
        jPanel1.add(jTextPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 40, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 430, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 440, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 440, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 430, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 440, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 430, 10));

        back_btn.setBorder(null);
        back_btn.setBorderPainted(false);
        back_btn.setContentAreaFilled(false);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/sirAccount_1.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 770));

        signupButton1.setBorder(null);
        signupButton1.setBorderPainted(false);
        signupButton1.setContentAreaFilled(false);
        signupButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(signupButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, 170, 60));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        popUp pU = new popUp();

        pU.setVisible(true);
        pU.setResizable(false);

        pU.setDefaultCloseOperation(pU.DO_NOTHING_ON_CLOSE);

        newAccountFormT nFT = new newAccountFormT();
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void class_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_class_ActionPerformed
    private String EncryptPass(String passwordString) {
        try {
            String originalInput = passwordString;
            Base64 base64 = new Base64();
            String encodedString = new String(base64.encode(originalInput.getBytes()));
            return encodedString;
        } catch (Exception e) {
            System.out.println("Password encryption failed");
        }
        return null;
    }

    private void clearTextField() {
        name.setText("");
        class_.setText("");
       
        ID.setText("");
        usernameField.setText("");
        passwordField.setText("");
        passwordFieldConfirm.setText("");
    }
    private void signupButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButton1ActionPerformed
        String sql = "INSERT INTO teacher_accounts(name,class,sec,id,uname,pass,active) VALUES(?,?,?,?,?,?,?)";
        String pass = null;

        String originalPass = passwordField.getText();
        if (originalPass.length() >= 4 && originalPass.equals(passwordFieldConfirm.getText())) {
            pass = EncryptPass(originalPass);
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, name.getText());
                pst.setString(2, class_.getText());
                
                pst.setString(4, ID.getText());
                pst.setString(5, usernameField.getText());
                pst.setString(6, pass);
                pst.setInt(7,0);
                pst.execute();
                clearTextField();
                JOptionPane.showMessageDialog(null, "Inserted Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please set password correctly", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_signupButton1ActionPerformed

    private void passwordFieldConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldConfirmActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

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
            java.util.logging.Logger.getLogger(newAccountFormT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newAccountFormT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newAccountFormT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newAccountFormT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newAccountFormT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton back_btn;
    private javax.swing.JTextField class_;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordFieldConfirm;
    private javax.swing.JButton signupButton1;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
