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
	String name;
    String tel;
    String bankNumber;
    String bankName;
 
    // abstract method
    abstract String getName();
    
    // there can also be regularly defined methods in an abstract class
    String getTel() {
        return (tel);
    }
    String getBankNumber() {
        return (bankNumber);
    }
    String getBankName() {
        return (bankName);
    }
}

// class Driver inherit abstract class Person
class Driver extends Person{
    int id;
    String shift;
    
    Driver(String name, String tel, String bankNumber, String bankName, int id, String shift) {
        this.name = name;
        this.tel = tel;
        this.bankNumber = bankNumber;
        this.bankName = bankName;
        this.id = id;
        this.shift = shift;
    }
    
    // specify abstract method
    String getName() {
        return (name);
    }
    void onDuty() {
        System.out.print(name+" is on duty\n");
    }
    void offDuty() {
        System.out.print(name+" is off duty\n");
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
}

class Manager extends Person {
	Manager(String name, String tel, String bankNumber, String bankName) {
        this.name = name;
        this.tel = tel;
        this.bankNumber = bankNumber;
        this.bankName = bankName;
    }
    String getName() {
        return (name);
    }
    void paySalary(String id) {
    	
    }
}
