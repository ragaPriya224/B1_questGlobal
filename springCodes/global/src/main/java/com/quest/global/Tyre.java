package com.quest.global;

public class Tyre {

	

//constructor 
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	private String brand;
	//getter setter

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	
	
	
	
}
