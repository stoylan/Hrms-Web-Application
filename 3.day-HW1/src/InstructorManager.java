public class InstructorManager extends UserManager{
    public void add(Instructor instructor){
        System.out.println("The instructor" + " " + instructor.getUserName() +" " + instructor.getLastName()+" has been added succesfully.");
    }
    public void list(){
        System.out.println("All instructors listed.");
    }

    public void show(Instructor instructor) {
        System.out.println("Id : "+instructor.getId() +"\n"+
                "Name Surname : "+ instructor.getUserName()+" "+instructor.getLastName()+"\n"+
                "Given Courses : "+ instructor.getGivenCourses());
    }

    @Override
    public void update() {
        System.out.println("The instructors has been updated.");
    }
}
