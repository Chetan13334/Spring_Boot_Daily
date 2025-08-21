package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entites.Student;
@Service
public class StudentSer {

	@Autowired
	StudentDao dao;
	
	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}

}
