package com.syntax.TeamProject02.Task04;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening browser of Chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing browser of Chrome");
    }

    @Override
    public String getTitle() {
        return "Title from Google Chrome";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating browser of Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Chrome Gets a screenshot");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening browser of Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing browser of Firefox");
    }

    @Override
    public String getTitle() {
        return "Title from Firefox";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating browser of Firefox");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox Gets a screenshot");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening browser of Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing browser of Safari");
    }

    @Override
    public String getTitle() {
        return "Title from Safari";
    }

    @Override
    public void navigate() {
        System.out.println("Navigating browser of Safari");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari Gets a screenshot");
    }
}
