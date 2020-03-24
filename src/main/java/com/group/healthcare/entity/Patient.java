package com.group.healthcare.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "patient")
public class Patient {
	
	@Id
	@Column(name = "patient_id", length = 36)
	private String patientId;
	
	@Column(name = "first_name", length = 60, nullable = false)
	private String firstName;
	
	@Column(name = "middle_name", length = 60, nullable = false)
	private String middleName;
	
	@Column(name = "last_name", length = 60, nullable = false)
	private String lastName;
	
	@Column(columnDefinition = "BLOB")
	private String address;
	
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(columnDefinition = "DATETIME", nullable = false)
	private LocalDate dob;
	
	@Column(name = "credit_card", length = 16 , nullable = false)
	private String creditCardNumber;
	
	public enum Gender {
		MALE, FEMALE
	}
	
	@OneToMany
	private List<Payment> payments;
	
	@OneToMany
	private List<Appointment> appointments;
	
}
