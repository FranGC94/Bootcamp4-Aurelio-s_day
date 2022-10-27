package com.nttdata.bootcamp.main;

public class Person {

	private String firstname;
	private String lastname;
	private int age;
	
	
	public Person(String firstname, String lastname, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	
	public String getFistname() {
		return firstname;
	}
	public void setFistname(String fistname) {
		this.firstname = fistname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [fistname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	
}
