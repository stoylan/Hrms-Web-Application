public class Instructor extends User {
    private String givenCourses;

    public Instructor(int id, String userName, String lastName, String email, String givenCourses) {
        super(id, userName, lastName, email);
        this.givenCourses = givenCourses;
    }

    public String getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(String givenCourses) {
        this.givenCourses = givenCourses;
    }
}
