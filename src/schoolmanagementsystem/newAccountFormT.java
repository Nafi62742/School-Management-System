/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package schoolmanagementsystem;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
import schoolmanagementsystem.Database.Accounts;

public class newAccountFormT extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    Accounts account;
    public newAccountFormT() {
        this.setUndecorated(true);
        initComponents();
    }
    public newAccountFormT(Accounts account) {
        this.setUndecorated(true);
        initComponents();
        this.account=account;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //....................Start Custom Function.............//
    
    private void clearTextField() {
        nameField.setText("");
        subjectField.setText("");
        designationField.setText("");
        idField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
    }
    private void clearIdField() {
        idField.setText("");
    }
    //....................Start Custom Function.............//
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        updateText6 = new javax.swing.JLabel();
        updateText2 = new javax.swing.JLabel();
        updateText5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        subjectField = new javax.swing.JTextField();
        designationField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
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

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/close.png"))); // NOI18N
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        updateText6.setBackground(new java.awt.Color(255, 255, 255));
        updateText6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText6.setForeground(new java.awt.Color(0, 0, 0));
        updateText6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText6.setText("(must be at least 4 letters)");
        updateText6.setOpaque(true);
        jPanel1.add(updateText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 160, 20));

        updateText2.setBackground(new java.awt.Color(255, 255, 255));
        updateText2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText2.setForeground(new java.awt.Color(0, 0, 0));
        updateText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText2.setText("(Must be less or equal 30 words)");
        updateText2.setOpaque(true);
        jPanel1.add(updateText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 180, 30));

        updateText5.setBackground(new java.awt.Color(255, 255, 255));
        updateText5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        updateText5.setForeground(new java.awt.Color(0, 0, 0));
        updateText5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateText5.setText("(must be unique)");
        updateText5.setOpaque(true);
        jPanel1.add(updateText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 100, 30));

        nameField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        nameField.setBorder(null);
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.setOpaque(false);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameFieldKeyPressed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 430, -1));

        subjectField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        subjectField.setBorder(null);
        subjectField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subjectField.setOpaque(false);
        subjectField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectFieldActionPerformed(evt);
            }
        });
        subjectField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subjectFieldKeyPressed(evt);
            }
        });
        jPanel1.add(subjectField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 430, 30));

        designationField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        designationField.setBorder(null);
        designationField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        designationField.setOpaque(false);
        designationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationFieldActionPerformed(evt);
            }
        });
        designationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                designationFieldKeyPressed(evt);
            }
        });
        jPanel1.add(designationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 430, 30));

        idField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        idField.setBorder(null);
        idField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idField.setOpaque(false);
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        idField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idFieldKeyPressed(evt);
            }
        });
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 380, 30));

        passwordField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setOpaque(false);
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 430, 30));

        confirmPasswordField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        confirmPasswordField.setBorder(null);
        confirmPasswordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        confirmPasswordField.setOpaque(false);
        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(confirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 430, 30));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane2.setText("400.");
        jTextPane2.setOpaque(false);
        jPanel1.add(jTextPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 60, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 430, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 430, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 430, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 430, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 430, 20));
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

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Quit", JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == 0) {
            System.exit(0);
        } 
    }//GEN-LAST:event_exitButtonActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        dispose();
        new logInPage().setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void subjectFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectFieldActionPerformed
    
    private void signupButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButton1ActionPerformed
        
        String name=nameField.getText();
        String originalPass = passwordField.getText();
        if(name.length()>30){
            JOptionPane.showMessageDialog(this, "Name should be shorter.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (originalPass.length() >= 4 && originalPass.equals(confirmPasswordField.getText())) {
            int response=account.createTeacherAccount(name, subjectField.getText(), designationField.getText(), "400."+idField.getText(), originalPass);
            switch (response) {
                case 2:
                    clearIdField();
                    break;
                case 1:
                    new logInPage().setVisible(true);
                    dispose();
                    break;
                default:
                    clearTextField();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please set password correctly", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_signupButton1ActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void nameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyPressed
        // TODO add your handling code here
        String name=nameField.getText();
        int length=name.length();
        
        char c = evt.getKeyChar();
        if((c>='a'&& c<='z')||(c>='A'&& c<='Z')||(c ==' ')){
            if(length<30){
                nameField.setEditable(true);
            }
            else{
                nameField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                nameField.setEditable(true);
            }
            else{
                 nameField.setEditable(false);
            }
        }
    }//GEN-LAST:event_nameFieldKeyPressed

    private void subjectFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectFieldKeyPressed
        // TODO add your handling code here:
        String sub=subjectField.getText();
        int length=sub.length();
        
        char c = evt.getKeyChar();
        if((c>='a'&& c<='z')||(c>='A'&& c<='Z')||(c ==' ')){
            if(length<40){
                subjectField.setEditable(true);
            }
            else{
                subjectField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                subjectField.setEditable(true);
            }
            else{
                 subjectField.setEditable(false);
            }
        }
    }//GEN-LAST:event_subjectFieldKeyPressed

    private void designationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationFieldActionPerformed

    private void designationFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_designationFieldKeyPressed
        // TODO add your handling code here:
        String sub=designationField.getText();
        int length=sub.length();
        
        char c = evt.getKeyChar();
        if((c>='a'&& c<='z')||(c>='A'&& c<='Z')||(c ==' ')){
            if(length<15){
                designationField.setEditable(true);
            }
            else{
                designationField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                designationField.setEditable(true);
            }
            else{
                 designationField.setEditable(false);
            }
        }
    }//GEN-LAST:event_designationFieldKeyPressed

    private void idFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyPressed
        // TODO add your handling code here:
        String phoneNo=idField.getText();
        int length=phoneNo.length();
        
        char c = evt.getKeyChar();
        if(c>='0'&&c<='9'){
            if(length<6){
                idField.setEditable(true);
            }
            else{
                idField.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                idField.setEditable(true);
            }
            else{
                 idField.setEditable(false);
            }
        }
    }//GEN-LAST:event_idFieldKeyPressed
    
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
    private javax.swing.JButton back_btn;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JTextField designationField;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signupButton1;
    private javax.swing.JTextField subjectField;
    private javax.swing.JLabel updateText2;
    private javax.swing.JLabel updateText5;
    private javax.swing.JLabel updateText6;
    // End of variables declaration//GEN-END:variables
}
