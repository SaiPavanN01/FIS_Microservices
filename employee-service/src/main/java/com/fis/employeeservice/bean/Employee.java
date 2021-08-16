package com.fis.employeeservice.bean;

public class Employee {
String name;
int emp_id;
String email_id;
public Employee()
{
	
}
public Employee(String name, int emp_id, String email_id) {
	super();
	this.name = name;
	this.emp_id = emp_id;
	this.email_id = email_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", emp_id=" + emp_id + ", email_id=" + email_id + "]";
}


}
