package pageSteps;

import org.junit.Assert;
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

    public void checkErrorMessage (String errormessage) {
        Assert.assertEquals("No matching error displayed!", errormessage, signUpPage.getErrorMessage());
    }

    public void abstractCreateUser(String firstname, String lastname, String phone, String email, String password, String passwordrepeat) {
        signUpPage.typeInputFirstname(firstname);
        signUpPage.typeInputLastname(lastname);
        signUpPage.typeInputMobilenumber(phone);
        signUpPage.typeInputEmail(email);
        signUpPage.typeInputPassword(password);
        signUpPage.typeInputConfirmPassword(passwordrepeat);
        signUpPage.clickSubmitButton();
    }

    public void accountPageIsDisplayed(){
        Assert.assertEquals("Account page is not displayed.", "http://www.phptravels.net/account/", signUpPage.getSiteAddress());
    }

    public void logout() {
        driver.get("http://www.phptravels.net/account/logout/");
    }

}
