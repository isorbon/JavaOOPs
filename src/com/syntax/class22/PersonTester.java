package com.syntax.class22;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Teacher("Asghar");
        Teacher teacher = new Teacher("Asghar");
        teacher.eat();
       // Teacher teacher1 = new Person("Person"); it's not possible
    Person[] persons = {new Employee("Farhad"), new Teacher("Ahmet"),
            new Student("Yogita")};

        for (Person person2:persons
             ) {
            person2.performDailyTask();
            person2.eat();

            if(person2 instanceof Teacher){
                ((Teacher)person2).designClasses();
            }
        }

    }
}
