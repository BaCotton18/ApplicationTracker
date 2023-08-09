package com.example.ApplicationTracker.beans;

import java.util.ArrayList;
import java.util.List;

public abstract class Experience {
	 private String title = "";
	 private List<String> skills = new ArrayList<String>();
	 private int yearsOfExperience = 0;
	 
	 public Experience(String title, List<String> skills, int yearsOfExperience) {
		 this.title = title;
		 this.skills = skills;
		 this.yearsOfExperience = yearsOfExperience;
	 }
	 
	 public String getTitle() {
		 return title;
	 }
	 public void setTitle(String title) {
		 this.title = title;
	 }
	
	 public List<String> getSkills(){
		 return skills;
	 }
	 public void setSkills(List<String> skills) {
		 this.skills = skills;
	 }
	 
	 public int getYearsOfExperience() {
		 return yearsOfExperience;
	 }
	 public void setYearsOfExperience(int yearsOfExperience) {
		 this.yearsOfExperience = yearsOfExperience;
	 }
	
}
