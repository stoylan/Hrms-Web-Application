package dataAccess.abstracts;

import entities.concrets.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    List<User> getAllUsers();
}
