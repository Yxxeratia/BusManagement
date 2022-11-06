/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.busmanagement;

/**
 *
 * @author DELL
 */
public class Route {
    int Route_Number;
    String[] stop= new String[5];

    public Route (int number,String stop1,String stop2,String stop3,String stop4,String stop5) {
        this.Route_Number = Route_Number;
        this.stop[0] = stop1;
        this.stop[1] = stop2;
        this.stop[2] = stop3;
        this.stop[3] = stop4;
        this.stop[4] = stop5;
    }
    public void getInfo() {
        
        System.out.println("\nRoute Number: "+ Route_Number );
        for (int i = 0; i <5; i++){
        System.out.println("Bus Stop " + (i+1) + " : "+stop[i]);
    }
        System.out.print("\n");
    }
}
