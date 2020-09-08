
package schoolmanagementsystem.Database;

/**
 *
 * @author fahim
 */
public class Message {
    
    private String message;
    private String studentId;
    private String teacherName;
    

    public Message() {
    }
    public Message(String teacherName, String studentId,String message ) {
        this.message = message;
        this.studentId = studentId;
        this.teacherName = teacherName;
    }

    

    public String getMessage() {
        return message;
    }

    public String getStudentId() {
        return studentId;
    }

    public Object getTeacherName() {
        return teacherName; 
    }

  
}
