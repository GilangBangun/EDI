package com.example.edi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edi.model.BiodataModel;

@Repository
public interface BiodataRepository extends JpaRepository<BiodataModel, Long> {
    
}
