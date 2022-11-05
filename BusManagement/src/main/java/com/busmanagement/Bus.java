/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busmanagement;

/**
 *
 * @author DELL
 */
public class Bus {
    String Plate_Numbers;
    String Location;
    double Fuel_Capacity;
    int Seat;
    double Ticket_Price;
    int Number_of_Tickets_sold;
    Driver driver;
    Route route;
    
    public Bus (Driver driver, Route route, String Plate_Numbers, String Location, double Fuel_Capacity, int Seat,double Ticket_Price, int Number_of_Tickets_sold) {
        this.driver = driver;
        this.route = route;
        this.Plate_Numbers = Plate_Numbers;
        this.Location = Location;
        this.Fuel_Capacity = Fuel_Capacity;
        this.Seat = Seat;
        this.Ticket_Price = Ticket_Price;
        this.Number_of_Tickets_sold = Number_of_Tickets_sold;
    }
    public void getInfo() {
        //System.out.println("Driver: "+);
        System.out.println("Plate Numbers: " + Plate_Numbers); 
        System.out.println("Current Location: " + Location);
        System.out.println("Fuel Capacity: " + Fuel_Capacity + "/50liters");
        System.out.println("Seat: " + Seat + "/40");
        System.out.println("Ticket Price: " + Ticket_Price + "vnd");
        System.out.println("Number of Tickets sold: " + Number_of_Tickets_sold);
    }
    public void Idle() {
        System.out.println(Plate_Numbers + " is idling\n");
    }
    public void Run() {
        System.out.println(Plate_Numbers + " is running\n");
    }
}
