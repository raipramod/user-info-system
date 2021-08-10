package com.coderwizard.uis.service;

import com.coderwizard.uis.daolayer.UserDao;
import com.coderwizard.uis.daolayer.UserDaoImpl;
import com.coderwizard.uis.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public int deleteUser() {
        return 0;
    }
}
