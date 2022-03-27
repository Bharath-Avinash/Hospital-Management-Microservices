package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository repo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Patient getPatientById(int id) {
		// TODO Auto-generated method stub
		
		Patient patient = repo.findById(id).orElse(null);
		System.out.println(patient);
		Doctor doctor = restTemplate.getForObject("http://DOCTOR-SERVICE/doctor/"+patient.getDoctorId(),
				Doctor.class);
		
		patient.setVisitedDoctor(doctor);

		return patient;
	}

	@Override
	public String save(Patient patient) {
		// TODO Auto-generated method stub
		
		int doctorId = patient.getVisitedDoctor().getId();
		patient.setDoctorId(doctorId);
		
		repo.save(patient);
		return null;
	}

}
