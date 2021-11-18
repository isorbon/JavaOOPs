package com.syntax.class19;

public class Employee {
    String name;
    int age;
    int salary = 30000;
    int baseNoDaysOff = 20;

    void printSalary() {
        System.out.println(salary);
    }

    void printNoDayOff() {
        System.out.println(baseNoDaysOff);
    }
}

class Manager extends Employee {
    int salary = 50000;
    int bonus = 10;
    int travelingAllowance = 200;

    void printSalary() {
        super.printSalary();
        System.out.println(bonus + travelingAllowance + super.salary);
    }
}
