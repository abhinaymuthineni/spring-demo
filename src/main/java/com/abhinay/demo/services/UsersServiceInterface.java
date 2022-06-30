package com.abhinay.demo.services;

import com.abhinay.demo.entity.Users;

import java.util.List;

public interface UsersServiceInterface {
    List<Users> listUsers();
    Users getUserById(int id);
    Users saveUser(Users user);
    void deleteUser(int id);
    Users getUserByUsername(String username);
}
