package com.group.healthcare.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.group.healthcare.entity.Appointment;
import com.group.healthcare.repository.AppointmentRepository;
@Service

public class AppointmentDao {
	AppointmentRepository appointmentRepository;
	
	/*to save an employee*/
	
	public Appointment save(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	
	
	/* search all employees*/
	
	public List<Appointment> findAll(){
		return appointmentRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public Appointment findOne(int appointmentid) {
		return appointmentRepository.getOne(appointmentid);
	}
	
	
	/*delete an employee*/
	
	public void delete(Appointment appointment) {
		appointmentRepository.delete(appointment);
	}
	
}
