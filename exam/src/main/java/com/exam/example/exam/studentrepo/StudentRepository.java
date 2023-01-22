package com.exam.example.exam.studentrepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.exam.example.exam.model.StudentModel;

public interface StudentRepository extends MongoRepository<StudentModel, Integer>{

}

