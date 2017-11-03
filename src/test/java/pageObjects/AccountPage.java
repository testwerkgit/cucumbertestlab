package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://www.phptravels.net/account")
public class AccountPage extends PageObject {

    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver=driver;
    }

        public String getValueHeading() {
        return driver.findElement(By.cssSelector(".RTL")).getText();
    }
}