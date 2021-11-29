package com.syntax.class24.interfacedemo;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new SDETInstruction();
        person.eat();
        person.sleep();
       /* person.teach();
        person.work();*/

        Employee employee = new SDETInstruction();
        employee.work();
        // employee.eat();

    /*    SyntaxEmployees syntaxEmployees = new SDETInstruction();
        syntaxEmployees.tech();
        syntaxEmployees.eat();
        syntaxEmployees.work();
        syntaxEmployees.sleep();

        SDETInstruction sdetInstruction=new SDETInstruction();
        sdetInstruction.tech();
        sdetInstruction.eat();
        sdetInstruction.work();
        sdetInstruction.sleep();*/

        SDETInstruction[] sdetInstructions = {new SDETInstruction()};
        for (SDETInstruction sdetInstruction:sdetInstructions
             ) {
            sdetInstruction.eat();
            sdetInstruction.sleep();
            sdetInstruction.work();
            sdetInstruction.sleep();
        }
    }
}
