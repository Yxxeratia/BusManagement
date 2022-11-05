package com.busmanagement;

public class Index {

	public static void main(String args[]) {
		   Driver jerry = new Driver("Jerry", "01231313", "12312313", "1313132", 18147,"Afternoon");
	        System.out.println(jerry.getName());
	        jerry.offDuty();
	        jerry.checkOut();
	        Route A51 = new Route(51,"VGU","Hikari","Thu Vien Tinh Binh Duong","Nga Ba Lo Chen","Ben xe Mien Dong");
	        A51.getInfo();
	        Bus A1 = new Bus(jerry,A51,"61B 61554", "Hikari", 50, 0, 8000, 0);
	        A1.getInfo();
	        A1.Idle();
	        
	        Driver tom = new Driver("Tom", "01231313", "12312313", "1313132",18148,"Day");
	        System.out.println(tom.getName());
	        tom.onDuty();
	        tom.communicate("Clear");
	        tom.checkIn();
	        Route A52 = new Route(52,"VGU","Nga tu Binh Phuoc","Ben xe Mien Dong","Hang Xanh","Ho con Rua");
	        A52.getInfo();
	        Bus A2 = new Bus(tom,A52, "61B 61553", "Ho con Rua", 30, 40, 8000, 50);
	        A2.getInfo();
	        A2.Run();
	}

}


