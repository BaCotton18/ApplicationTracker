package com.example.ApplicationTracker.beans;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

enum Status{
	Applied,
	Screening, 
	Interview, 
	Offer, 
	Rejected
}

@Entity
public class Position extends Experience{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	private String company;
	private Date dateApplied;
	private Status status;
	
	
	public Position(String title, List<String> skills, int yearsOfExperience, String company, Date dateApplied) {
		super(title, skills, yearsOfExperience);
		this.company = company;
		this.dateApplied = dateApplied;
		status = Status.Applied;
	}
}
