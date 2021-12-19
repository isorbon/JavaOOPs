package com.syntax.class28.homework.HW_03;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {

        TreeMap<Integer,Person> personTreeMap=new TreeMap<>();
        Person person = new Person("Jimmy", "Castro", 30, 500000);
        Person person1 = new Person("Sebastian", "Castro", 4, 1000000);
        Person person2 = new Person("Mateo", "Castro", 5, 500000);
        Person person3 = new Person("Carolina", "Rojas", 30, 800000);
        personTreeMap.put(1,person);
        personTreeMap.put(20,person1);
        personTreeMap.put(10,person2);
        personTreeMap.put(15,person3);

        Collection<Person> value = personTreeMap.values();
        for(Person values:value) {
            values.printUser();
        }

      /*  TreeMap<Integer, String> object = new TreeMap<>();
        Person obj1 = new Person("Alexey","Sitalo",28,8540.50);
        String value1 = obj1.printUser();
        object.put(654987,value1);

        Person obj2 = new Person("Aysha","Eshonova",25,8320.20);
        String value2 = obj2.printUser();
        object.put(987356,value2);

        Set<Map.Entry<Integer, String>> entrySet = object.entrySet();
        for (Map.Entry<Integer, String> entry:entrySet
             ) {
            System.out.println(entry);
        }*/

    }
}
