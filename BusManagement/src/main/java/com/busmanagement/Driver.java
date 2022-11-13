/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.busmanagement;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author DELL
 */
abstract class Person {
	protected String name;
    protected String tel;
    protected String bankNumber;
    protected String bankName;
 
    // abstract method
    abstract String getName();
    abstract String getTel();
    // there can also be regularly defined methods in an abstract class
    
    String getBankNumber() {
        return bankNumber;
    }
    String getBankName() {
        return bankName;
    }
}

// class Driver inherit abstract class Person
class Driver extends Person{
    private String id;
    private String shift;
    private double salary;
    
    Driver(String name, String tel, String bankNumber, String bankName, String id, String shift) {
        this.name = name;
        this.tel = tel;
        this.bankNumber = bankNumber;
        this.bankName = bankName;
        this.id = id;
        this.shift = shift;
    }	
    Driver(String name, String tel, String id, String shift) {
        this.name = name;
        this.tel = tel;
        this.id = id;
        this.shift = shift;
    }
    
    //set salary for driver
    public void setSalary(double amount) {
    	salary = amount;
    }
    
    //get salary
    public double getSalary() {
    	return salary;
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
    // specify abstract method
    String getName() {
        return name;
    }
    
    String getTel() {
    	return tel;
    }
    
    void duty(boolean i) {
    	if (i == true) {
    		System.out.print(name+" is on duty\n");
    	}
    	else System.out.print(name+" is off duty\n");
    }
    
    String communicate(String msg) {
        return msg;
    }
    
    String checkIn() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	Date date = new Date();
    	return (formatter.format(date));
    }
    
    String checkOut() {
    	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	Date date = new Date();
    	return (formatter.format(date));
    }
    
    //update shift
    public void update(String shift) {
    	this.shift = shift;
    }
}
//add getID and getShift if needed
class Manager extends Person {
	Manager(String name, String tel, String bankNumber, String bankName) {
        this.name = name;
        this.tel = tel;
        this.bankNumber = bankNumber;
        this.bankName = bankName;
    }
    String getName() {
        return name;
    }
    String getTel() {
    	return tel;
    }
    
    /*overloading*/
    //pay w/o bonus
    void paySalary(Driver driver, double amount) {
    	driver.setSalary(amount);
    }
    //pay w/ bonus
    void paySalary(Driver driver, double amount, double bonus) {
    	driver.setSalary(amount + bonus);
    }
}
