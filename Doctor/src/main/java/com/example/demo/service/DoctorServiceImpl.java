package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository repo;

	@Override
	public String save(Doctor doctor) {
		// TODO Auto-generated method stub

		repo.save(doctor);
		return "Doctor Saved";
	}

	@Override
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub

		return repo.findAll();
	}

	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		Doctor doc= repo.findByName(doctor.getName());
		doc.setName(doctor.getName());
		doc.setAge(doctor.getAge());
		doc.setGender(doctor.getGender());
		doc.setNumberOfPatientAttended(doctor.getNumberOfPatientAttended());
		doc.setSpecialistField(doctor.getSpecialistField());
		return repo.save(doc);
	
	}

	@Override
	public void deleteDoctor(String name) {
		// TODO Auto-generated method stub
		
		Doctor doc=repo.findByName(name);
		System.out.println(doc);
	repo.deleteById(doc.getId());
	}
	
	

}
