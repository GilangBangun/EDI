package com.example.edi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edi.model.EducationExperienceModel;

@Repository
public interface EducationExperienceRepository extends JpaRepository<EducationExperienceModel, Long> {
    
}
