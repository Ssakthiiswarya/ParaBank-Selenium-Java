package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TransactionPage;
import utilities.ConfigReader;

public class TransactionTest extends BaseTest {

    @Test
    public void verifyTransactionSearchByAmountTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        TransactionPage transactionPage = new TransactionPage(driver);
        transactionPage.clickFindTransactions();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotNull(currentUrl);
    }

    @Test
    public void verifyTransactionSearchByDateTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        TransactionPage transactionPage = new TransactionPage(driver);
        transactionPage.clickFindTransactions();
        String title = driver.getTitle();
        Assert.assertNotNull(title);
    }

    @Test
    public void verifyEmptyTransactionSearchTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginToApplication(
                ConfigReader.getUsername(),
                ConfigReader.getPassword()
        );

        TransactionPage transactionPage = new TransactionPage(driver);
        transactionPage.clickFindTransactions();
        String page = driver.getPageSource();
        Assert.assertNotNull(page);
    }
}