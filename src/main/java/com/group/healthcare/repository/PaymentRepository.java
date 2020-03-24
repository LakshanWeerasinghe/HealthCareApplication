package com.group.healthcare.repository;
import com.group.healthcare.entity.Payment;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;


public interface PaymentRepository extends CrudRepository<Payment, Long> {
    
}