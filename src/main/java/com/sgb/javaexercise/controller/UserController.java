package com.sgb.javaexercise.controller;

import java.util.List;

import javax.validation.Valid;

import com.sgb.javaexercise.exception.ResourceNotFoundException;
import com.sgb.javaexercise.model.User;
import com.sgb.javaexercise.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sebastián Gamboa
 */
@RestController
@RequestMapping("api")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("users/{id}")
    public User findById(@PathVariable String id) throws ResourceNotFoundException {
        return userService.findById(id);
    }

    @PostMapping("users")
    public ResponseEntity<User> save(@Valid @RequestBody User user) {
        return new ResponseEntity<User>(userService.save(user), HttpStatus.CREATED);
    }

    @PutMapping("users/{id}")
    public User update(@PathVariable String id, @Valid @RequestBody User user) throws ResourceNotFoundException {
        return userService.update(id, user);
    }

    @DeleteMapping("users/{id}")
    public void delete(@PathVariable String id) throws ResourceNotFoundException {
        userService.delete(id);
    }
}