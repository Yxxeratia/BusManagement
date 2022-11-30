
package com.busmanagement;

interface Vehicle {
	void updateFuelCapacity(double fuelCapacity);
}

public class Bus implements Vehicle {
    public String plateNumber;
    public double fuelCapacity;
    public int seat;
    String status;
    Driver driver;
    Route route;
  
    public Bus (Driver driver, Route route, String plateNumber, double fuelCapacity, int seat, String status) {
        this.driver = driver;
        this.route = route;
        this.plateNumber = plateNumber;
        this.fuelCapacity = fuelCapacity;
        this.seat = seat;
        this.status = status;
    }
    public void getInfo() {
        //System.out.println("Driver: "+);
        System.out.println("Plate Numbers: " + plateNumber); 
        System.out.println("Fuel Capacity: " + fuelCapacity + "/50liters");
        System.out.println("Seat: " + seat + "/40");
        System.out.println("Status: " + status);
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
}
