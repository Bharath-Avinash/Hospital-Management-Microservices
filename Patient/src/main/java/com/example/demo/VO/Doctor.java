package com.example.demo.VO;

public class Doctor {
	private int id;

	public Doctor() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSpecialistField() {
		return specialistField;
	}

	public void setSpecialistField(String specialistField) {
		this.specialistField = specialistField;
	}

	public String getNumberOfPatientAttended() {
		return numberOfPatientAttended;
	}

	public void setNumberOfPatientAttended(String numberOfPatientAttended) {
		this.numberOfPatientAttended = numberOfPatientAttended;
	}

	private String name;
	private int age;
	private String gender;
	private String specialistField;
	private String numberOfPatientAttended;

}
