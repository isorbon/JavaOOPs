package com.syntax.TeamProject02.Task04;

public class WebDriverRun {
    public static void main(String[] args) {
        RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver remote : remoteWebDrivers
        ) {
            if (remote instanceof ChromeDriver) {
                System.out.println(((ChromeDriver) remote).getTitle("Chrome browser"));
            } else if (remote instanceof FirefoxDriver) {
                System.out.println(((FirefoxDriver) remote).getTitle("Firefox browser"));
            } else if (remote instanceof SafariDriver) {
                System.out.println(((SafariDriver) remote).getTitle("Safari browser"));
            }
            remote.open();
            remote.close();
            remote.getScreenshot();
            remote.navigate();
        }

    }
}
