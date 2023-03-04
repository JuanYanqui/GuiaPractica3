package com.practica.Guia3JuanYanqui.service;

import java.util.List;
import com.practica.Guia3JuanYanqui.model.Student;
import com.practica.Guia3JuanYanqui.model.Student;

public interface StudentService {

	List<Student> findAll();

	Student findByStudentNumber(Long studentNumber);

	Student findByEmail(String email);

	List<Student> findAllByOrderByGpa();

	void saveOrUpdateStudent(Student student);

	void deleteStudent(String id);

}