package business.abstracts;

import entities.concrets.User;

public interface UserService {
    void login(String eMail,String password);
}
