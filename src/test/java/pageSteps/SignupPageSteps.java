package pageSteps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AccountPage;
import pageObjects.SignUpPage;


/**
 * Created by testwerk on 19-10-17.
 */
public class SignupPageSteps {

    SignUpPage signUpPage;
    AccountPage accountPage;
    WebDriver driver;

    public SignupPageSteps(){

        switch (System.getProperty("os.name")) {
            case "Linux":
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/vendor/geckodriver");
                break;
            case "Windows":
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/vendor/chromedriver.exe");
                break;
            default:
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/vendor/chromedriver.exe");
                break;
        }
            driver = new ChromeDriver();
            signUpPage = new SignUpPage(driver);
            accountPage = new AccountPage(driver);
    }

    public void openPage(String url){
        //Open de website
        driver.get(url);
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

    public void checkSignUp(String melding){
        Assert.assertSame("Gaat niet goed",melding.toString(), accountPage.getValueHeading().toString());
    }

    public void tearDown () {
        //Close the instance
        driver.quit();
    }

    public void checkLoggedIn(String message) {
    }
}
