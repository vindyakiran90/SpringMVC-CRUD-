package com.tyss.springmvc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {

	@Id
	@Column 
	private int id;
	@Column
	private int age;
	@Column
	private String name;
	@Column
	private String designation;
	@Column
	private String password;
	@Column
	private double salary;
}
