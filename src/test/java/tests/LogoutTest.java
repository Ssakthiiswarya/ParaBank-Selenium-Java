package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;

public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogoutTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        loginPage.clickLogout();
        Assert.assertTrue(driver.getCurrentUrl().contains("index"));

    }
}