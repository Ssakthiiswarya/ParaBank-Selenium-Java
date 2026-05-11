package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void userRegistrationTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickRegisterLink();
        registerPage.registerUser(
                "Ishu",
                "S",
                "Trichy",
                "Trichy",
                "Tamil Nadu",
                "600001",
                "9876543210",
                "123",
                "ishu" + System.currentTimeMillis(),
                "ishu123"
        );
        Assert.assertTrue(driver.getPageSource().contains("Welcome"));
    }
}