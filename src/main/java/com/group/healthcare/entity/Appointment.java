package com.group.healthcare.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "appointment")
public class Appointment {
	
	@Id
	@Column(name = "appointment_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	
	@Column(length = 200, nullable = false)
	private String description;
	
	@Column(columnDefinition = "DATETIME")
	private LocalDateTime time;

	@ManyToOne
	private Patient patient;
	
	@OneToOne
	private Payment payment;
	
	@ManyToOne
	private Doctor doctor;
}
