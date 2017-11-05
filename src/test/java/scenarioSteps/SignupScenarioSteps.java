package scenarioSteps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runners.Parameterized;
import pageSteps.SignupPageSteps;

import java.util.Collection;

public class SignupScenarioSteps {
    SignupPageSteps signupPageSteps = new SignupPageSteps();

    @Given("^I open the register page at '(.*)'$")
    public void openRegisterPage(String url) throws Exception{
        signupPageSteps.openPage(url);
    }

    @When("^I make a new account for user '(.*)'$")
    public void makeAccount(String email) throws Exception{
        signupPageSteps.createUser(email);
    }

    @Then("^the welcome message '(.*)' is displayed$")
    public void displayedWelcomeMessage(String message)throws Exception {
        signupPageSteps.checkLoggedIn(message);
    }


    @When("^I make the following account for (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void makeTheAccount(String firstname, String lastname, String phone, String email, String password, String passwordrepeat) throws Exception {
        signupPageSteps.abstractCreateUser(firstname, lastname, phone, email, password, passwordrepeat);
    }

    @Then("^the account page is displayed$")
    public void theAccountPageIsDisplayed() throws Exception {
        signupPageSteps.accountPageIsDisplayed();
    }

    @Then("^the error message '(.*)' is displayed$")
    public void theErrorMessageEmailAlreadyExistsIsDisplayed(String errormessage) throws Exception {
        signupPageSteps.checkErrorMessage(errormessage);
    }

    @And("^I logout$")
    public void iLogout() throws Exception {
        signupPageSteps.logout();
    }

    @After
    public void end() {
        signupPageSteps.tearDown();
    }
}


