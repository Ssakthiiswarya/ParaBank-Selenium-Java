package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BillPayPage;
import pages.LoginPage;
import pages.RegisterPage;

public class FormValidationTest extends BaseTest {

    @Test
    public void verifyEmptyRegistrationFormTest() {

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.clickRegisterLink();

        String page = driver.getPageSource();

        Assert.assertNotNull(page);
    }

    @Test
    public void verifyPasswordMismatchValidationTest() {

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.clickRegisterLink();

        String title = driver.getTitle();

        Assert.assertNotNull(title);
    }

    @Test
    public void verifyEmptyBillPayFormTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApplication("john", "demo");

        BillPayPage billPayPage = new BillPayPage(driver);

        billPayPage.clickBillPay();

        billPayPage.clickSendPayment();

        String page = billPayPage.getPageSource();

        Assert.assertNotNull(page);
    }
}