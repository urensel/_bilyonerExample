package TestCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

public class SignUpFunc extends BasePage {
    public SignUpFunc(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);
    public By registerButton = By.linkText("Üye Ol");
    public By firstName = By.id("firstName");
    public By lastName = By.id("lastName");
    public By citizenshipNumber = By.id("citizenshipNumber");
    public By birthDate = By.id("birthDate");
    public By phone = By.id("phone");
    public By email = By.id("email");
    public By password = By.id("password");
    public By checkboxSwitch = By.xpath("//*[@class='checkbox switch']");
    public By signUpButton = By.xpath("//*[contains(text(),'ÜYE OL')]");

    public void signUp() {

        element(registerButton).click();
        sendKeys(firstName, "Test");
        sendKeys(lastName, "Automation");
        sendKeys(citizenshipNumber, citizenshipNumberText);
        element(birthDate).click();
        sendKeys(birthDate, birthDateText);
        element(phone).click();
        sendKeys(phone, "321234567");
        sendKeys(email, "testAuto@test.com");
        sendKeys(password, passwordText);
        int listSize = list(checkboxSwitch).size();
        for (int i = 0; i < listSize; i++) {
            list(checkboxSwitch).get(0).click();
        }
        element(signUpButton).click();
    }
}
