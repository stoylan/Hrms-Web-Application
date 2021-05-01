public class Student extends User {
    private String takenCourses;

    public Student(int id,String userName,String lastName,String email,String takenCourses) {
        super(id,userName,lastName,email);
        this.takenCourses = takenCourses;
    }

    public String getTakenCourses() {
        return takenCourses;
    }

    public void setTakenCourses(String takenCourses) {
        this.takenCourses = takenCourses;
    }
}
