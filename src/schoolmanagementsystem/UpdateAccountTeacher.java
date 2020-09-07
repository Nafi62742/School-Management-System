/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package schoolmanagementsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;
import schoolmanagementsystem.Database.StudentDatabase;
import schoolmanagementsystem.Database.TeacherDatabase;

public class UpdateAccountTeacher extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    private String id;
    TeacherDatabase teacherDb;
    
    public UpdateAccountTeacher() {
        this.setUndecorated(true);
        initComponents();
        conn = JConnection.connectdb();
        teacherDb=new TeacherDatabase(this.id);
    }
    
    public UpdateAccountTeacher(String id) {
        this.setUndecorated(true);
        initComponents();
        conn = JConnection.connectdb();
        this.id = id;
        teacherDb=new TeacherDatabase(this.id);
        profileShow();
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
        UpdateLogo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        subjectField = new javax.swing.JTextField();
        designationField = new javax.swing.JTextField();
        jTextPane1 = new javax.swing.JTextPane();
        NumberText = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        PhoneNoField = new javax.swing.JTextField();
        confirmPasswordField = new javax.swing.JPasswordField();
        EmailText = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        back_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdateLogo.setBackground(new java.awt.Color(255, 255, 255));
        UpdateLogo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        UpdateLogo.setForeground(new java.awt.Color(0, 0, 153));
        UpdateLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UpdateLogo.setText("Update");
        UpdateLogo.setOpaque(true);
        jPanel1.add(UpdateLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, 180, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/close.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 30, 30));

        nameField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        nameField.setBorder(null);
        nameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameField.setOpaque(false);
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 440, -1));

        subjectField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        subjectField.setBorder(null);
        subjectField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        subjectField.setOpaque(false);
        subjectField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectFieldActionPerformed(evt);
            }
        });
        jPanel1.add(subjectField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 430, 30));

        designationField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        designationField.setBorder(null);
        designationField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        designationField.setOpaque(false);
        jPanel1.add(designationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 430, 30));
        jPanel1.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NumberText.setBackground(new java.awt.Color(255, 255, 255));
        NumberText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        NumberText.setForeground(new java.awt.Color(0, 0, 0));
        NumberText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NumberText.setText("Phone number");
        NumberText.setOpaque(true);
        jPanel1.add(NumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 190, 30));

        EmailField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        EmailField.setBorder(null);
        EmailField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EmailField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        EmailField.setOpaque(false);
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        jPanel1.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 430, 30));

        PhoneNoField.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        PhoneNoField.setBorder(null);
        PhoneNoField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PhoneNoField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PhoneNoField.setOpaque(false);
        PhoneNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoFieldActionPerformed(evt);
            }
        });
        jPanel1.add(PhoneNoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 430, 30));

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

        EmailText.setBackground(new java.awt.Color(255, 255, 255));
        EmailText.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        EmailText.setForeground(new java.awt.Color(0, 0, 0));
        EmailText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EmailText.setText("Email");
        EmailText.setOpaque(true);
        jPanel1.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 320, 20));
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

        UpdateButton.setBorder(null);
        UpdateButton.setBorderPainted(false);
        UpdateButton.setContentAreaFilled(false);
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 680, 170, 60));

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

    
    public void profileShow() {
        String teacherName = teacherDb.getTeacherName();
        nameField.setText(teacherName);
        PhoneNoField.setText(teacherDb.getId());
        subjectField.setText(teacherDb.getTeacherSubject());
        designationField.setText(teacherDb.getDesignation());
        PhoneNoField.setText(teacherDb.getTeacherPhoneNo());
        EmailField.setText(teacherDb.getTeacherEmail());

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        dispose();
        new TeacherProfile(this.id).setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void subjectFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectFieldActionPerformed
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
        nameField.setText("");
        subjectField.setText("");
        designationField.setText("");
        PhoneNoField.setText("");
        EmailField.setText("");
        confirmPasswordField.setText("");
    }
    
    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        String Teacher_Id = teacherDb.getId();
        //System.out.println(Teacher_Id);
        String sql = "UPDATE teacher_accounts SET name=?,subject=?,designation=?, phoneNo=?, email=? WHERE id =" + Teacher_Id;
        String pass = null;
        String name=nameField.getText();
        String DBpass = teacherDb.getPassFromTDB();
        String originalPass = confirmPasswordField.getText();
        pass = EncryptPass(originalPass);
        if(name.length()>30){
            JOptionPane.showMessageDialog(this, "Name should be shorter.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (originalPass.length() >= 4   && pass.equals(DBpass)) {
            
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, nameField.getText());
                pst.setString(2, subjectField.getText());
                pst.setString(3, designationField.getText());
                pst.setString(4, PhoneNoField.getText());
                pst.setString(5, EmailField.getText());
                pst.execute();
                clearTextField();
                JOptionPane.showMessageDialog(null, "Updated Successfully");
                dispose();
                new TeacherProfile(this.id).setVisible(true);
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please set password correctly", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void PhoneNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed
    
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
            java.util.logging.Logger.getLogger(UpdateAccountTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAccountTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAccountTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailText;
    private javax.swing.JLabel NumberText;
    private javax.swing.JTextField PhoneNoField;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel UpdateLogo;
    private javax.swing.JButton back_btn;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JTextField designationField;
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
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField subjectField;
    // End of variables declaration//GEN-END:variables
}
