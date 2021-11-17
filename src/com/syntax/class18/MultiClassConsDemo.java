package com.syntax.class18;

public class MultiClassConsDemo {
    MultiClassConsDemo(){
        System.out.println("1");
    }
    MultiClassConsDemo(String name, int num){
        System.out.println("2");
    }
    MultiClassConsDemo(int num, String name){
        System.out.println("3");
    }
    MultiClassConsDemo(String name, int num, double weight){
        System.out.println("4");
    }
}
