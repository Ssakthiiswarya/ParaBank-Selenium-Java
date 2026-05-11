package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage {

    WebDriver driver;

    public TransactionPage(WebDriver driver) {
        this.driver = driver;
    }

    By findTransactionsLink = By.linkText("Find Transactions");

    By amountField = By.id("criteria.amount");

    By findByAmountButton = By.id("findByAmount");

    By fromDateField = By.id("criteria.fromDate");

    By toDateField = By.id("criteria.toDate");

    By findByDateButton = By.id("findByDateRange");

    public void clickFindTransactions() {
        driver.findElement(findTransactionsLink).click();
    }

    public void searchByAmount(String amount) {
        driver.findElement(amountField).sendKeys(amount);
        driver.findElement(findByAmountButton).click();
    }

    public void searchByDate(String fromDate, String toDate) {
        driver.findElement(fromDateField).sendKeys(fromDate);
        driver.findElement(toDateField).sendKeys(toDate);
        driver.findElement(findByDateButton).click();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }
}