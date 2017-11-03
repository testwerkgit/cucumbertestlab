package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by testwerk on 19-10-17.
 */
@DefaultUrl("http://www.phptravels.net/register")
public class SignUpPage extends PageObject {
    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeInputFirstname(String firstname) {
        driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys(firstname);
    }

    public void typeInputLastname(String lastname) {
        driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys(lastname);
    }

    public void typeInputMobilenumber(String mobilenumber) {
        driver.findElement(By.cssSelector("input[name=phone]")).sendKeys(mobilenumber);
    }

    public void typeInputEmail(String email) {
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys(email);
    }

    public void typeInputPassword(String password) {
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);
    }

    public void typeInputConfirmPassword(String password) {
        driver.findElement(By.cssSelector("input[name=confirmpassword]")).sendKeys(password);
    }

    public void clickSubmitButton() {
        driver.findElement(By.cssSelector("button[type=submit]")).click();
    }

}
