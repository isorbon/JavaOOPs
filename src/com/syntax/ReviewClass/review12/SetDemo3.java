package com.syntax.ReviewClass.review12;

import java.util.LinkedHashSet;

public class SetDemo3 {
    public static void main(String[] args) {
        LinkedHashSet<Person> persons = new LinkedHashSet<>();
        persons.add(new Person("Naiya", 16));
        persons.add(new Person("Aysha", 16));
        persons.add(new Person("Hasim", 22));
        persons.add(new Person("Alexey", 25));


        System.out.println(new Person("Naiya", 16));
        persons.remove(new Person("Naiya", 16));
        System.out.println(persons);

        persons.removeIf(p -> p.name.contains("H"));
        System.out.println(persons);

        persons.forEach(p-> System.out.println(p)); // Prints all the elements one by one

    }

}
