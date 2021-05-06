package business.abstracts;

import entities.concrets.User;

import java.util.List;

public interface UserService {
    void login(String eMail,String password);
    void save(User user);
    List<User> getAllUsers();
}
