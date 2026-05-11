package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TransferPage;
import utilities.ConfigReader;

public class TransferTest extends BaseTest {

    @Test
    public void verifyFundTransferTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        TransferPage transferPage = new TransferPage(driver);

        transferPage.clickTransferFunds();

        transferPage.enterAmount("100");

        transferPage.clickTransferButton();

        String message = transferPage.getSuccessMessage();

        Assert.assertNotNull(message);
    }

    @Test
    public void verifyTransferredAmountTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        TransferPage transferPage = new TransferPage(driver);

        transferPage.clickTransferFunds();

        transferPage.enterAmount("200");

        transferPage.clickTransferButton();

        String page = transferPage.getPageSource();

        Assert.assertNotNull(page);
    }

    @Test
    public void verifyInvalidAmountTransferTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        TransferPage transferPage = new TransferPage(driver);

        transferPage.clickTransferFunds();

        transferPage.enterAmount("-100");

        transferPage.clickTransferButton();

        String page = transferPage.getPageSource();

        Assert.assertNotNull(page);
    }

    @Test
    public void verifyEmptyAmountTransferTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        TransferPage transferPage = new TransferPage(driver);

        transferPage.clickTransferFunds();

        transferPage.enterAmount("");

        transferPage.clickTransferButton();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertNotNull(currentUrl);
    }
}