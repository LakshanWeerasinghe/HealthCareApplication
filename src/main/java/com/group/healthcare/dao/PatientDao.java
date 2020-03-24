package com.group.healthcare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.healthcare.entity.Patient;
import com.group.healthcare.repository.PatientRepository;
@Service

public class PatientDao {

	@Autowired
	PatientRepository patientRepository;
	
	/*to save an employee*/
	
	public Patient save(Patient patient) {
		return patientRepository.save(patient);
	}
	
	
	/* search all employees*/
	
	public List<Patient> findAll(){
		return patientRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Patient findOne(String patientid) {
		return patientRepository.getOne(patientid);
	}
	
	
	/*delete an employee*/
	
	public void delete(Patient patient) {
		patientRepository.delete(patient);
	}
	
	
}



