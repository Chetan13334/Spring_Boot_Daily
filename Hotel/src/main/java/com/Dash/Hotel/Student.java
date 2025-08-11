package com.Dash.Hotel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name= "Student")
public class Student {
	
	@Id
	@Column(name= "ID")
	private int id;
	@Column(name= "NAME")
	private String name;
	@Column(name= "EMAIL")
	private String email;
	
	
}
