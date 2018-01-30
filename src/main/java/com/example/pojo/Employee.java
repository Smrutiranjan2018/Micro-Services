package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	 @Id
	 @Column(name="emp_id")
	private Long emp_id;
	 @Column(name="emp_name")
	private String emp_name;
	
	@Override
	public String toString() {
		return "Employee [Employee Id=" + emp_id + ", Employee Name=" + emp_name + "]";
	}

	public Long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

}