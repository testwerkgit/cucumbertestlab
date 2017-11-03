package scenarioSteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageSteps.LoginPageSteps;
import pageSteps.SignupPageSteps;
import cucumber.api.Scenario;

public class SignupScenarioSteps {
    WebDriver driver;
    LoginPageSteps loginPageSteps = new LoginPageSteps();
    SignupPageSteps signupPageSteps = new SignupPageSteps();

    @Before
    public void beforeStappen(Scenario scenario) {
        System.out.println("Starting test: "+scenario.getName()+"\n");
    }

    @Given("^I open the register page at '(.*)'$")
    public void openRegisterPage(String url) throws Exception{
        signupPageSteps.openPage(url);
    }

    @Then("^the welcome message '(.*)' is displayed$")
    public void displayedWelcomeMessage(String message)throws Exception {
        signupPageSteps.checkLoggedIn(message);
    }

    @When("^I make a new account for user '(.*)'$")
    public void makeAccount(String email) throws Exception{
        signupPageSteps.createUser(email);
    }

    @After
    public void tearDown() {
        signupPageSteps.tearDown();
    }

}


