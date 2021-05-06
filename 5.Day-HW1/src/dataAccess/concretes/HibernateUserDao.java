package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concrets.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> userList = new ArrayList<>();
    @Override
    public void save(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " has saved to database.");
        userList.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }
}
