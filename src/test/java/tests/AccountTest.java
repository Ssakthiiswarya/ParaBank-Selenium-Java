package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;

public class AccountTest extends BaseTest {

    @Test
    public void verifyAccountOverviewTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl);
    }

    @Test
    public void verifyAccountNumberAndBalanceTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        String pageSource = driver.getPageSource();
        Assert.assertNotNull(pageSource);
    }

    @Test
    public void verifyAccountDetailsPageTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        String title = driver.getTitle();
        Assert.assertNotNull(title);
    }

    @Test
    public void verifyBackNavigationTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        driver.navigate().back();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl);
    }
}