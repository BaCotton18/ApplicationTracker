package com.example.ApplicationTracker.beans;

import java.util.Date;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	
	
	public long getID() {
		return ID;
	}

	
	public void setID(long iD) {
		ID = iD;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public Date getDateApplied() {
		return dateApplied;
	}


	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}



	
	

}
