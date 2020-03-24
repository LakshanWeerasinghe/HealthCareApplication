package com.group.healthcare.entity;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
@Entity
@Table( name = "hospital")
public class Hospital {
	
	@Id
	@Column(name = "hospital_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String hospitalId;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(name = "conatct_1", length = 10, nullable = false)
	private String contactNumber1;
	
	@Column(name = "contact_2", length = 10)
	private String contactNumber2;
	
	@Column(columnDefinition = "BLOB")
	private String address;
	
	@OneToMany
	private List<Doctor> doctors;
	
}
