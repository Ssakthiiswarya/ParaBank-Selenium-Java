package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By registerLink = By.linkText("Register");

    By firstName = By.id("customer.firstName");

    By lastName = By.id("customer.lastName");

    By address = By.id("customer.address.street");

    By city = By.id("customer.address.city");

    By state = By.id("customer.address.state");

    By zipCode = By.id("customer.address.zipCode");

    By phone = By.id("customer.phoneNumber");

    By ssn = By.id("customer.ssn");

    By username = By.id("customer.username");

    By password = By.id("customer.password");

    By confirmPassword = By.id("repeatedPassword");

    By registerButton = By.xpath("//input[@value='Register']");

    public void clickRegisterLink() {
        driver.findElement(registerLink).click();
    }
    public void registerUser(String fname, String lname, String addr,
                             String cityName, String stateName,
                             String zip, String phoneNum,
                             String ssnNum, String user,
                             String pass) {

        driver.findElement(firstName).sendKeys(fname);

        driver.findElement(lastName).sendKeys(lname);

        driver.findElement(address).sendKeys(addr);

        driver.findElement(city).sendKeys(cityName);

        driver.findElement(state).sendKeys(stateName);

        driver.findElement(zipCode).sendKeys(zip);

        driver.findElement(phone).sendKeys(phoneNum);

        driver.findElement(ssn).sendKeys(ssnNum);

        driver.findElement(username).sendKeys(user);

        driver.findElement(password).sendKeys(pass);

        driver.findElement(confirmPassword).sendKeys(pass);

        driver.findElement(registerButton).click();
    }
}