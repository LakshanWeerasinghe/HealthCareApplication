package com.group.healthcare.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@Column(name = "payment_id" )
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	@Column(columnDefinition = "DATE", nullable = false)
	private Date date;
	
	@Column(name = "medical_chargers", columnDefinition = "DECIMAL(10,2)", nullable = false)
	private Double medicalCharges;
	
	@Column(name = "doctor_chargers", columnDefinition = "DECIMAL(10,2)", nullable = false)
	private Double docChargers;
	
	@Column(columnDefinition = "DECIMAL(10,2)", nullable = false)
	private Double amount;
	
	@Enumerated(EnumType.STRING)
	private PaymentType type;
	
	@OneToOne
	private Appointment appointment;
	
	public enum PaymentType {
		
	}
}
