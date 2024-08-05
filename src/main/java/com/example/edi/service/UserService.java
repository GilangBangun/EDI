package com.example.edi.service;

import com.example.edi.model.UserModel;
import java.util.List;
import java.util.Optional;

public interface UserService {
    UserModel addUser(UserModel user);
    UserModel changeUser(UserModel user);
    void deleteUser(UserModel user);
    String encrypt(String password);
    List<UserModel> getListUser();

    Optional<UserModel> findUserByName(String name);
    boolean userExists(String email, String name);
}
