package com.syntax.TeamProject02.Task04;

public class WebDriverRun {
    public static void main(String[] args) {
        RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver remote : remoteWebDrivers
        ) {
            System.out.println(remote.getTitle());
            remote.open();
            remote.close();
            remote.getScreenshot();
            remote.navigate();
        }

    }
}
