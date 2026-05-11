package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    By accountTable = By.id("accountTable");

    By firstAccount = By.xpath("//table[@id='accountTable']//a");

    By accountNumber = By.xpath("//table[@id='accountTable']//a");

    By accountBalance = By.xpath("//table[@id='accountTable']//td[2]");

    By accountDetailsTitle = By.className("title");

    public boolean isAccountTableDisplayed() {
        return driver.findElement(accountTable).isDisplayed();
    }

    public String getAccountNumber() {
        return driver.findElement(accountNumber).getText();
    }

    public String getAccountBalance() {
        return driver.findElement(accountBalance).getText();
    }

    public void openFirstAccount() {
        driver.findElement(firstAccount).click();
    }

    public String getAccountDetailsTitle() {
        return driver.findElement(accountDetailsTitle).getText();
    }

    public void navigateBack() {
        driver.navigate().back();
    }
}