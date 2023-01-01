package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.masai.app.entity.Student;

@Component
public class StudentService {
	
	List<Student> stu=new ArrayList<>();
	
	@PostConstruct
	public void newStudent() {
		stu.add(new Student(1,"100",100));
		stu.add(new Student(2,"100",100));
		stu.add(new Student(3,"100",100));
	}
	
	public void display() {
		stu.forEach(System.out::println);
	}
}
