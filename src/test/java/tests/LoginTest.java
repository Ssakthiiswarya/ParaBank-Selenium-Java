package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{

                {"sakthi", "wrongpass"},

                {"wronguser", "pass123"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username,
                          String password) {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApplication(username, password);

        String currentUrl = driver.getCurrentUrl();

        Assert.assertNotNull(currentUrl);
    }
}