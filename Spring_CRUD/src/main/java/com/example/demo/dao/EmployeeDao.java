package com.example.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session session =null;
		Transaction tx =null;
		String msg = null;
		
		
		try {

			session = factory.openSession();
			tx = session.beginTransaction();
			session.persist(e);
			tx.commit();

		} catch (Exception e1) {
			if(tx !=null) {
				tx.rollback();
			}
		}
			finally {
				if(session != null) {
					session.close();
				}
			}

		
		
		return "Data is Deleted";
		}
	
}
