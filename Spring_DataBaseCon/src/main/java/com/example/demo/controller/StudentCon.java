package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Student;
import com.example.demo.service.StudentSer;

@RestController
public class StudentCon {
	@Autowired
	StudentSer service;
	@PostMapping("/save")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return "Data is inserted....";
	}
	
}
