package com.syntax.class24.task;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.*/
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening browser of Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser of Chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window of Chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Chrome browser");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening browser of Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing browser of Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window of Firefox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Firefox browser");
    }
}