package business.abstracts;

import entities.concrets.User;

public interface IUserRegisterService {
    boolean checkRegister(User user);
    void register(User user);
    void verify(User user);

}
