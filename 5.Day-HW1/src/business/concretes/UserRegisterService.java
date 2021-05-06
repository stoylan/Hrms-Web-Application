package business.concretes;

import dataAccess.abstracts.UserDao;
import entities.concrets.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegisterService extends RegisterBaseClass {
    private final UserDao userDao;

    public UserRegisterService(UserDao userDao) {
        super(userDao);
        this.userDao = userDao;
    }

    @Override
    public boolean checkRegister(User user) {
        if (user.geteMail() != null && user.getFirstName()!=null && user.getLastName()!=null &&
                user.getPassword()!=null) {
            String regex = "^(.+)@(.+)$";
            boolean eMailHasUsed = false;
            Pattern pattern = Pattern.compile(regex);
            //email validation control
            Matcher matcher = pattern.matcher(user.geteMail());

            List<User> list = userDao.getAllUsers();
            for (User user1 : list){
                if (user1.geteMail().equals(user.geteMail())) {
                    eMailHasUsed = true;
                    break;
                }
            }
            if (user.getPassword().length() >= 6 && matcher.matches() &&
                    !eMailHasUsed && user.getFirstName().length() >=2 && user.getLastName().length()>=2) {

                return true;
            }
            return false;
        }
        return false;
        }

}

