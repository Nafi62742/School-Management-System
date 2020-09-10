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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    
           
    private String studentId;
    private String bangla1st;
    private String bangla2nd;
    private String english1st;
    private String english2nd;
    private String math;
    private String science;
    private String religion;
    private String ict;
    private String bgs;
    private int grandTotal;
    
    
    
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
        getResult(id);
        totalMarks();
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
        Date today=new Date();
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Date dueDate=new SimpleDateFormat("dd.MM.yyyy").parse(rs.getString("due_date"));
                if(today.compareTo(dueDate) < 0){
                Homework homeworkClass=new Homework(rs.getString("subject"),rs.getInt("total_marks"),rs.getString("post_date"),rs.getString("due_date"),rs.getString("homework_text"));
                list.add(homeworkClass);
                }
            }
            return list;
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Can't Parse Date.");
            
        }
        catch (SQLException e) {
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
        
    public void  totalMarks(){
        int b1;
        int b2;
        int e1;
        int e2;
        int m;
        int s;
        int r;
        int bgs;
        int ic;
        
        if(getBangla1st()==null){
            b1= 0;
        }
        else{
            b1= Integer.parseInt(getBangla1st());
        }
        if(getBangla2nd()==null){
            b2=0;
        }else{
            b2= Integer.parseInt(getBangla2nd());
        }
        if(getBangla2nd()==null){
            b2=0;
        }else{
            b2= Integer.parseInt(getBangla2nd());
        }
        if(getEnglish1st()==null){
            e1=0;
        }else{
            e1 = Integer.parseInt(getEnglish1st());
        }
         if(getEnglish2nd()==null){
            e2=0;
        }else{
             e2=Integer.parseInt(getEnglish2nd());
        }
        if(getMath()==null){
            m=0;
        }else{
             m=Integer.parseInt(getMath());
        }
       
        if(getReligion()==null){
            r=0;
        }else{
            r=Integer.parseInt(getReligion());
        }
        if(getScience()==null){
            s=0;
        }else{
            s=Integer.parseInt(getScience());
        }
        
        if(getIct()==null){
            ic=0;
        }else{
            ic=Integer.parseInt(getIct());
        }
        if(getBgs()==null){
            bgs=0;
        }else{
            bgs=Integer.parseInt(getBgs());
        }
        
        int gt=b1+b2+e1+e2+m+r+s+ic+bgs;
        setGrandTotal(gt);
    }
        public void getResult(String id){
        String sql = "select * from results where ID=" + "\'" +id+ "\'";
        
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
               // rslt.setStudentId("ID");
                setBangla1st(rs.getString("bangla1st"));
                setBangla2nd(rs.getString("bangla2nd"));
                setEnglish1st(rs.getString("english1st"));
                setEnglish2nd(rs.getString("english2nd"));
                setMath(rs.getString("math"));
                setReligion(rs.getString("religion"));
                setScience(rs.getString("science"));
                setReligion(rs.getString("bgs"));
                setScience(rs.getString("ict"));
        
                //Results messageId=new Results(rs.getString("ID"),rs.getString("bangla1st"),rs.getString("bangla2nd"),rs.getString("english1st"),rs.getString("english2nd"),rs.getString("math"),rs.getString("science"),rs.getString("religion"));
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(panel, "Database error","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }   
    public int updateStudentAccount(String name,String studentClass,String section,String Stu_Id,String phoneNo, String Email){
        final JPanel panel = new JPanel();
        
        String sql = "UPDATE student_accounts SET name=?,class=?,sec=?, phoneNo=?, email=? WHERE id =" + Stu_Id;
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, studentClass);
                pst.setString(3, section);
                pst.setString(4, phoneNo);
                pst.setString(5, Email);
                pst.execute();
                
                return 1;
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(panel, "Database error", "Warning", JOptionPane.WARNING_MESSAGE);
                return 0;
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
    
    //result works

    public String getBangla1st() {
        return bangla1st;
    }

    public void setBangla1st(String bangla1st) {
        this.bangla1st = bangla1st;
    }

    public String getBangla2nd() {
        return bangla2nd;
    }

    public void setBangla2nd(String bangla2nd) {
        this.bangla2nd = bangla2nd;
    }

    public String getEnglish1st() {
        return english1st;
    }

    public void setEnglish1st(String english1st) {
        this.english1st = english1st;
    }

    public String getEnglish2nd() {
        return english2nd;
    }

    public void setEnglish2nd(String english2nd) {
        this.english2nd = english2nd;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getIct() {
        return ict;
    }

    public void setIct(String ict) {
        this.ict = ict;
    }

    public String getBgs() {
        return bgs;
    }

    public void setBgs(String bgs) {
        this.bgs = bgs;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }
    
    
    
    
    
    
}

