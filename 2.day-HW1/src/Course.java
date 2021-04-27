import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private List<Student> studentWhoTake = new ArrayList<>();
    private String teacher;
    private int duringTime;
    private String introduction;

    public Course(int courseId, String courseName, String teacher, int duringTime, String introduction) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.duringTime = duringTime;
        this.introduction = introduction;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Student> getStudentWhoTake() {
        return studentWhoTake;
    }

    public void setStudentWhoTake(List<Student> studentWhoTake) {
        this.studentWhoTake = studentWhoTake;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getDuringTime() {
        return duringTime;
    }

    public void setDuringTime(int duringTime) {
        this.duringTime = duringTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
