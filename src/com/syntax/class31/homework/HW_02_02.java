package com.syntax.class31.homework;

public class HW_02_02 {
     /* With your own Exception create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters.*/

    public static void main(String[] args) {
        try {
            UserName.checkUserName("xrls");
        } catch (UserNameException e) {
            e.printStackTrace();
        }
    }
}

class UserNameException extends Exception{
    UserNameException(String message){
        super(message);
    }
}

class UserName{
    public static void checkUserName(String username) throws UserNameException{
        if (username.length() < 5){
            throw new UserNameException("The Username should not be less than 5 characters");
        }else {
            System.out.println("You username is correct");
        }
    }
}