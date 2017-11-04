package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("http://www.phptravels.net/account")
public class AccountPage extends PageObject {

    WebDriver driver;
    WebDriverWait wait;

    public AccountPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait (driver, 15);
    }

    public String getValueHeading() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".RTL")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.cssSelector(".RTL")).getText();
    }
}