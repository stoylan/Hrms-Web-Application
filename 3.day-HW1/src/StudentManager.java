public class StudentManager extends UserManager {
    public void add(Student student) {
        System.out.println("The student" + " " + student.getUserName() +" " + student.getLastName()+" has been added succesfully.");
    }

    @Override
    public void list() {
        System.out.println("All students listed.");
    }

    public void show(Student student) {
            System.out.println("Id : "+student.getId() +"\n"+
                    "Name Surname : "+ student.getUserName()+" "+student.getLastName()+"\n"+
                    "Taken Courses : "+ student.getTakenCourses());

    }

    @Override
    public void update() {
        System.out.println("The students has been updated.");;
    }
}
