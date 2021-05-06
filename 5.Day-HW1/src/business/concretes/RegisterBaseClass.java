package business.concretes;

import business.abstracts.IUserRegisterService;
import dataAccess.abstracts.UserDao;
import entities.concrets.User;

public abstract class RegisterBaseClass implements IUserRegisterService {
    private final UserDao userDao;

    protected RegisterBaseClass(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        if (checkRegister(user)){
            System.out.println(user.getFirstName()+" "+user.getLastName()+" succesfully registered to the system. The verification email has been sent to your e-mail. Please verify to login.");

            userDao.save(user);
        }else{
            System.out.println("You entered wrong information. Try again.");
        }
    }

    @Override
    public void verify(User user) {
        System.out.println("Verification successfully done. You can login");
    }
}
