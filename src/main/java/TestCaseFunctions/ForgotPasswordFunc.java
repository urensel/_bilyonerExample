package TestCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class ForgotPasswordFunc extends BasePage {
    public ForgotPasswordFunc(WebDriver driver) {
        super(driver);
    }


    public By loginButton = By.xpath("//*[@class='btn btn btn-login']");
    public By forgotPasswordButton = By.linkText("Şifremi Unuttum");
    public By citizenshipNumber = By.id("citizenshipNumber");
    public By birthDate = By.id("birthDate");
    public By newPassword = By.id("newPassword");
    public By newPasswordAgain = By.id("newPasswordAgain");
    public By renewPassword = By.xpath("//*[contains(text(),'ŞİFREMİ YENİLE')]");


    public void forgotPassword() {
        element(loginButton).click();
        element(forgotPasswordButton).click();
        sendKeys(citizenshipNumber, citizenshipNumberText);
        element(birthDate).click();
        sendKeys(birthDate, birthDateText);
        sendKeys(newPassword, passwordText);
        sendKeys(newPasswordAgain, passwordText);
        element(renewPassword).click();
    }
}
