package com.group.healthcare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.healthcare.entity.Hospital;
import com.group.healthcare.repository.HospitalRepository;
@Service

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
	public Hospital findOne(String hospitalid) {
		return hospitalRepository.getOne(hospitalid);
	}
	
	
	/*delete an employee*/
	
	public void delete(Hospital hospital) {
		hospitalRepository.delete(hospital);
	}
	
	
	
}
