package com.syntax.class17;

public class StudentsObj {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Students stud1 = new Students("Alex", 75, 89, 92);
        stud1.Calculate();

        // or we can write this like:
        new Students("Ahmad", 78, 82, 91).Calculate();

        new Students("Sharif", 73, 92, 85).Calculate();

        new Students("Aysha", 86, 93, 96).Calculate();

        new Students("Olga", 73, 91, 94).Calculate();
    }

}
