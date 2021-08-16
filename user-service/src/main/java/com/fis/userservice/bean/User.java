package com.fis.userservice.bean;

public class User {
	String name;
	long Phno;
	String email;
	public User()
	{
		
	}
	public User(String name, long phno, String email) {
		super();
		this.name = name;
		Phno = phno;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", Phno=" + Phno + ", email=" + email + "]";
	}
	

}
