package com.busmanagement;

public class Main {

	public static void main(String args[]) {
	        Driver tom = new Driver("18148", "Tom", "0914257933","Day", "Unavailable");
	        /*System.out.println("Driver: " + tom.getName());
	        System.out.println("Telephone Number: " + tom.getTel());*/
	        tom.getInfo();
	        //Route A14 = new Route(14,"VGU","Nga tu Binh Phuoc","Ben xe Mien Dong","Hang Xanh","Ho con Rua");
	        Route A14 = new Route(14, 50, 8000, 10, "Hi");
	        A14.getInfo();
	        Bus A2 = new Bus(tom, A14, "61B 61773", 30, 40, "Unavailable");
	        A2.getInfo();
	        
	        Driver jerry = new Driver("17355", "Jerry", "0918025543","Afternoon", "Avaiable");
	        /*System.out.println("Driver: " + jerry.getName());
	        System.out.println("Telephone Number: " + jerry.getTel());*/
	        jerry.getInfo();
	        //Route A51 = new Route(51,"VGU","Hikari","Thu Vien Tinh Binh Duong","Nga Ba Lo Chen","Ben xe Mien Dong");
	        Route A51 = new Route(51, 0, 8000, 8, "Hello");
	        A51.getInfo();
	        Bus A1 = new Bus(jerry, A51,"61B 61554", 50, 0, "Available");
	        A1.getInfo();

	        
	}

}


