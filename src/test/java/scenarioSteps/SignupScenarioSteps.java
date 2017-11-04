package scenarioSteps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageSteps.SignupPageSteps;

public class SignupScenarioSteps {
    SignupPageSteps signupPageSteps = new SignupPageSteps();

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


