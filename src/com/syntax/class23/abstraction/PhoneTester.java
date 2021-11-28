package com.syntax.class23.abstraction;

public class PhoneTester {
    public static void main(String[] args) {
        // Phone phone = new Phone(); cannot create the object

        iPhone iphone = new iPhone();
        iphone.displayPictures();
        iphone.unlockPhone();
        iphone.makePhoneCalls();
        iphone.sendText();

        Samsung samsung = new Samsung();
        samsung.displayPictures();
        samsung.unlockPhone();
        samsung.sendText();
        samsung.makePhoneCalls();

        Phone[] phones = {new iPhone(), new Samsung()};
        for (Phone phone:phones
             ) {
            phone.displayPictures();
            phone.unlockPhone();
            phone.makePhoneCalls();
            phone.sendText();
        }
    }
}
