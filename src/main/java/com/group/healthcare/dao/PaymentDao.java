package com.group.healthcare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.healthcare.entity.Payment;
import com.group.healthcare.repository.PaymentRepository;
@Service

public class PaymentDao {

	
	@Autowired
	PaymentRepository paymentRepository;
	
	/*to save an employee*/
	
	public Payment save(Payment patient) {
		return paymentRepository.save(patient);
	}
	
	
	/* search all employees*/
	
	public List<Payment> findAll(){
		return paymentRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Payment findOne(int patientid) {
		return paymentRepository.getOne(patientid);
	}
	
	
	/*delete an employee*/
	
	public void delete(Payment patient) {
		paymentRepository.delete(patient);
	}
	
	
	
}
