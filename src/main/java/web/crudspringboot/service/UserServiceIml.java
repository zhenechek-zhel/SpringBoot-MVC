package web.crudspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.crudspringboot.dao.UserDAO;
import web.crudspringboot.model.User;

import java.util.List;

@Transactional
@Service
public class UserServiceIml implements UserService{

    private final UserDAO userDAO;

    @Autowired
    public UserServiceIml(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void removeUserById(long id) {
        userDAO.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUser(long id) {
        return userDAO.getUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
}
