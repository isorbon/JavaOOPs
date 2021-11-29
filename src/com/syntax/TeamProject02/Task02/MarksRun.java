package com.syntax.TeamProject02.Task02;

public class MarksRun {
    public static void main(String[] args) {
        Marks[] marks = {new studentA(72.5,86.3,92.4), new studentB(82.9, 93.6, 95.3, 89.5)};
        for (Marks mark:marks
             ) {
            mark.getPercentage();
        }
    }
}
