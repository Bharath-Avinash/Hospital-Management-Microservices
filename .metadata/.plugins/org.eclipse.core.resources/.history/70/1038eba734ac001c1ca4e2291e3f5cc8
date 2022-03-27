package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.example.demo.VO.Doctor;
@Entity
public class Patient {
	
//	  patientId!:number;
//	    patientName !: string;
//	    age !:number;
//	    gender !:String
//	    visitedDoctor !:Doctor;
//	    dateOfVisit !:String;
//	    prescription !:String;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	private String patientName;
	private int age;
	private String gender;
	private int doctorId;
	@Transient
	private Doctor visitedDoctor;
	
	public Patient() {
		super();
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Doctor getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(Doctor visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", gender="
				+ gender + ", visitedDoctor=" + visitedDoctor + ", doctorId=" + doctorId + ", dateOfVisit="
				+ dateOfVisit + ", prescription=" + prescription + "]";
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	private String dateOfVisit;
	private String prescription;
	


}
