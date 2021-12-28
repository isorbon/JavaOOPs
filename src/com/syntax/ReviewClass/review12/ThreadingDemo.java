package com.syntax.ReviewClass.review12;

public class ThreadingDemo {
    public static void main(String[] args) {
        Thread t1=null;
        Thread t2=null;
        t1=new Thread(() -> System.out.println("Thread 1"));
        t2=new Thread(() -> System.out.println("Thread 2"));

        t1.start();
        t2.start();
    }
}
