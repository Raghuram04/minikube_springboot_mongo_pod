package com.weblearner.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weblearner.springboot.model.Student;
import com.weblearner.springboot.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepository repo;

	@RequestMapping("/{name}")
	public Student getStudent(@PathVariable("name") String name) {
		System.out.println("Name"+name);
		return repo.findByName(name);
	}
	
	
	@PostMapping
	public Student newStudent(@RequestBody Student student) {
		System.out.println("Student Object"+student);
		return repo.save(student);
	}
	
	@DeleteMapping("/{name}")
	public void deleteStudent(@PathVariable("name") String name) {
		repo.deleteByName(name);
	}

}
