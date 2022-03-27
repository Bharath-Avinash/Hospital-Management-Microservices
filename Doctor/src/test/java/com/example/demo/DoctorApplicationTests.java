package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.Doctor;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;

@SpringBootTest
class DoctorApplicationTests {

	@MockBean
	private DoctorRepository repo;

	@Autowired
	private DoctorService service;

	@Test
	void contextLoads() {
		
		
	}

	@Test
	public void getAllDoctors() {

		when(repo.findAll()).thenReturn(Stream.of(new Doctor(1, "karthi", 22, "male", "ortho", "43"),
				new Doctor(2, "Naresh", 22, "male", "ortho", "43")).collect(Collectors.toList()));
		
		assertEquals(2, service.getAllDoctor().size());

	}
	
	
	
	@Test
	public void getdoctorById() {
		
		Doctor doc = new Doctor(1, "karthi", 22, "male", "ortho", "43");
		
		
		when(repo.findById(1)).thenReturn(Optional.of(doc));
		
		assertEquals(service.getDoctorById(1), doc);
		
		
		
		
	}

}
