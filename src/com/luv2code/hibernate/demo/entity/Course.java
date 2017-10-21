package com.luv2code.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	// define our fields
	
	// define constructor
	
	// define getter setters
	
	// define toString
	
	// annotate fields
	
	private int id;
	
	private String titlte;
	
	private Instructor instructor;
	
	public Course() {
		
	}

	public Course(String titlte) {
		this.titlte = titlte;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitlte() {
		return titlte;
	}

	public void setTitlte(String titlte) {
		this.titlte = titlte;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titlte=" + titlte + "]";
	}
	
}
