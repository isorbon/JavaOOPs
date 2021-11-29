package com.syntax.class24.task;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver webdriver:webDrivers
             ) {
            webdriver.openBrowser();
            webdriver.closeBrowser();
            webdriver.maximizeWindow();
            webdriver.findElement();
        }
    }
}
