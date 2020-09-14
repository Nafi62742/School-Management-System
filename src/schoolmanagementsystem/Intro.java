package schoolmanagementsystem;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.jOptionPane;
import schoolmanagementsystem.Database.Accounts;


public class Intro extends javax.swing.JFrame {
    Accounts account;
    
    public Intro() {
        
        //this.setUndecorated(true);
        
        initComponents();
       showlogo();
        
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
        exitButton = new javax.swing.JButton();
        logoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        intro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextPane2 = new javax.swing.JTextPane();
        jTextPane1 = new javax.swing.JTextPane();
        rememberUserCheckbox = new javax.swing.JCheckBox();
        passwordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        idField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        BackgroundLebel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/close.png"))); // NOI18N
        exitButton.setBorder(null);
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 30, 30));

        logoPanel.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("School Management System");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 540, 80));

        intro.setBackground(new java.awt.Color(19, 10, 52));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/intro.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout introLayout = new javax.swing.GroupLayout(intro);
        intro.setLayout(introLayout);
        introLayout.setHorizontalGroup(
            introLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, Short.MAX_VALUE)
        );
        introLayout.setVerticalGroup(
            introLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane2.setText("Password");
        jTextPane2.setOpaque(false);
        jPanel1.add(jTextPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 270, 140, 40));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("ID");
        jTextPane1.setOpaque(false);
        jPanel1.add(jTextPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 70, 40));

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
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 320, 370, 40));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 360, 10));

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

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 360, 360, 10));

        BackgroundLebel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagementsystem/image/Webp.net-resizeimage.PNG"))); // NOI18N
        jPanel1.add(BackgroundLebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    int x =0;
    public void showlogo(){
        //logoPanel.setVisible(false);
        if(x==0)
        {
            intro.setSize(1280,0);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i = 0;i<=1280;i=i+1){
                            Thread.sleep(2);
                            logoPanel.setSize(i,720);
                        }
                        //intro.setSize(1280,0);
                    }catch(Exception e){
                        jOptionPane.showMessegeDialog(null,e);
                    }
                }
            };th.start();
            hideintro();
            x=720;
        }
    }
    int y =720;
    public void hideintro(){
        if(y==720)
        {
            intro.setSize(1280,720);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i = 1280;i>=0;i=i-1){
                           
                            Thread.sleep(1);
                            intro.setSize(1280,i);
                            if(i==200)
                            {
                                logoPanel.setVisible(false);
                            } 
                            
                        }
                        //intro.setSize(1280,0);
                    }catch(Exception e){
                        jOptionPane.showMessegeDialog(null,e);
                    }
                    dispose();
                }
            };th.start();
            y=0;
            
            logInPage LP = new logInPage();
            LP.setVisible(true);
            LP.setResizable(false);
            LP.setDefaultCloseOperation(LP.DO_NOTHING_ON_CLOSE);
            
        }
    }
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Quit", JOptionPane.YES_NO_CANCEL_OPTION);
        if (input == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void rememberUserCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberUserCheckboxActionPerformed

    }//GEN-LAST:event_rememberUserCheckboxActionPerformed

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
  
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void idFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusGained
        idField.setText("");
    }//GEN-LAST:event_idFieldFocusGained

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed
    
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
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLebel;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField idField;
    private javax.swing.JPanel intro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox rememberUserCheckbox;
    // End of variables declaration//GEN-END:variables
}
