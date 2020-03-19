package com.sgb.javaexercise.service;

import java.util.List;

import com.sgb.javaexercise.model.User;

/**
 * @author Sebastián Gamboa
 */
public interface UserService {

    List<User> findAll();
    User findById(String id);
    User save(User user);
    User update(String id, User user);
    void delete(String id);
}