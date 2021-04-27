import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private String studentSurname;
    private String studentMail;
    private String studentPassword;
    private List<Course> courseTake = new ArrayList<>();


    public Student(int studentId, String studentName, String studentSurname, String studentMail, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentMail = studentMail;
        this.studentPassword = studentPassword;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentMail() {
        return studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public List<Course> getCourseTake() {
        return courseTake;
    }

    public void setCourseTake(List<Course> courseTake) {
        this.courseTake = courseTake;
    }
}
