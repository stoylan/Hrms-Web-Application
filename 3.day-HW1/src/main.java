public class main {
    public static void main(String[] args) {

        Student student = new Student(1,"Samet","Toylan","toylansamet@gmail.com","Java-React Course");
        Instructor instructor = new Instructor(2,"Engin","Demiroğ","engindemirog@gmail.com","Java-React courses and C#");

        UserManager userManager = new UserManager();
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();

        userManager.add(student);
        userManager.add(instructor);
        userManager.show(student);
        userManager.show(instructor);
        userManager.list();
        userManager.update();

        studentManager.add(student);
        userManager.show(student);
        userManager.list();
        userManager.update();

        instructorManager.add(instructor);
        instructorManager.list();
        instructorManager.update();
        instructorManager.show(instructor);
    }
}
