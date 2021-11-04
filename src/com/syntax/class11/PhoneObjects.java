package com.syntax.class11;
		// HOMEWORK 01
public class PhoneObjects {

	public static void main(String[] args) {
		// Creating 3 Objects Phone class: iPhone, Android, Nokia

		Phone iPhone = new Phone();
		iPhone.name = "iPhone";
		iPhone.model = "13 Pro";
		iPhone.memory = 128;
		iPhone.ram = 6;
		iPhone.oS = "iOS 15";
		iPhone.mainCamera = 36;
		iPhone.frontСamera = 12;
		iPhone.color = "Blue";
		iPhone.diagonal = 6.1;
		iPhone.weight = 204;

		iPhone.speed();
		iPhone.camera();
		iPhone.design();
		iPhone.weightPhone();

		System.out.println("------------------------------------");

		Phone redMi = new Phone();
		redMi.name = "Redmi";
		redMi.model = "Note 10 Pro";
		redMi.memory = 256;
		redMi.ram = 8;
		redMi.oS = "Android 11";
		redMi.mainCamera = 123;
		redMi.frontСamera = 16;
		redMi.color = "Gray";
		redMi.diagonal = 6.67;
		redMi.weight = 193;

		redMi.speed();
		redMi.camera();
		redMi.design();
		redMi.weightPhone();

		System.out.println("------------------------------------");

		Phone nokia = new Phone();
		nokia.name = "Nokia";
		nokia.model = "5.4 TA";
		nokia.memory = 64;
		nokia.ram = 4;
		nokia.oS = "Android 10";
		nokia.mainCamera = 57;
		nokia.frontСamera = 16;
		nokia.color = "Blue";
		nokia.diagonal = 6.39;
		nokia.weight = 193;

		nokia.speed();
		nokia.camera();
		nokia.design();
		nokia.weightPhone();

	}

}
