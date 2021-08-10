package com.coderwizard.uis.daolayer;

import com.coderwizard.uis.model.User;

import java.util.List;


public interface UserDao {

    int saveUser (User user);
    int updateUser (User user);
    int deleteUser (int id);
    User getUserById(int id);
    List<User>getAllUser();
    


}
