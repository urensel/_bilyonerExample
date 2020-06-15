package TestCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SignInFunc extends BasePage {
    public SignInFunc(WebDriver driver) {
        super(driver);
    }

    public By loginButton = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/button");
    public By username = By.id("username");
    public By password = By.id("password");
    public By signInButton = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div[3]/form/div[3]/button");

    public void signIn() {
        element(loginButton).click();
        sendKeys(username, citizenshipNumberText);
        sendKeys(password, passwordText);
        element(signInButton).click();
    }
}
