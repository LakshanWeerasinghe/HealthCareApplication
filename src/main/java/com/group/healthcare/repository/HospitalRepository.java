package com.group.healthcare.repository;
import com.group.healthcare.entity.Hospital;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;


public interface HospitalRepository extends CrudRepository<Hospital, Long> {
    
}