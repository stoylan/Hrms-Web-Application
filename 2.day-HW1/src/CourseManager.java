import java.util.List;

public class CourseManager {
    public void addCourse(Course course){
        System.out.println(course.getCourseName() + " " + "has added in system.");
    }
    public void addStudentToCourse(Student student,Course course){
        System.out.println(student.getStudentName() + " " + "added in "+course.getCourseName() + " lesson.");
        student.getCourseTake().add(course);

    }
    public void deleteCourse(Course course){
        System.out.println(course.getCourseName() + " " + "has been deleted.");

    }

    public void getStudents(List<Student> students){
        System.out.println("All student who enrolled");
        for (Student student : students){
            System.out.println(student.getStudentName()+ " " + student.getStudentSurname());
        }
    }

}
