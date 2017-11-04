package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//@DefaultUrl("http://www.phptravels.net/register")
public class SignUpPage extends PageObject {
    WebDriver driver;
    WebDriverWait wait;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait (driver, 3);
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

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type=submit]")));
        driver.findElement(By.cssSelector("button[type=submit]")).click();

    }

    public String getValueHeading() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".RTL")));
        return driver.findElement(By.cssSelector(".RTL")).getText();
    }

}
