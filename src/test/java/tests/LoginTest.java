package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][]{

                {
                        ConfigReader.getUsername(),
                        ConfigReader.getPassword(),
                        true
                },

                {
                        ConfigReader.getUsername(),
                        "wrongpass",
                        false
                }
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username,
                          String password,
                          boolean validLogin) {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApplication(username, password);


    }
}