package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    By username = By.name("username");

    By password = By.name("password");

    By loginBtn = By.xpath("//input[@value='Log In']");

    By errorMessage = By.className("error");

    By logoutLink = By.linkText("Log Out");

    public void enterUsername(String user) {
        waitForElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        waitForElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        waitForElement(loginBtn).click();
    }

    public void loginToApplication(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }

    public String getErrorMessage() {
        return waitForElement(errorMessage).getText();
    }

    public void clickLogout() {
        waitForElement(logoutLink).click();
    }
}