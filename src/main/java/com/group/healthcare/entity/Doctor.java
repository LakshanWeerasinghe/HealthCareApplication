package com.group.healthcare.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@Column(name = "doctor_id", length = 36)
	private String doctorId;
	
	@Column(name = "first_name", length = 60, nullable = false)
	private String firstName;
	
	@Column(name = "middle_name", length = 60, nullable = false)
	private String middleName;
	
	@Column(name = "last_name", length = 60, nullable = false)
	private String lastName;
	
	@Column(length = 250, nullable= false)
	private String email;
	
	@Column(columnDefinition ="BLOB", nullable = false)
	private String address;
	
	@Column(name = "contatc_number", length = 10, nullable = false)
	private String contactNo;
	
	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospiatl;
	
	@OneToMany
	private List<Appointment> checks;
	
}
