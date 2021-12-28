package com.syntax.ReviewClass.review12;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SetDemo4 {
    public static void main(String[] args) {
        LinkedHashSet<Person> persons = new LinkedHashSet<>();
        persons.add(new Person("Naiya", 16));
        persons.add(new Person("Aysha", 16));
        persons.add(new Person("Hasim", 22));
        persons.add(new Person("Alexey", 25));

        long count = persons.stream().filter(p -> p.name.contains("s")).count();
        System.out.println(count);

        List<String> collect = persons.stream().filter(p -> p.age > 16).map(p -> p.name).collect(Collectors.toList());
        System.out.println(collect);
    }
}
