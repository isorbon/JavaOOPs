package com.syntax.class17;

public class StudentHW {
    private String name;
    private String address;

    public StudentHW(String nameStud, String addressStud){
        name=nameStud;
        address=addressStud;
    }
    public void displayInfo(){
        System.out.println("Student's name: "+name+"; Address: "+address);
    }
}
