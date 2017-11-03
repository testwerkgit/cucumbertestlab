package pageSteps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AccountPage;
import pageObjects.LoginPage;


/**
 * Created by testwerk on 19-10-17.
 */
public class LoginPageSteps {

    LoginPage loginPage;
    AccountPage accountPage;
    WebDriver driver;

    public LoginPageSteps(){

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
            loginPage = new LoginPage(driver);
            accountPage = new AccountPage(driver);

    }

    public void openPage(String url){
        //Open de website
        driver.get(url);
    }

    public void inloggen(String username){
        loginPage.typeInputUsername(username);
        loginPage.typeInputPassword("henk123");
        loginPage.clickSubmitButton();
    }

    public void checkLoggedIn(String melding) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Controleer of het welkomsbericht wordt weergegeven
        Assert.assertSame("Gaat niet goed",melding.toString(), accountPage.getValueHeading().toString());
    }

    public void tearDown () {
        //Close the instance
        driver.quit();
    }

}
