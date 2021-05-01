public class UserManager {
    public void add(User user){
        System.out.println("The user" + " " + user.getUserName() +" " + user.getLastName()+" has been added succesfully.");
    }
    public void list(){
        System.out.println("All users listed.");
    }
    public void show(User user){
        System.out.println("Id : "+user.getId() +"\n"+
        "Name Surname : "+ user.getUserName()+" "+user.getLastName());
    }

    public void update(){
        System.out.println("The users has been updated.");
    }
}
