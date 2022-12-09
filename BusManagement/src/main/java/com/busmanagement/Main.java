package com.busmanagement;

public class Main {

	public static void main(String args[]) {
	        Driver tom = new Driver("18148", "Tom", "914257933","Day", "Busy");
			/*
			 * System.out.println("Driver: " + tom.getName());
			 * System.out.println("Telephone Number: " + tom.getTel());
			 */
	        tom.getInfo();
	        Route A51 = new Route(51, 50, 8000, 27, "40 minutes", "VGU to Ben xe Binh Duong");
	        A51.getInfo();
	        Bus A2 = new Bus(tom, A51, 1, "61B 61773", 30, 50, 40, "Busy");
	        A2.getInfo();
	        
	        Driver jerry = new Driver("17355", "Jerry", "918025543","Night", "Available");
			/*
			 * System.out.println("Driver: " + jerry.getName());
			 * System.out.println("Telephone Number: " + jerry.getTel());
			 */
	        jerry.getInfo();
	        Route A14 = new Route(14, 0, 8000, 40, "2 hours", "VGU to Ho Con Rua");
	        A14.getInfo();
	        Bus A1 = new Bus(jerry, A14, 1, "61B 61554", 50, 50, 0, "Available");
	        A1.getInfo();

	        Manager jack = new Manager("Jack", "0920116378");
	        jack.getInfo();
	        
	        //Route 51: VGU, Hikari, Thu vien tinh Binh Duong, Nga ba Lo Chen, Ben xe Binh Duong
	        //Route 14: VGU, Nga tu Binh Phuoc, Ben xe mien Dong, Hang Xanh, Ho Con Rua
	}

}


