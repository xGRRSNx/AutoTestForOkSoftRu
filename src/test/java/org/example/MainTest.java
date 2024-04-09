package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {

    public static Authorization authorizationPage;

    @BeforeClass
    public static void setupTest() {
        System.setProperty("webdriver.edge.driver", ConfProperties.getProperty("edgedriver"));
        WebDriver webDriver = new EdgeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        webDriver.get(ConfProperties.getProperty("loginpage"));

        authorizationPage = new Authorization(webDriver);
    }

    @Test
    public void Test() {
        authorizationPage.clickAccessButton();
        authorizationPage.inputData(ConfProperties.getProperty("login"), ConfProperties.getProperty("password"));
        authorizationPage.clickLoginButton();
    }
}
