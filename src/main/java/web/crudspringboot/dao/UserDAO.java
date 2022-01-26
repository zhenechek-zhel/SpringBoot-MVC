package web.crudspringboot.dao;

import web.crudspringboot.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    void removeUserById(long id);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
}
