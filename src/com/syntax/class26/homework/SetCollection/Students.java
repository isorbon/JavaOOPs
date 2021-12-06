package com.syntax.class26.homework.SetCollection;

import java.util.HashSet;
import java.util.Iterator;

public class Students {
    /*  Create a Set collection that will hold Objects of Student Type.
      In this set we do not care about the insertion order. Each student object should have name and studentID.
      Display name of each student.*/
    String studentName;
    int studentID;

    Students(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    void printStudent(){
        System.out.println(studentName + " - " + studentID);
    }

    public static void main(String[] args) {
        HashSet<Students> student = new HashSet<>();
        student.add(new Students("Alexey", 352543));
        student.add(new Students("Demir", 652489));
        student.add(new Students("Hasim", 357951));
        student.add(new Students("Zema", 456987));
        student.add(new Students("Aysha", 321456));
        student.add(new Students("Ahmet", 369789));
        student.add(new Students("Silav", 741321));

        for (Students st:student
             ) {
            st.printStudent();
        }

    }
}
