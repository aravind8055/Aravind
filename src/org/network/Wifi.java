package org.network;

public class Wifi {
	private void wifiName() {
	System.out.println("airtel");

	}
	public static void main(String[] args) {
		Wifi c = new Wifi();
		c.wifiName();
		
		MobileData c1 = new MobileData();
		c1.dataName();
		
		Lan c2 = new Lan();
		c2.lanName();
		
		Wireless c3= new Wireless();
		c3.modamName();
	}

}
