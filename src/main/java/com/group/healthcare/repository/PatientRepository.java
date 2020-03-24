package com.group.healthcare.repository;
import com.group.healthcare.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;


public interface PatientRepository extends JpaRepository<Patient, String> {
    
}