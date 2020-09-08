/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package schoolmanagementsystem.Database;

import java.awt.HeadlessException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import schoolmanagementsystem.JConnection;
import schoolmanagementsystem.logInPage;

/**
 *
 * @author fahim
 */
public class StudentDatabase extends Accounts{
    private String studentName;
    private String studentClass;
    private String studentPhoneNo;
    private String studentEmail;
    private String section;
    private String passFromDB;
    final JPanel panel = new JPanel();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st;
    
    //Constructor
    public StudentDatabase(){
        
    }

    public void setId(String id) {
        this.id = id;
    }
    //Constructor (Polymorphism - Method Overloading)
    public StudentDatabase(String id){
        conn=JConnection.connectdb();
        setId(id);
        getStudentData(id);
    }
    public List<Notice> getNotice(){
        String sql = "select * from notice_board where class=" + "\'" +getStudentClass()+ "\'";
        List<Notice> list = new ArrayList<Notice>();
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Notice noticeClass=new Notice(rs.getString("date"),rs.getString("time"),rs.getString("teacher_name"),rs.getString("class"),rs.getString("subject"),rs.getString("notice"));
                list.add(noticeClass);
            }
            return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Can't get notice from database.");
        }
        return null;
    }
    public List<Homework> getHomework(){
        String sql = "select * from homework where class=\'"+getStudentClass()+ "\' and sec=\'"+getSection()+"\'";
        List<Homework> list = new ArrayList<Homework>();
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Homework homeworkClass=new Homework(rs.getString("subject"),rs.getInt("total_marks"),rs.getString("post_date"),rs.getString("due_date"),rs.getString("homework_text"));
                list.add(homeworkClass);
            }
            return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Can't get homeworks from database.");
        }
        return null;
    }
    
    public List<Message> getMessage(){
        String sql = "select * from message where ID=" + "\'" +getId()+ "\'";
        List<Message> list = new ArrayList<Message>();
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Message messageId=new Message(rs.getString("teacher_name"),rs.getString("ID"),rs.getString("message"));
                list.add(messageId);
            }
            return list;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Can't get message from database.");
        }
        return null;
    }    
    public void getStudentData(String id){
        String sql = "select * from student_accounts where id=\'" +id+ "\'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                setStudentName(rs.getString("name"));
                setStudentClass(rs.getString("class"));
                setSection(rs.getString("sec"));
                setStudentPhoneNo(rs.getString("phoneNo"));
                setStudentEmail(rs.getString("email"));
                setPassFromDB(rs.getString("pass"));
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    public String getId() {
        return id;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public String getStudentClass() {
        return studentClass;
    }
    
    public String getSection() {
        return section;
    }

    public String getPassFromDB() {
        return passFromDB;
    }

    public void setPassFromDB(String passFromDB) {
        this.passFromDB = passFromDB;
    }

  
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    
    public void setSection(String section) {
        this.section = section;
    }

    public String getStudentPhoneNo() {
        return studentPhoneNo;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentPhoneNo(String studentPhoneNo) {
        this.studentPhoneNo = studentPhoneNo;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    
}

