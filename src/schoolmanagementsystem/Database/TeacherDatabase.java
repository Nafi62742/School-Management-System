/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package schoolmanagementsystem.Database;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fahim
 */
public class TeacherDatabase extends Accounts{
    private String teacherName;
    private String teacherSubject;
    private String designation;
    private String teacherPhoneNo;
    private String teacherEmail;
    private String passFromTDB;
    final JPanel panel = new JPanel();
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st;
    
    //Constructor
    public TeacherDatabase() {
    }
    //Constructor (Polymorphism - Method Overloading)
    public TeacherDatabase(String id) {
        this.id = id;
        conn=JConnection.connectdb();
        getTeacherData(id);
    }
    private void getTeacherData(String id) {
        
        String sql = "select * from teacher_accounts where id=\'" +id+ "\'";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                setTeacherName(rs.getString("name"));
                setTeacherSubject(rs.getString("subject"));
                setDesignation(rs.getString("designation"));
                setTeacherPhoneNo(rs.getString("phoneNo"));
                setTeacherEmail(rs.getString("email"));
                setPassFromTDB(rs.getString("pass"));
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void postHomework(String studentClass,String section,int totalMarks,String dueDate,String homeworkText){
        Date datetime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String postDateString=dateFormat.format(datetime);
        String sql = "INSERT INTO homework(class, sec,teacher_name, subject, total_marks,post_date, due_date,homework_text) VALUES(?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, studentClass);
            pst.setString(2, section);
            pst.setString(3, getTeacherName());
            pst.setString(4, getTeacherSubject());
            pst.setInt(5, totalMarks);
            pst.setString(6,postDateString);
            pst.setString(7, dueDate);
            pst.setString(8,homeworkText);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Homework have been posted Successfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, e,"Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    public void postNotice(String studentClass,String notice){
        Date datetime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
        String dateString=dateFormat.format(datetime);
        String timeString=timeFormat.format(datetime);
        
        String sql = "INSERT INTO notice_board(date, time, teacher_name, class, subject, notice) VALUES(?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, dateString);
            pst.setString(2, timeString);
            pst.setString(3, getTeacherName());
            pst.setString(4, studentClass);
            pst.setString(5, getTeacherSubject());
            pst.setString(6,notice);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Notice have been posted Successfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
    } 
    
    public void sendMessage(String message,String studentId){
        
        Date datetime = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        DateFormat timeFormat = new SimpleDateFormat("hh:mm aa");
        String dateString=dateFormat.format(datetime);
        String timeString=timeFormat.format(datetime);
        String sql = "INSERT INTO message(teacher_name, ID, message,date, time) VALUES(?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
     
            pst.setString(1, getTeacherName());
            pst.setString(2, studentId);
            
            pst.setString(3,message);
            pst.setString(4,dateString);
            pst.setString(5,timeString);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Message have been sent Successfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void attendanceUpdate(String month,String studentId, int workingDays, int presentDays){
        
        
        String sql = "INSERT INTO attendance(month, ID, working_days, present_days) VALUES(?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
     
            pst.setString(1, month);
            pst.setString(2, studentId);
            pst.setInt(3,workingDays);
            pst.setInt(4,presentDays);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Attendance have been updated Successfully");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }
    
        public void marksSend(int marks,String studentId,String paper){
        String tSubject= getTeacherSubject();
        String tSubject2=tSubject.toLowerCase();
        if(tSubject2.equals("bangla")&&paper.equals("1st")){
            String sql = "UPDATE results SET bangla1st=? WHERE ID=" + studentId;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(bangla1st) have been added Successfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(tSubject2.equals("bangla")&&paper.equals("2nd")){
            String sql = "UPDATE results SET bangla2nd=? WHERE ID=" + studentId;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(bangla2nd) have been added Successfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(tSubject2.equals("english")&&paper.equals("2nd")){
             String sql = "UPDATE results SET english2nd=? WHERE ID=" + studentId;
            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(english2nd) have been added Successfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
         else if(tSubject2.equals("english")&&paper.equals("1st")){
                String sql = "UPDATE results SET english1st=? WHERE ID=" + studentId;
            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(english1st) have been added Successfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
   public void marksSend(int marks,String studentId){
        String tSubject= getTeacherSubject();
        String tSubject2=tSubject.toLowerCase();
            if(tSubject2.equals("math")){
                String sql = "UPDATE results SET math=? WHERE ID=" + studentId;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(Math) have been added Successfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(tSubject2.equals("science")){
                String sql = "UPDATE results SET science=? WHERE ID=" + studentId;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(science) have been added Successfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
            }
            }
             else if(tSubject2.equals("religion")){
                String sql = "UPDATE results SET religion=? WHERE ID=" + studentId;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(religion) have been added Successfully");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
       else if(tSubject2.equals("ict")){
            String sql = "UPDATE results SET ict=? WHERE ID=" + studentId;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Marks(ict) have been added Successfully");
                } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
            else if(tSubject2.equals("bangladesh and global studies")){
                String sql = "UPDATE results SET bgs=? WHERE ID=" + studentId;

            try {
                pst = conn.prepareStatement(sql);
                pst.setInt(1,marks);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Marks(bgs) have been added Successfully");
                } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
    }
  public int updateTeacherAccount(String name,String subject,String designation,String Teacher_Id,String PhoneNo, String Email){
        final JPanel panel = new JPanel();
            String sql = "UPDATE teacher_accounts SET name=?,subject=?,designation=?, phoneNo=?, email=? WHERE id =" + Teacher_Id;
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, subject);
                pst.setString(3, designation);
                pst.setString(4, PhoneNo);
                pst.setString(5, Email);
                pst.execute();
                return 1;
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
                return 0;
            }
        
    }
    
    
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String getTeacherName() {
        return teacherName;
    }
    
    public String getTeacherSubject() {
        return teacherSubject;
    }

    public String getTeacherPhoneNo() {
        return teacherPhoneNo;
    }

    public void setTeacherPhoneNo(String teacherPhoneNo) {
        this.teacherPhoneNo = teacherPhoneNo;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getPassFromTDB() {
        return passFromTDB;
    }

    public void setPassFromTDB(String passFromTDB) {
        this.passFromTDB = passFromTDB;
    }
    
    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }
    
    
    public String getDesignation() {
        return designation;
    }  
}
