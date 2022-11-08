/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busmanagement;

/**
 *
 * @author DELL
 */

interface Vehicle {
	void run(boolean i);
	void updateFuelCapacity(double fuelCapacity);
	void updateTicketPrice(double ticketPrice);
}

public class Bus implements Vehicle {
    String plateNumber;
    String location;
    double fuelCapacity;
    int seat;
    double ticketPrice;
    int tickets;
    Driver driver;
    Route route;
    
    public Bus (Driver driver, Route route, String plateNumber, String location, double fuelCapacity, int seat, double ticketPrice, int tickets) {
        this.driver = driver;
        this.route = route;
        this.plateNumber = plateNumber;
        this.location = location;
        this.fuelCapacity = fuelCapacity;
        this.seat = seat;
        this.ticketPrice = ticketPrice;
        this.tickets = tickets;
    }
    public void getInfo() {
        //System.out.println("Driver: "+);
        System.out.println("Plate Numbers: " + plateNumber); 
        System.out.println("Current Location: " + location);
        System.out.println("Fuel Capacity: " + fuelCapacity + "/50liters");
        System.out.println("Seat: " + seat + "/40");
        System.out.println("Ticket Price: " + ticketPrice + "vnd");
        System.out.println("Number of Tickets sold: " + tickets);
    }
    public void run(boolean i) {
    	if (i == true) {
        System.out.println(plateNumber + " is running\n");
    	}
    	else System.out.println(plateNumber + " is idling\n");
    }
    
    /*overload*/
    //update driver for bus
    public void update(Driver driver) {
    	this.driver = driver;
    }
    //update route
    public void update(Route route) {
    	this.route = route;
    	
    }
    //update fuel capacity
    public void updateFuelCapacity(double fuelCapacity) {
    	this.fuelCapacity = fuelCapacity;
    }
    //update ticket price
    public void updateTicketPrice(double ticketPrice) {
    	this.ticketPrice = ticketPrice;
    }
}
