import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student = new Student(1,"Samet","Toylan","toylansamet@gmail.com","123456");
        Student student1 = new Student(2,"Samet2","Toylan2","toylansamet2@gmail.com","123456");
        Course course = new Course(1,"Java React Course","Engin Demiroğ",16,"We are going to learning java spring and react.");
        Course course1 = new Course(2,"C# course","Engin Demiroğ",16,"We are going to learn C# in this lesson.");
        course.getStudentWhoTake().add(student);
        course.getStudentWhoTake().add(student1);
        course1.getStudentWhoTake().add(student);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);
        courseManager.addCourse(course1);
        courseManager.addStudentToCourse(student,course);
        courseManager.addStudentToCourse(student1,course);
        courseManager.addStudentToCourse(student,course1);

        courseManager.getStudents(students);
       // List<Course> courses=new List<>

    }
}
