package com.busmanagement;

public class Index {

	public static void main(String args[]) {
	        Driver tom = new Driver("Tom", "0914257933", "97146022", "VCB", "18148","Day");
	        /*System.out.println("Driver: " + tom.getName());
	        System.out.println("Telephone Number: " + tom.getTel());*/
	        tom.getInfo();
	        tom.duty(true);
	        System.out.println("Message from "+tom.getName()+ ": "+tom.communicate("Clear")+" ");
	        System.out.println(tom.checkIn());
	        Route A14 = new Route(14,"VGU","Nga tu Binh Phuoc","Ben xe Mien Dong","Hang Xanh","Ho con Rua");
	        A14.getInfo();
	        Bus A2 = new Bus(tom, A14, "61B 61773", "Ho con Rua", 30, 40, 8000, 50);
	        A2.getInfo();
	        A2.run(true);
	        
	        //Driver jerry = new Driver("Jerry", "0918025543", "17355","Afternoon");
	        Driver jerry = new Driver("Jerry", "0918025543", "92482104", "VCB", "17355","Afternoon");
	        /*System.out.println("Driver: " + jerry.getName());
	        System.out.println("Telephone Number: " + jerry.getTel());*/
	        jerry.getInfo();
	        jerry.duty(false);
	        jerry.checkOut();
	        Route A51 = new Route(51,"VGU","Hikari","Thu Vien Tinh Binh Duong","Nga Ba Lo Chen","Ben xe Mien Dong");
	        A51.getInfo();
	        Bus A1 = new Bus(jerry, A51,"61B 61554", "Hikari", 50, 0, 8000, 0);
	        A1.getInfo();
	        A1.run(false);
	        
	}

}


