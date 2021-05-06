import business.abstracts.IUserRegisterService;
import business.abstracts.UserService;
import business.concretes.UserGoogleRegisterService;
import business.concretes.UserManager;
import business.concretes.UserRegisterService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concrets.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Samet","Toylan","toylansamet@gmail.com","123456");
        User user2 = new User(2,"Engin","Demiroğ","engindemirog@gmail.com","987654");
        UserDao userDao = new HibernateUserDao();
        IUserRegisterService normalRegister = new UserRegisterService(userDao);
        UserService userService = new UserManager(userDao,normalRegister);

        normalRegister.register(user);

        normalRegister.verify(user);

        userService.login("toylansamet@gmail.com","123456");

        IUserRegisterService googleRegister = new UserGoogleRegisterService(userDao);

        googleRegister.register(user2);

        googleRegister.verify(user2);

        userService.login("engindemirog@gmail.com","987654");


    }
}
