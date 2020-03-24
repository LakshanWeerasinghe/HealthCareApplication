package com.group.healthcare.entity;

import java.time.LocalDateTime;

public class DoctorTimeShedule {
	
	private int id;
	
	private String room;
	
	private String weekday;
	
	private LocalDateTime startTime;
	
	private LocalDateTime endTime;
	
	private int maxNumberOfPatients;
	
	private String availability;
	
}
