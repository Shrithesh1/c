package com.exam.example.exam.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.example.exam.model.StudentModel;
import com.exam.example.exam.studentrepo.StudentRepository;

@RestController
@RequestMapping("/api/student/")
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping
	public List<StudentModel> getAllDetails(){
		return studentRepository.findAll();	
	}
	
	@GetMapping("/{id}")
	public Optional<StudentModel> getDetails(@PathVariable int id){
		return studentRepository.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<?> insertData(@RequestBody StudentModel studentModel){
		try {
			return ResponseEntity.ok(studentRepository.save(studentModel));
					
		}catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.ok("Data has not add to the data base");
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateDetails(@PathVariable int id , @RequestBody StudentModel studentModel){
		try {
			return	ResponseEntity.ok(studentRepository.save(studentModel));
					
		}catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.ok("Data has not been updated in the data base");
		}
	}
	
	@DeleteMapping
	public String deleteAllDetails() {
		try {
			studentRepository.deleteAll();
			return "All data hass been deleted from the database";
		}catch (Exception e) {
			// TODO: handle exception
			return "Data has not deleted from the data base";
		}
	}
	
	@DeleteMapping("/{id}")
	public String deleteDetails(@PathVariable int id) {
		try {
			studentRepository.deleteById(id);
			return "data hass been deleted from the database for the id = "+id;
		}catch (Exception e) {
			// TODO: handle exception
			return "Data has not deleted from the data base";
		}
	}
}



