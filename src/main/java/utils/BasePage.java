package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public String passwordText = "AhmeT.1862";
    public static String citizenshipNumberText = "79240554758";
    public String birthDateText = "01/01/1990";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public WebDriver driver;
    public WebDriverWait wait;

    public WebElement element(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public List<WebElement> list(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }

    public void sendKeys(By locator, String value) {
        element(locator).sendKeys(value);
    }

}
