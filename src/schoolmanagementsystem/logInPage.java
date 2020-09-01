/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package schoolmanagementsystem;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.prefs.Preferences;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Administrator
 */
public class logInPage extends javax.swing.JFrame {
    public Preferences pref = Preferences.userRoot().node("Rememberme");
    public Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private Statement st;
    private String id;
    public logInPage() {
        this.setUndecorated(true);
        conn = JConnection.connectdb();
        if(isUserLoggedIn()){
            
            if(id.contains("100.")){
                new StudentProfile(id).setVisible(true);
                dispose();
            }else if(id.contains("400.")){
                new TeacherProfile(id).setVisible(true);
                dispose();
            }
        }else{
            initComponents();
        }
//        rememberMark();

/*String usr = null;
usr= pref.get("Id", usr);
usernameField.setText(usr);

String pss = null;
pss= pref.get("Password", pss);
passwordField.setText(EncryptPass(pss));
*/
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
        rememberUserCheckbox = new javax.swing.JCheckBox();
        idField = new javax.swing.JTextField();
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

        rememberUserCheckbox.setBackground(new java.awt.Color(44, 27, 95));
        rememberUserCheckbox.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        rememberUserCheckbox.setForeground(new java.awt.Color(250, 250, 250));
        rememberUserCheckbox.setText("    Remember me");
        rememberUserCheckbox.setContentAreaFilled(false);
        rememberUserCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberUserCheckboxActionPerformed(evt);
            }
        });
        jPanel1.add(rememberUserCheckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 200, 40));

        idField.setBackground(new java.awt.Color(112, 144, 196));
        idField.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        idField.setForeground(new java.awt.Color(255, 255, 255));
        idField.setText("Enter Your ID");
        idField.setBorder(null);
        idField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        idField.setOpaque(false);
        idField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFieldFocusGained(evt);
            }
        });
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 360, 50));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 360, 10));

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setText("Enter Pass");
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setOpaque(false);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 320, 360, 40));

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
        jPanel1.add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 550, 140, 50));

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
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        jPanel1.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 30, 30));

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
    
//...................Start Custom Functions....................//
    
    private boolean isUserLoggedIn(){
        final JPanel panel = new JPanel();
        try {
            
            InetAddress myIP=InetAddress.getLocalHost();
            String sql = "select id from login_info where ip_address=\'" + myIP.getHostAddress() + "\' and state=1";
            try{
                st = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    this.id=rs.getString(1);
                    return true;
                }else{
                    return false;
                }
            }catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(panel, "Database error. Auto login failed.","Warning",JOptionPane.WARNING_MESSAGE);
            }
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(panel, "Sorry, Can't get your IP Address.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    private String DecryptPass(String passwordString) {
        try {
            byte[] byteArray = Base64.decodeBase64(passwordString.getBytes());
            String decodedString = new String(byteArray);
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
    private boolean userValid(String id,String pass,String table){
        final JPanel panel = new JPanel();
        String sql = "select id from " + table + " where id=\'" + id + "\' and pass=\'" + pass + "\'";
        try{
            st = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            }else{
                JOptionPane.showMessageDialog(this, "User not valid", "Warning", JOptionPane.WARNING_MESSAGE);
                clearTextField();
                return false;
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    private void clearTextField(){
        idField.setText("");
        passwordField.setText("");
    }
    
//...................End Custom Functions....................//
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
            
            savedIdPass(idField.getText(),passwordField.getText(),"true");
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
                    rememberUserCheckbox.setSelected(true);
                    idField.setText(rs.getString("rem_uname"));
                    passwordField.setText(DecryptPass(rs.getString("rem_pass")));
                }
                else{
                    rememberUserCheckbox.setSelected(false);
                    idField.setText("Enter Username");
                    passwordField.setText(DecryptPass(rs.getString("rem_pass")));
                }
            }
        }catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void idFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusGained
        idField.setText("");
    }//GEN-LAST:event_idFieldFocusGained

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
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
        
        String id = idField.getText();
        String pass = EncryptPass(passwordField.getText());
        String table = null;
        String sql =null;
        
        if(id.equals("")||pass.equals("")){
            JOptionPane.showMessageDialog(panel, "Invalid Credentials","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            if (id.contains("100.")) {
                table = "student_accounts";
            } else if(id.contains("400.")){
                table = "teacher_accounts";
            }else{
                JOptionPane.showMessageDialog(this, "User not valid", "Warning", JOptionPane.WARNING_MESSAGE);
                clearTextField();
                return;
            }
            if(rememberUserCheckbox.isSelected() == true){
                try{
                    if(userValid(id,pass,table)){
                        InetAddress myIP=InetAddress.getLocalHost();
                        //Check user once logged in or not
                        String sql2="select id from login_info where id=\'" + id + "\' and ip_address=\'" + myIP.getHostAddress() + "\'";
                        st = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                        rs = st.executeQuery(sql2);
                        if(rs.next()){
                            PreparedStatement  preparedStatement = conn.prepareStatement("update login_info set state =?  where id = \'"+id+"\' and ip_address=\'"+myIP.getHostAddress()+"\'");
                            preparedStatement.setInt(1, 1);
                            int update_done = preparedStatement.executeUpdate();
                        }else{
                            sql = "INSERT INTO login_info(id,ip_address,state) VALUES(?,?,?)";
                            pst = conn.prepareStatement(sql);
                            pst.setString(1, id);
                            pst.setString(2, myIP.getHostAddress());
                            pst.setInt(3, 1);
                            pst.execute();
                        }
                        if(id.contains("100.")){
                            new StudentProfile(id).setVisible(true);
                        }else if(id.contains("400.")){
                            new TeacherProfile(id).setVisible(true);
                        }
                        dispose();
                    }
                }
                catch(UnknownHostException e){
                    JOptionPane.showMessageDialog(panel, "Sorry, Can't get your IP Address.","Warning",JOptionPane.WARNING_MESSAGE);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }else{
                if(userValid(id,pass,table)){
                    if(id.contains("100.")){
                        new StudentProfile(id).setVisible(true);
                    }else if(id.contains("400.")){
                        new TeacherProfile(id).setVisible(true);
                    }
                    dispose();
                }
            }
        }
        
    }//GEN-LAST:event_signinButtonActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        // TODO add your handling code here:
        //savedIdPass("Enter Username","Password");
        System.exit(0);
    }//GEN-LAST:event_close_btnActionPerformed

    private void rememberUserCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberUserCheckboxActionPerformed
//        String cell;

//if checkbox is marked

//        if(checkRemeber.isSelected() == true){
//             checked(true);
//         }
//         else{
//             checked(false);
//         }
    }//GEN-LAST:event_rememberUserCheckboxActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            final JPanel panel = new JPanel();
            
            String id = idField.getText();
            String pass = EncryptPass(passwordField.getText());
            String table = null;
            String sql =null;
            
            if(id.equals("")||pass.equals("")){
                JOptionPane.showMessageDialog(panel, "Invalid Credentials","Warning",JOptionPane.WARNING_MESSAGE);
            }else{
                if (id.contains("100.")) {
                    table = "student_accounts";
                } else if(id.contains("400.")){
                    table = "teacher_accounts";
                }else{
                    JOptionPane.showMessageDialog(this, "User not valid", "Warning", JOptionPane.WARNING_MESSAGE);
                    clearTextField();
                    return;
                }
                if(userValid(id,pass,table)){
                    if(id.contains("100.")){
                        new StudentProfile(id).setVisible(true);
                    }else if(id.contains("400.")){
                        new TeacherProfile(id).setVisible(true);
                    }
                    dispose();
                }
                
            }
            
        }
    }//GEN-LAST:event_passwordFieldKeyPressed
    
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
    private javax.swing.JButton close_btn;
    private javax.swing.JTextField idField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox rememberUserCheckbox;
    private javax.swing.JButton signinButton;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
