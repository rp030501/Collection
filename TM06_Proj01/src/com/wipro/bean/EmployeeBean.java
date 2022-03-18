package com.wipro.bean;

public class EmployeeBean {
	private int empId;
	private String name;
	private float Salary;
	private String designation;
	public EmployeeBean(int empId, String name, float Salary, String designation) {
		
		this.empId = empId;
		this.name = name;
		this.Salary = Salary;
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
