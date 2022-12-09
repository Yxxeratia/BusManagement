package com.busmanagement;

abstract class Person {
	protected String name;
	protected String tel;

	// abstract method
	abstract String getName();

	abstract String getTel();
	// there can also be regularly defined methods in an abstract class
	// get info
	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("Telephone Number: " + tel);	
	}
}

// class Driver inherit abstract class Person
class Driver extends Person {
	private String id;
	private String shift;
	private String status;

	Driver(String id, String name, String tel, String shift, String status) {
		this.name = name;
		this.tel = tel;
		this.id = id;
		this.shift = shift;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	// specify abstract method
	String getName() {
		return name;
	}

	String getTel() {
		return tel;
	}
	 //update shift public void update(String shift) { this.shift = shift; }

	// override view info from Person
	@Override
	public void getInfo() {
		System.out.println("Id: " + id);
		System.out.println("Driver: " + name);
		System.out.println("Telephone Number: " + tel);
		System.out.println("Shift: " + shift);
		System.out.println("Status: " + status);
		System.out.println();
	}
}

class Manager extends Person {
	Manager(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	String getName() {
		return name;
	}

	String getTel() {
		return tel;
	}
	
	public void getInfo() {
		System.out.println("Name: " + name);
		System.out.println("Telephone Number: " + tel);
		System.out.println();
	}
}
