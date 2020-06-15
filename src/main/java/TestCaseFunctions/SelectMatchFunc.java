package TestCaseFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class SelectMatchFunc extends BasePage {
    public SelectMatchFunc(WebDriver driver) {
        super(driver);
    }

    public By iddaaButton = By.xpath("//*[contains(text(),'iddaa')]");
    public By bulten = By.cssSelector("#root > div.page.page--events > div.events-container > div > div > div > div:nth-child(1) > div > div > div > div > div.events-container__content.animated.fadeInUp.fastest");
    public By bets = By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div[1]");
    public By goCoupon = By.cssSelector("#root > button");
    public By confirmCoupon = By.xpath("//*[contains(text(),'OYNA')]");

    public void selectMatch() throws InterruptedException {
        element(iddaaButton).click();
        if (list(bulten).size() > 0) {
            for (int i = 0; i < list(bets).size(); i++) {
                if (i == 4) break;
                list(bets).get(i).click();
            }
            element(goCoupon).click();
            Thread.sleep(500);
            element(confirmCoupon).click();
        } else {
            System.out.println("Bulletin has no match!");
        }
        //assertEquals(,);
    }
}
