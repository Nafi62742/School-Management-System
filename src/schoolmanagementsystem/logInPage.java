    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.prefs.Preferences;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Administrator
 */
public class logInPage extends javax.swing.JFrame {

    public Preferences pref = Preferences.userRoot().node("Rememberme");
    
    
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Statement st;

    
    public logInPage() {
        
        this.setUndecorated(true);
        initComponents();
        
        rememberMark();
        
        /*String usr = null;
        usr= pref.get("Id", usr);
        usernameField.setText(usr);
        
        String pss = null;
        pss= pref.get("Password", pss);
        passwordField.setText(EncryptPass(pss));
        */
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
        jTextPane1 = new javax.swing.JTextPane();
        jTextPane2 = new javax.swing.JTextPane();
        checkRemeber = new javax.swing.JCheckBox();
        usernameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        signinButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        close_btn = new javax.swing.JButton();
        BackgroundLebel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("ID");
        jTextPane1.setOpaque(false);
        jPanel1.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 70, 40));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("Password");
        jTextPane2.setOpaque(false);
        jPanel1.add(jTextPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 270, 140, 40));

        checkRemeber.setBackground(new java.awt.Color(44, 27, 95));
        checkRemeber.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        checkRemeber.setForeground(new java.awt.Color(250, 250, 250));
        checkRemeber.setText("    Remember me");
        checkRemeber.setContentAreaFilled(false);
        checkRemeber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRemeberActionPerformed(evt);
            }
        });
        jPanel1.add(checkRemeber, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 200, 40));

        usernameField.setBackground(new java.awt.Color(112, 144, 196));
        usernameField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setText("Enter ID");
        usernameField.setBorder(null);
        usernameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameField.setOpaque(false);
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
        });
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 360, 50));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 360, 10));

        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("Enter Password");
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setOpaque(false);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 360, 40));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 360, 10));

        signinButton.setBorder(null);
        signinButton.setBorderPainted(false);
        signinButton.setContentAreaFilled(false);
        signinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 140, 50));

        signupButton.setBorder(null);
        signupButton.setBorderPainted(false);
        signupButton.setContentAreaFilled(false);
        signupButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });
        jPanel1.add(signupButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 550, 130, 50));

        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/close.png"))); // NOI18N
        close_btn.setBorder(null);
        close_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_btn.setOpaque(false);
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        jPanel1.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 30, 30));

        BackgroundLebel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/Webp.net-resizeimage.PNG"))); // NOI18N
        jPanel1.add(BackgroundLebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 320, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String DecryptPass(String passwordString) {

        String strDecryptedText = new String();

        try {

            // Get bytes from string
            byte[] byteArray = Base64.decodeBase64(passwordString.getBytes());

            // Print the decoded array
            System.out.println(Arrays.toString(byteArray));

            String decodedString = new String(byteArray);
            // Print the decoded string 
//            System.out.println(passwordString + " = " + decodedString);

            return decodedString;

        } catch (Exception e) {
            System.out.println(e);

        }
        return null;
    }
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
    public void savedIdPass(String Id ,String Pass,String Cell){
        if(Id == null || Pass == null|| Cell == null)
        {
            System.out.println("ID pass is not given");
        }
        else{
            String user = Id;
            
            String pass = Pass;
            String cell =Cell;
            
            System.out.println("Data inserted");
            
            String sql = " UPDATE remember_password SET rem_uname=?,rem_pass=?,state=? WHERE 1";
            String rem_pass = null;
            
            String originalPass = passwordField.getText();
            if (originalPass.length() >= 4 ) {
            pass = EncryptPass(originalPass);
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, user);
                pst.setString(2, pass);
                pst.setString(3, cell);
                pst.execute();
                //clearTextField();
                JOptionPane.showMessageDialog(null, "Inserted Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            } else {
                JOptionPane.showMessageDialog(this, "Please set password correctly", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }
    public final void checked(boolean remeber){
        if(remeber == true){
            
            savedIdPass(usernameField.getText(),passwordField.getText(),"true");
        }
        else {
            savedIdPass("Enter Username","","false");
        }
    }
    
    public void rememberMark(){
                final JPanel panel = new JPanel();
               String sel,dep;  
               String sql = null;
                String pass = EncryptPass(passwordField.getText());
                String table = null;
               try{                          
                    Class.forName("com.mysql.jdbc.Driver"); 
                    conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/school_management_system","root","");
                    pst=(PreparedStatement) conn.prepareStatement("SELECT * FROM remember_password WHERE 1");
                    rs=pst.executeQuery(); 
                    if(rs.next())              
                    {                 
                        sel=rs.getString("state");
                                              
                                       
                        if(sel.equals("true"))                 
                        {                     
                        checkRemeber.setSelected(true);                     
                        usernameField.setText(rs.getString("rem_uname"));                     
                        passwordField.setText(DecryptPass(rs.getString("rem_pass")));                 
                        }
                        else{                 
                        checkRemeber.setSelected(false);                     
                        usernameField.setText("Enter Username");
                        passwordField.setText(DecryptPass(rs.getString("rem_pass"))); 
                        }
                    }
                }catch (Exception e) {
                       JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
                }                    
    
    }
    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        usernameField.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldFocusGained

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        popUp pU = new popUp();

        pU.setVisible(true);
        pU.setResizable(false);

        pU.setDefaultCloseOperation(pU.DO_NOTHING_ON_CLOSE);

        logInPage lF = new logInPage();
        dispose();
    }//GEN-LAST:event_signupButtonActionPerformed
    
    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
         final JPanel panel = new JPanel();

        
        
        
        //normal login
        String uname = usernameField.getText();
        String pass = EncryptPass(passwordField.getText());
        String sql = null;
       // String type = (String) typeComboBox.getSelectedItem();
        String table = null;
        
        String type = "Student";
        
        if (type.equals("Student")) {
            table = "student_accounts";
        } else {
            table = "teacher_accounts";
        }

        try {
        
            sql = "select uname from " + table + " where uname=\'" + uname + "\' and pass=\'" + pass + "\'";
            st = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                String query = "update " + table + " set active=1 where uname='" + uname + "\'";
                pst = conn.prepareStatement(query);
                pst.execute();
                if(table.equals("student_accounts")){
                    StudentProfile SP = new StudentProfile();
                    SP.setVisible(true);
                    dispose();
                }
                else{
                    TeacherProfile SP = new TeacherProfile();
                    SP.setVisible(true);
                    dispose();
                }
                
            } else {
                JOptionPane.showMessageDialog(this, "User not valid", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_signinButtonActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        // TODO add your handling code here:
        //savedIdPass("Enter Username","Password");
        System.exit(0);
    }//GEN-LAST:event_close_btnActionPerformed

    private void checkRemeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRemeberActionPerformed
        String cell;
        
         //if checkbox is marked
         
        if(checkRemeber.isSelected() == true){
             checked(true);    
         }
         else{
             checked(false);
         }
    }//GEN-LAST:event_checkRemeberActionPerformed

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
            java.util.logging.Logger.getLogger(logInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logInPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logInPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLebel;
    private javax.swing.JCheckBox checkRemeber;
    private javax.swing.JButton close_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton signinButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
