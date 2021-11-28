package com.syntax.class23.abstraction;

public abstract class Phone {
    void makePhoneCalls(){
        System.out.println("Making a call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPictures();
    abstract void unlockPhone();
}

class iPhone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("iPhone uses Photos app to display the pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Use FaceId to unclock the phone");
    }
}

class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Use Fingerprint sensor to unlock the phone");
    }

    @Override
    void displayPictures() {
        System.out.println("Use gallery app to view pictures");
    }
}