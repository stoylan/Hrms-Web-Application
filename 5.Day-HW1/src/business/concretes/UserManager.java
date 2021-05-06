package business.concretes;

import business.abstracts.IUserRegisterService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concrets.User;

import java.util.List;

public class UserManager implements UserService {
    private final UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public void login(String eMail,String password) {
        List<User> userList = getAllUsers();
        for (User user : userList){
            if (user.geteMail().equals(eMail) && user.getPassword().equals(password)) {
                System.out.println(user.getFirstName() + " "+ user.getLastName() + " succesfully login.");
                return;
            }
        }
        System.out.println("E-mail and password incorrect.");

    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


}
