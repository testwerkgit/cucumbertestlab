package pageSteps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AccountPage;
import pageObjects.LoginPage;

public class LoginPageSteps extends BasicPageSteps{

    LoginPage loginPage;
    AccountPage accountPage;

    public LoginPageSteps(){
            loginPage = new LoginPage(driver);
            accountPage = new AccountPage(driver);
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


}
