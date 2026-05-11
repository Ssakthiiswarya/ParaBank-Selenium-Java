package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void verifyLogoutTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApplication("john", "demo");

        loginPage.clickLogout();

        Assert.assertTrue(driver.getCurrentUrl().contains("index"));
    }
}