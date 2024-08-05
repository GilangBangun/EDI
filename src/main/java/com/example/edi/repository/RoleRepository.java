package com.example.edi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edi.model.RoleModel;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Long> {
    
}
