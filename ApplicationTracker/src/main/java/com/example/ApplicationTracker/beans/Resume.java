package com.example.ApplicationTracker.beans;

import java.util.List;

public class Resume extends Experience{

	List<Project> projects;
	
	public Resume(String title, List<String> skills, int yearsOfExperience, List<Project> projects) {
		super(title, skills, yearsOfExperience);
		this.projects = projects;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	public void addProject(Project project) {
		projects.add(project);
	}
	public void deleteProject(Project project) {
		projects.remove(project);
	}
}
