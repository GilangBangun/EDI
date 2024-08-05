package com.example.edi.service;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.edi.model.UserModel;
import com.example.edi.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userDb;

    @Override
    public UserModel addUser(UserModel user) {
        String pass = encrypt(user.getPassword());
        System.out.println(pass + " " + user.getPassword());
        user.setPassword(pass);
        return userDb.save(user);
    }

    @Override
    public UserModel changeUser(UserModel user) {
        String pass = encrypt(user.getPassword());
        user.setPassword(pass);
        return userDb.save(user);
    }

    @Override
    public void deleteUser(UserModel user) {
        userDb.delete(user);
    }

    @Override
    public String encrypt(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwordHash = passwordEncoder.encode(password);
        return passwordHash;
    }


    @Override
    public Optional<UserModel> findUserByName(String name){
        return userDb.findByName(name);
    }

    @Override
    public boolean userExists(String email, String name) {
        UserModel user = userDb.findByEmailOrName(email, name);
        if (user != null) return true;
        return false;
    }

    @Override
    public List<UserModel> getListUser() {
        return userDb.findAll();
    }

}
