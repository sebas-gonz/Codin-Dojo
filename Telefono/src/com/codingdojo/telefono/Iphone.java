package com.codingdojo.telefono;

public class Iphone extends Phone implements Ringable {

	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	public String ring() {

		return "IPhone " + getVersionNumber() + " says " + getRingTone(); 
	}


	public String unlock() {
		return "Unlocking via facial recognition";
	}


	public void displayInfo() {
		System.out.println("IPhone "+ getVersionNumber()+ " From "+ getCarrier());
		
	}

	

}
