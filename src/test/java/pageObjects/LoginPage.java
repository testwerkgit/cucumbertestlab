package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://www.phptravels.net/login")
public class LoginPage extends PageObject {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public void clickSubmitButton() {
        driver.findElement(By.cssSelector("button[type=submit]")).click();
    }

    public void typeInputUsername(String username) {
        driver.findElement(By.cssSelector("input[name=username]")).sendKeys(username);
    }

    public void typeInputPassword(String password) {
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);
    }

}