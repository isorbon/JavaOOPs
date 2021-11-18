package com.syntax.class19.homework;

public class userClass {
    /*
    Write program: userClass that has a constructor that initializes instance variable name and mobile number.
    Create a subclass userInfo that will have user address variable and it also being initialized
    through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    long mobileNumber;

    userClass(String name, long mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class userInfo extends userClass {
    String userAddress;
    userInfo(String name, long mobileNumber) {
        super(name, mobileNumber);
    }
    void userDetails() {
        System.out.println("Name: " + name + "; Mobile number: " + mobileNumber +
                "; Address: " + userAddress);
    }
}
