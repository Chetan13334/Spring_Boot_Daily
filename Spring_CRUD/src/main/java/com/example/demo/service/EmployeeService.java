package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entites.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao dao;
	
	public String insertData(Employee e) {
		String msg = dao.insertData(e);
		if(msg == null ) {
			return "Data is not inserted";
		}
		else {
		return msg;}
	}

}
