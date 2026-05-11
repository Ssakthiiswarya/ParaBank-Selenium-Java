package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.name("username");

    By password = By.name("password");

    By loginBtn = By.xpath("//input[@value='Log In']");

    By errorMessage = By.className("error");

    By logoutLink = By.linkText("Log Out");

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void loginToApplication(String user, String pass) {

        enterUsername(user);

        enterPassword(pass);

        clickLogin();
    }

    public String getErrorMessage() {

        return driver.findElement(errorMessage).getText();
    }

    public void clickLogout() {

        driver.findElement(logoutLink).click();
    }
}