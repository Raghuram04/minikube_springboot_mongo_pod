package com.weblearner.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.weblearner.springboot.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	public Student findByName(String name);	
	public void deleteByName(String name);

}
