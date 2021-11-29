package com.syntax.TeamProject02.Task05;

public class RegistrationRun {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("sorbon@yahoo.com");
        registration.setUserName("isorbon");
        registration.setPassword("123pass?!&%");
        registration.hiddenPassword();
    }
}
