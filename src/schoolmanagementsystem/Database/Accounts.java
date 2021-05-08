package schoolmanagementsystem.Database;

import java.awt.HeadlessException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.codec.binary.Base64;
import schoolmanagementsystem.StudentProfile;
import schoolmanagementsystem.TeacherProfile;

public class Accounts {

    public String id;
    public Connection conn = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private Statement st;

    public Accounts() {
        conn = JConnection.connectdb();
    }

    public void createResultfieldForStu(String id) {
        final JPanel panel = new JPanel();

        String sql = "INSERT INTO results(ID) VALUES (?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();

            //JOptionPane.showMessageDialog(null, "Marks(english2nd) have been added Successfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    public int createStudentAccount(String name, String studentClass, String section, String id, String userPass) {
        final JPanel panel = new JPanel();
        String sql = "INSERT INTO student_accounts(name,class,sec,id,pass) VALUES(?,?,?,?,?)";
        String pass = null;
        pass = EncryptPass(userPass);
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, studentClass);
            pst.setString(3, section);
            pst.setString(4, id);
            pst.setString(5, pass);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            return 1;
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(panel, "Your ID should be unique.", "Warning", JOptionPane.WARNING_MESSAGE);
            return 2;
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
            return 0;
        }

    }

    public int createTeacherAccount(String name, String subject, String designation, String id, String userPass) {
        final JPanel panel = new JPanel();
        String sql = "INSERT INTO teacher_accounts(name,subject,designation,id,pass) VALUES(?,?,?,?,?)";
        String pass = null;

        pass = EncryptPass(userPass);
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, subject);
            pst.setString(3, designation);
            pst.setString(4, id);
            pst.setString(5, pass);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
            return 1;
        } catch (SQLIntegrityConstraintViolationException ex) {
            JOptionPane.showMessageDialog(panel, "Your ID should be unique.", "Warning", JOptionPane.WARNING_MESSAGE);
            return 2;
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database Error", "Warning", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
    }

    public boolean accountLogin(String id, String password, boolean rememberUser) {
        final JPanel panel = new JPanel();
        String table = null;
        String sql = null;
        if (id.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(panel, "Invalid Credentials", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            if (id.contains("100.")) {
                table = "student_accounts";
            } else if (id.contains("400.")) {
                table = "teacher_accounts";
            } else {
                JOptionPane.showMessageDialog(panel, "User not valid", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            if (rememberUser == true) {
                try {
                    if (userValid(id, password, table)) {
                        InetAddress myIP = InetAddress.getLocalHost();
                        //Check user once logged in or not
                        String sql2 = "select id from login_info where id=\'" + id + "\' and ip_address=\'" + myIP.getHostAddress() + "\'";
                        st = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                        rs = st.executeQuery(sql2);
                        if (rs.next()) {
                            PreparedStatement preparedStatement = conn.prepareStatement("update login_info set state =?  where id = \'" + id + "\' and ip_address=\'" + myIP.getHostAddress() + "\'");
                            preparedStatement.setInt(1, 1);
                            int update_done = preparedStatement.executeUpdate();
                        } else {
                            sql = "INSERT INTO login_info(id,ip_address,state) VALUES(?,?,?)";
                            pst = conn.prepareStatement(sql);
                            pst.setString(1, id);
                            pst.setString(2, myIP.getHostAddress());
                            pst.setInt(3, 1);
                            pst.execute();
                        }
                        if (id.contains("100.")) {
                            new StudentProfile(id).setVisible(true);
                            return true;
                        } else if (id.contains("400.")) {
                            new TeacherProfile(id).setVisible(true);
                            return true;
                        }
                    }
                } catch (UnknownHostException e) {
                    JOptionPane.showMessageDialog(panel, "Sorry, Can't get your IP Address.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return false;
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(panel, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
                    return false;
                }
            } else {
                if (userValid(id, password, table)) {
                    if (id.contains("100.")) {
                        new StudentProfile(id).setVisible(true);
                        return true;
                    } else if (id.contains("400.")) {
                        new TeacherProfile(id).setVisible(true);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void logout() {
        final JPanel panel = new JPanel();
        try {
            InetAddress myIP = InetAddress.getLocalHost();
            PreparedStatement preparedStatement = conn.prepareStatement("update login_info set state =?  where id = \'" + this.id + "\' and ip_address=\'" + myIP.getHostAddress() + "\'");
            preparedStatement.setInt(1, 0);
            int update_done = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(panel, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);

        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(panel, "Sorry, Can't get your IP Address.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
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

    private boolean userValid(String id, String pass, String table) {
        String encryptedPass = EncryptPass(pass);
        final JPanel panel = new JPanel();
        String sql = "select id from " + table + " where id=\'" + id + "\' and pass=\'" + encryptedPass + "\'";
        try {
            st = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(panel, "User not valid", "Warning", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }

    public String isUserLoggedIn() {
        final JPanel panel = new JPanel();
        try {
            InetAddress myIP = InetAddress.getLocalHost();
            String sql = "select id from login_info where ip_address=\'" + myIP.getHostAddress() + "\' and state=1";
            try {
                st = (Statement) conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    return rs.getString(1);
                } else {
                    return null;
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error. Auto login failed.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (UnknownHostException ex) {
            JOptionPane.showMessageDialog(panel, "Sorry, Can't get your IP Address.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

    public String getId() {
        return this.id;
    }

}
