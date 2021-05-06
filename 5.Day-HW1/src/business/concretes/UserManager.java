package business.concretes;

import business.abstracts.IUserRegisterService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concrets.User;

import java.util.List;

public class UserManager implements UserService {
    private final UserDao userDao;
    private final IUserRegisterService iUserRegisterService;

    public UserManager(UserDao userDao, IUserRegisterService iUserRegisterService) {
        this.userDao = userDao;
        this.iUserRegisterService = iUserRegisterService;
    }



    @Override
    public void login(String eMail,String password) {
        List<User> userList = userDao.getAllUsers();
        for (User user : userList){
            if (user.geteMail().equals(eMail) && user.getPassword().equals(password)) {
                System.out.println("Succesfully login");
                return;
            }
        }
        System.out.println("E-mail and password incorrect.");

    }


}
