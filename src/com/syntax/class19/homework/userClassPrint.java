package com.syntax.class19.homework;

public class userClassPrint {
    public static void main(String[] args) {
        userInfo userInfo = new userInfo("John", 4257751168L);
        userInfo.userAddress = "23117 83rd Ave W, Edmonds, WA, 98026";
        userInfo.userDetails();
    }

}
