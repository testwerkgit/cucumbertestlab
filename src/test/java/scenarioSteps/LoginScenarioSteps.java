package scenarioSteps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageSteps.LoginPageSteps;

public class LoginScenarioSteps {
    LoginPageSteps loginPageSteps = new LoginPageSteps();

    @Given("^I open the login page at '(.*)'$")
    public void loginAtPage(String url) throws Exception{
        loginPageSteps.openPage(url);
    }

    @When("^I login with the credentials for user '(.*)'$")
    public void loginWithUser(String user)throws Exception {
        loginPageSteps.inloggen(user);
    }

    @Then("^the message '(.*)' is displayed$")
    public void displayedMessage(String message) throws Exception{
        loginPageSteps.checkLoggedIn(message);
    }

    @After
    public void tearDown() {
        loginPageSteps.tearDown();
    }

}


