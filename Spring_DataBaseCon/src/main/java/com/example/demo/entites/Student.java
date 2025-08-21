package com.example.demo.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String sname;
	private int mno;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int id, String sname, int mno) {
		super();
		this.id = id;
		this.sname = sname;
		this.mno = mno;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", mno=" + mno + "]";
	}
	
	
}
