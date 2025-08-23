package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Employee;
import com.example.demo.service.EmployeeService;


@RestController
public class EmployeeContro {

	@Autowired
	EmployeeService service;
	@PostMapping("/insertData")
	public String insertData(@RequestBody Employee e) {
		String msg = service.insertData(e);
		return "Data is inserted....";
	}
	
}
