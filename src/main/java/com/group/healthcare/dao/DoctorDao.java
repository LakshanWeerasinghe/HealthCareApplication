package com.group.healthcare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.group.healthcare.entity.Doctor;
import com.group.healthcare.repository.DoctorRepository;


public class DoctorDao {

	
	@Autowired
	DoctorRepository doctorRepository;
	
	/*to save an employee*/
	
	public Doctor save(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	
	/* search all employees*/
	
	public List<Doctor> findAll(){
		return doctorRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Doctor findOne(Long doctorid) {
		return doctorRepository.getOne(doctorid);
	}
	
	
	/*delete an employee*/
	
	public void delete(Doctor doctor) {
		doctorRepository.delete(doctor);
	}
	
	
	
	
}
