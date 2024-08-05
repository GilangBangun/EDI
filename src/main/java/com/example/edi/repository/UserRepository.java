package com.example.edi.repository;

import com.example.edi.model.UserModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByName(String name);
    Optional<UserModel> findByEmail(String email);
    UserModel findByEmailOrName(String email, String name);
}
