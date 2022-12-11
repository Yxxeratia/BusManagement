package com.busmanagement;

interface Vehicle {
	void updateRemainingFuel(double remainingFuel);
}

public class Bus implements Vehicle {
    public String plateNumber;
    public int seat;
    int id;
    double remainingFuel;
    double fuelCapacity;
    String status;
    Driver driver;
    Route route;
  
    public Bus (Driver driver, Route route, int id, String plateNumber, double remainingFuel, double fuelCapacity, int seat, String status) {
        this.driver = driver;
        this.route = route;
        this.id = id;
        this.plateNumber = plateNumber;
        this.remainingFuel = remainingFuel;
        this.fuelCapacity = fuelCapacity;
        this.seat = seat;
        this.status = status;
    }
    public void getInfo() {
        //System.out.println("Driver: "+);
    	System.out.println("Id Number: " + id);
        System.out.println("Plate Numbers: " + plateNumber); 
        System.out.println("Remaining Fuel: " +  remainingFuel);
        System.out.println("Max Fuel Capacity: " + fuelCapacity);
        System.out.println("Seat: " + seat);
        System.out.println("Status: " + status);
        System.out.println();
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
    public void updateRemainingFuel(double remainingFuel) {
    	this.remainingFuel = remainingFuel;
    }
}
