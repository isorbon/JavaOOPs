package com.syntax.class24.interfacedemo;

import com.sun.deploy.perf.PerfRollup;

public interface Person {
    void eat();
    void sleep();
}
interface Employee extends Person{
    void work();
}
interface SyntaxEmployees extends Employee, Person{
    void tech();
}

class SDETInstruction implements SyntaxEmployees{

    @Override
    public void eat() {
        System.out.println("Syntax Employees eating");
    }

    @Override
    public void sleep() {
        System.out.println("Syntax Employees sleeping");
    }

    @Override
    public void work() {
        System.out.println("Creating new repls");
    }

    @Override
    public void tech() {
        System.out.println("Syntax Employees Teach IT");
    }
}
