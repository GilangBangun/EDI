package com.example.edi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edi.model.WorkExperienceModel;

@Repository
public interface WorkExperienceRepository extends JpaRepository<WorkExperienceModel, Long> {
    
}
