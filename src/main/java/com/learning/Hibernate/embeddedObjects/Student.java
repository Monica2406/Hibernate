package com.learning.Hibernate.embeddedObjects;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;

	@Embedded
	private Address address;

	// ✅ No-arg constructor required by Hibernate
	public Student() {
		super();
	}

	// ✅ Constructor that matches your Main.java
	public Student(String studentName, Address address) {
		this.studentName = studentName;
		this.address = address;
	}

	// ✅ Existing constructor (if needed)
	public Student(int studentId, String studentName, Address address) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	// ✅ Getters and Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
