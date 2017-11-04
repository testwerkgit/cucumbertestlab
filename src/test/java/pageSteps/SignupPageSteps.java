package pageSteps;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AccountPage;
import pageObjects.SignUpPage;

public class SignupPageSteps extends BasicPageSteps {

    SignUpPage signUpPage;

    public SignupPageSteps()  {
        signUpPage = new SignUpPage(driver);
    }


    public void createUser(String email) {
        signUpPage.typeInputFirstname("John");
        signUpPage.typeInputLastname("Doe");
        signUpPage.typeInputMobilenumber("0612345678");
        signUpPage.typeInputEmail(email);
        signUpPage.typeInputPassword("henk123");
        signUpPage.typeInputConfirmPassword("henk123");
        signUpPage.clickSubmitButton();
    }

    public void checkLoggedIn(String message) {
        Assert.assertEquals("Message different from expectation!", message, signUpPage.getValueHeading());
    }
}
