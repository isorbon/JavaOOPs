package com.syntax.ReviewClass.review13;

public class Learning {
    public static void learn(String student) throws ConfusionException{
        if (student.equals("Aysha")){
            throw new ConfusionException("I am confused");
        }else if(student.equals("Eleni")) {
            throw new ConfusionException("Confused for last 3 months");
        }else {
            System.out.println("Easy peasy");
        }
    }
}
