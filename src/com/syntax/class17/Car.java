package com.syntax.class17;

public class Car {
	
	private String name;
	private String make;
	private String model;
	private String color;
	private int year;
	private int engineCC;
	private String vin;
	private int mileage;
	private int maxSpeed;
	private boolean sunroof;
	
	public Car() {}
	public Car(String carName) {
		name=carName;
	}
	
	public Car(String carName, String carMake) {
		name=carName;
		make=carMake;
	}
	
	public Car(String carName, String carMake,String carModel) {
		name=carName;
		make=carMake;
		model=carModel;
	}
	public Car(String carName, String carMake,String carModel,String carColor) {
		name=carName;
		make=carMake;
		model=carModel;
		color=carColor;
	}
	
	public Car(String carName, String carMake,String carModel, String carColor, 
			int carYear, int carEngine,
			String carVin, int carMileage, 
			int carMaxSpeed, boolean carSunroof) {
		name=carName;
		make=carMake;
		model=carModel;
		color=carColor;
		year=carYear;
		engineCC=carEngine;
		vin=carVin;
		mileage=carMileage;
		maxSpeed=carMaxSpeed;
		sunroof=carSunroof;
	}
	
	public void printName() {
		System.out.println(name);
	}
	
}
