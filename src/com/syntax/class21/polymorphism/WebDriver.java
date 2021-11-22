package com.syntax.class21.polymorphism;

public class WebDriver {
    void openWebsite(){
        System.out.println("Opening a website");
    }
    void signup(){
        System.out.println("Signup on the website");
    }
    void login(){
        System.out.println("Login to website");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password ");
    }
    void clickSubmit(){
        System.out.println("Clicking on submit button");
    }
    void closeBrowser(){
        System.out.println("Closing the browser ");
    }
}
class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in Google Chrome");
    }
    void signup(){
        System.out.println("Signup on the website in Google Chrome");
    }
    void login(){
        System.out.println("Login to website in Google Chrome");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password in Google Chrome");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("closing the browser in Google Chrome");
    }

    void specialMethod(){
        System.out.println("Only present in chrome");
    }
}

class FireFox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in FireFox");
    }
    void signup(){
        System.out.println("Signup on the website in FireFox");
    }
    void login(){
        System.out.println("Login to website in FireFox");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password in FireFox");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in FireFox");
    }
    void closeBrowser(){
        System.out.println("closing the browser in FireFox");
    }
}

class Safari extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website in Safari");
    }
    void signup(){
        System.out.println("Signup on the website in Safari");
    }
    void login(){
        System.out.println("Login to website in Safari");
    }
    void enterUserPassword(){
        System.out.println("Entering the user password in Safari");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in Safari");
    }
    void closeBrowser(){
        System.out.println("closing the browser in Safari");
    }
}
