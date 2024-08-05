package com.example.edi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.edi.model.TrainingExperienceModel;

@Repository
public interface TrainingExperienceRepository extends JpaRepository<TrainingExperienceModel, Long> {
    
}
