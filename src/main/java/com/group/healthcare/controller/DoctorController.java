package com.group.healthcare.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.group.healthcare.dao.DoctorDao;
import com.group.healthcare.entity.Doctor;

@RestController
@RequestMapping("/doctor")

public class DoctorController {

	
	@Autowired
	DoctorDao doctorDao;
	
	/* to save a doctor*/
	@PostMapping("/register")
	public Doctor createEmployee(@Valid @RequestBody Doctor doctor) {
		
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
//		doctor.(randomUUIDString);
		return doctorDao.save(doctor);
	}
	
	/*get all doctors*/
	@GetMapping("/getall")
	public List<Doctor> getAllEmployees(){
		return doctorDao.findAll();
	}
	
	/*get doctor by doctorid*/
	@GetMapping("/getId/{id}")
	public ResponseEntity<Doctor> getEmployeeById(@PathVariable(value="id") String doctorid){
		
		Doctor doctor=doctorDao.findOne(doctorid);
		
		if(doctor==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(doctor);
		
	}
	
	
	/*update an doctor by doctorid*/
	@PutMapping("/update/{id}")
	public ResponseEntity<Doctor> updateEmployee(@PathVariable(value="id") String doctorid,@Valid @RequestBody Doctor doctorDetails){
		
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
	
	/*Delete an doctor*/
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Doctor> deleteEmployee(@PathVariable(value="id") String doctorid){
		
		Doctor doctor=doctorDao.findOne(doctorid);
		if(doctor==null) {
			return ResponseEntity.notFound().build();
		}
		doctorDao.delete(doctor);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	
	
}
