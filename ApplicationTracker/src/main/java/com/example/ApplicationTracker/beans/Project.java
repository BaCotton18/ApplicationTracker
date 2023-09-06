package com.example.ApplicationTracker.beans;

import jakarta.persistence.Id;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	private String name;
	private String description;
	List<String> skills;
	public Project(String name, String description, List<String> skills) {
		this.name = name;
		this.description = description;
		this.skills = skills;
	}
	
	public long getID() {
		return ID;
	}
	
	public void setID(long iD) {
		ID = iD;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<String> getSkills() {
		return skills;
	}
	
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
	
	public void removeSkill(String skill) {
		skills.remove(skill);
	}
	
}
