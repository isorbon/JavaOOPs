package com.syntax.class12;

public class Method4Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method4 canBeAnyName = new Method4();
		// value from method1 will be stored in name variable
		String name1 = canBeAnyName.method1();
		System.out.println(name1);
		System.out.println(canBeAnyName.method2("Roman"));
		// String name=canBeAnyName.method3(); not possible
		canBeAnyName.method3();
		canBeAnyName.method4("Nasir");
		System.out.println(canBeAnyName.method5("Henok"));
	}

}
