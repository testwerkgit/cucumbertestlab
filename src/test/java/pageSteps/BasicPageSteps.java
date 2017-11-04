package pageSteps;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasicPageSteps {

    @Managed
    WebDriver driver;

    public BasicPageSteps(){

        switch (System.getProperty("os.name")) {
            case "Linux":
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/vendor/geckodriver");
                break;
            case "Windows":
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/vendor/geckodriver.exe");
                break;
            default:
                System.setProperty("webdriver.gecko.driver",
                        System.getProperty("user.dir") + "/vendor/geckodriver.exe");
                break;
        }

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);

        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("log", "{level: info}");
        capabilities.setCapability("moz:firefoxOptions", options);

        driver = new FirefoxDriver(capabilities);
     }

    public void openPage(String url){
        //Open de website
        driver.get(url);
    }


    public void tearDown () {
        //Close the instance
        driver.quit();
    }

}
