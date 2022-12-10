
package com.busmanagement;

public class Route {
	public int routeNumber;
	public int ticketPrice;
	public int totalDistance;
	public String description;
	public String schedule;
	private int ticketCount;

	public Route(int routeNumber, int ticketCount, int ticketPrice, int totalDistance, String schedule, String description) {
		this.routeNumber = routeNumber;
		this.ticketCount = ticketCount;
		this.ticketPrice = ticketPrice;
		this.totalDistance = totalDistance;
		this.schedule = schedule;
		this.description = description;
	}

	public int getTicketCount() {
		return ticketCount;
	}
	public void setTicketCount(int ticketCount) {
		this.ticketCount = ticketCount;
	}
	public void getInfo() {

		System.out.println("Route Number: " + routeNumber);
		System.out.println("Ticket Count: " + ticketCount);
		System.out.println("Ticket Price: " + ticketPrice + "vnd");
		System.out.println("Total Distance: " + totalDistance + "km");
		System.out.println("Schedule: " + schedule);
		System.out.println("Description: " + description);
		System.out.println();
	}
}
