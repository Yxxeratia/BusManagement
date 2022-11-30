
package com.busmanagement;

public class Route {
	public int routeNumber;
	public int ticketPrice;
	public int totalDistance;
	public String description;
	private int ticketCount;

	/*
	 * public String[] stop= new String[5];
	 * 
	 * 
	 * public Route (int routeNumber,String stop1,String stop2,String stop3,String
	 * stop4,String stop5) { this.routeNumber = routeNumber; this.stop[0] = stop1;
	 * this.stop[1] = stop2; this.stop[2] = stop3; this.stop[3] = stop4;
	 * this.stop[4] = stop5; }
	 */
	public Route(int routeNumber, int ticketCount, int ticketPrice, int totalDistance, String description) {
		this.routeNumber = routeNumber;
		this.ticketCount = ticketCount;
		this.ticketPrice = ticketPrice;
		this.totalDistance = totalDistance;
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
		System.out.println("Description: " + description);
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("Bus Stop " + (i + 1) +
		 * " : " + stop[i]); }
		 */
		System.out.println();
	}
}
