package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("http://www.phptravels.net/login")
public class LoginPage extends PageObject {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        wait = new WebDriverWait (driver, 15);
        this.driver=driver;
    }

    public void clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type=submit]")));
        driver.findElement(By.cssSelector("button[type=submit]")).click();
    }

    public void typeInputUsername(String username) {
        driver.findElement(By.cssSelector("input[name=username]")).sendKeys(username);
    }

    public void typeInputPassword(String password) {
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);
    }

}