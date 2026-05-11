package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage {

    WebDriver driver;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
    }

    By transferFundsLink = By.linkText("Transfer Funds");

    By amountField = By.id("amount");

    By transferButton = By.xpath("//input[@value='Transfer']");

    By successMessage = By.className("title");

    public void clickTransferFunds() {
        driver.findElement(transferFundsLink).click();
    }

    public void enterAmount(String amount) {
        driver.findElement(amountField).clear();
        driver.findElement(amountField).sendKeys(amount);
    }

    public void clickTransferButton() {
        driver.findElement(transferButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }
}