package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage {

    WebDriver driver;

    public BillPayPage(WebDriver driver) {
        this.driver = driver;
    }
    By billPayLink = By.linkText("Bill Pay");
    By sendPaymentButton = By.xpath("//input[@value='Send Payment']");

    public void clickBillPay() {
        driver.findElement(billPayLink).click();
    }

    public void clickSendPayment() {
        driver.findElement(sendPaymentButton).click();
    }

    public String getPageSource() {
        return driver.getPageSource();
    }
}