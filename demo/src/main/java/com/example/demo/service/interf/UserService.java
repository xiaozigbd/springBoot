package com.example.demo.service.interf;

import com.example.demo.entity.User;

public interface UserService {
    public User getUserById(int userId);

    boolean addUser(User record);

}