package com.practica.Guia3JuanYanqui.repository;

import java.util.List;

import com.practica.Guia3JuanYanqui.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


public interface StudentRepository extends MongoRepository<Student, String> {

	Student findByStudentNumber(Long studentNumber);

	Student findByEmail(String email);

	List<Student> findAllByOrderByGpa();

}