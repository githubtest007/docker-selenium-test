package com.testautomationguru.container.test;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        if (System.getProperty("browser").equals("firefox"))
//            dc = DesiredCapabilities.firefox();
        String	host="127.0.0.1";
        DesiredCapabilities chromeDesiredcap = DesiredCapabilities.chrome();
         driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), chromeDesiredcap);

//        String host = System.getProperty("seleniumHubHost");
//	    String	host="127.0.0.1";
//        driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), dc);
//         driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub/"), DesiredCapabilities.chrome());

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        driver.quit();
    }  
}
