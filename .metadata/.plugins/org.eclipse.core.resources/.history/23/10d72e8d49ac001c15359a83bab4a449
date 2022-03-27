package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService service;
	
	@PostMapping("/patient")
	public ResponseEntity< ?> save(@RequestBody Patient patient){
		
		service.save(patient);
		return ResponseEntity.ok("Patient saved");
		
	}
	
	@GetMapping("/patient/{id}")
	public ResponseEntity<?> getPatientById(@PathVariable int id){
		
		
		Patient patient = service.getPatientById(id);
		
		return ResponseEntity.ok(patient);
	}

}
