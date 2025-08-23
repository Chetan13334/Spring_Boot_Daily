package com.example.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Student;
import com.example.demo.service.StudentSer;


@Repository
public class StudentDao {
	
	@Autowired
	SessionFactory factory;
	
	public String insertData(Student s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		
		ss.persist(s);
		tr.commit();
		ss.close();
		return "Data inserted";
	}
	
}
