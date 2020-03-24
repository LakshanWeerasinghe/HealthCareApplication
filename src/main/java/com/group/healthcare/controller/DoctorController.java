package com.group.healthcare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.group.healthcare.dao.DoctorDao;
import com.group.healthcare.entity.Doctor;;

public class DoctorController {

	
	@Autowired
	DoctorDao doctorDao;
	
	/* to save an employee*/
	@PostMapping("/employees")
	public Doctor createEmployee(@Valid @RequestBody Doctor doctor) {
		return doctorDao.save(doctor);
	}
	
	/*get all employees*/
	@GetMapping("/employees")
	public List<Doctor> getAllEmployees(){
		return doctorDao.findAll();
	}
	
	/*get employee by empid*/
	@GetMapping("/employees/{id}")
	public ResponseEntity<Doctor> getEmployeeById(@PathVariable(value="id") Long doctorid){
		
		Doctor doctor=doctorDao.findOne(doctorid);
		
		if(doctor==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(doctor);
		
	}
	
	
	/*update an employee by empid*/
	@PutMapping("/employees/{id}")
	public ResponseEntity<Doctor> updateEmployee(@PathVariable(value="id") Long doctorid,@Valid @RequestBody Doctor doctorDetails){
		
		Doctor doctor=doctorDao.findOne(doctorid);
		if(doctor==null) {
			return ResponseEntity.notFound().build();
		}
		
//		emp.setName(empDetails.getName());
//		emp.setDesignation(empDetails.getDesignation());
//		emp.setExpertise(empDetails.getExpertise());
		
		Doctor updateEmployee=doctorDao.save(doctor);
		return ResponseEntity.ok().body(updateEmployee);
		
		
		
	}
	
	/*Delete an employee*/
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Doctor> deleteEmployee(@PathVariable(value="id") Long doctorid){
		
		Doctor doctor=doctorDao.findOne(doctorid);
		if(doctor==null) {
			return ResponseEntity.notFound().build();
		}
		doctorDao.delete(doctor);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	
	
}
