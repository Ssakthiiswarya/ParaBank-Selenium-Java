package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class AccountTest extends BaseTest {

    @Test
    public void verifyAccountOverviewTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApplication("john", "demo");

        String currentUrl = driver.getCurrentUrl();

        Assert.assertNotNull(currentUrl);
    }

    @Test
    public void verifyAccountNumberAndBalanceTest() {

        String pageSource = driver.getPageSource();

        Assert.assertNotNull(pageSource);
    }

    @Test
    public void verifyAccountDetailsPageTest() {

        String title = driver.getTitle();

        Assert.assertNotNull(title);
    }

    @Test
    public void verifyBackNavigationTest() {

        driver.navigate().back();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertNotNull(currentUrl);
    }
}