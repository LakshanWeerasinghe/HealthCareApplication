package com.group.healthcare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.group.healthcare.entity.Hospital;
import com.group.healthcare.repository.HospitalRepository;

public class HospitalDao {

	
	@Autowired
	HospitalRepository hospitalRepository;
	
	/*to save an employee*/
	
	public Hospital save(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}
	
	
	/* search all employees*/
	
	public List<Hospital> findAll(){
		return hospitalRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Hospital findOne(Long hospitalid) {
		return hospitalRepository.getOne(hospitalid);
	}
	
	
	/*delete an employee*/
	
	public void delete(Hospital hospital) {
		hospitalRepository.delete(hospital);
	}
	
	
	
}
