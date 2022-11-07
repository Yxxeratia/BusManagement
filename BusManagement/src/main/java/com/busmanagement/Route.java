
package com.busmanagement;


public class Route {
    int routeNumber;
    String[] stop= new String[5];

    public Route (int routeNumber,String stop1,String stop2,String stop3,String stop4,String stop5) {
        this.routeNumber = routeNumber;
        this.stop[0] = stop1;
        this.stop[1] = stop2;
        this.stop[2] = stop3;
        this.stop[3] = stop4;
        this.stop[4] = stop5;
    }
    public void getInfo() {
        
        System.out.println("\nRoute Number: "+ routeNumber);
        for (int i = 0; i < 5; i++){
        System.out.println("Bus Stop " + (i+1) + " : "+stop[i]);
    }
        System.out.print("\n");
    }
}
