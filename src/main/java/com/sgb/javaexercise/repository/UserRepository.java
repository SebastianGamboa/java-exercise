package com.sgb.javaexercise.repository;

import com.sgb.javaexercise.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Sebastián Gamboa
 */
public interface UserRepository extends MongoRepository<User, String> {

}