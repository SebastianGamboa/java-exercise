package com.sgb.javaexercise.service;

import java.util.List;

import com.sgb.javaexercise.exception.ResourceNotFoundException;
import com.sgb.javaexercise.model.User;
import com.sgb.javaexercise.repository.UserRepository;

import org.springframework.stereotype.Service;

/**
 * @author Sebastián Gamboa
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String id) throws ResourceNotFoundException {
        return userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(String id, User newUser) throws ResourceNotFoundException {
        return userRepository.findById(id).map(user -> {
            user.setName(newUser.getName());
            user.setBirthdate(newUser.getBirthdate());
            return save(user);
        }).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }

    @Override
    public void delete(String id) throws ResourceNotFoundException {
        var user = userRepository.findById(id);
        if (user.isPresent())
            userRepository.delete(user.get());
        else
            throw new ResourceNotFoundException("User", "id", id);
    }
}