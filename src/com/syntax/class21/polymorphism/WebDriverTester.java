package com.syntax.class21.polymorphism;

public class WebDriverTester {
    public static void main(String[] args) {
       /* GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signup();
        googleChrome.login();
        googleChrome.enterUserPassword();
        googleChrome.clickSubmit();
        googleChrome.closeBrowser();
        FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.signup();
        fireFox.login();
        fireFox.enterUserPassword();
        fireFox.clickSubmit();
        fireFox.closeBrowser();*/

//        WebDriver webDriver=new Safari();
//        webDriver.openWebsite();
//        webDriver.signup();
//        webDriver.login();
//        webDriver.enterUserPassword();
//        webDriver.clickSubmit();
//        webDriver.closeBrowser();

       /* WebDriver[] webDrivers={new GoogleChrome(),new FireFox(),new Safari()};
        for (WebDriver wd:webDrivers
             ) {
            wd.openWebsite();
            wd.signup();
            wd.login();
            wd.enterUserPassword();
            wd.clickSubmit();
            wd.closeBrowser();
        }*/

        //GoogleChrome googleChrome=new WebDriverTester(); not allowed
        WebDriver webDriver=new GoogleChrome();

        GoogleChrome chrome=(GoogleChrome) webDriver;
        chrome.specialMethod();

    }
}
