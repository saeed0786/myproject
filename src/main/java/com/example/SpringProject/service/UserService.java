package com.example.SpringProject.service;

import com.example.SpringProject.model.User;
import com.example.SpringProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }


    public void deleteUser(String userId) {
       userRepository.deleteById(userId);
    }

    public List<User> getByAddress(String address) {
       return userRepository.findAllByAddress(address);
    }


    /*
    public User getUser(){
        userRepository.getUser();
        return userRepository.getUser();

    }

    public User saveUser(User user) {
       return userRepository.saveUser(user);
    }
    public List<User> getAllUsers(){
        return userRepository.getAllUsers();
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    public User updateUser(int userId, User user) {
        userRepository.updateUser(userId, user);
        return user;
    }

    public User deleteUser(int userId) {
        return userRepository.deleteUser(userId);
    }

     */
}
