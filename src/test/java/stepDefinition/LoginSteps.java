package stepDefinition;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.LoginTests;
import java.net.MalformedURLException;

public class LoginSteps {

    @Before
    public void setup() {
        //Before each test scenario before hook method will execute
        LoginTests.basicSetup();
    }

    @After
    public void teardown() {
        // Quit your WebDriver instance here
        LoginTests.closeApp();
    }

    @Given("I am on the login screen")
    public void iAmOnTheLoginScreen() throws MalformedURLException {
        LoginTests.openApp();
    }

    @When("I enter valid credentials")
    public void iEnterValidCredentials() throws MalformedURLException {
        LoginTests.validLogin();
    }

    @When("I enter invalid credentials")
    public void iEnterInvalidCredentials() {
        // Enter invalid credentials
        LoginTests.invalidLogin();
    }

    @When("I leave the fields empty")
    public void iLeaveTheFieldsEmpty() {
        // Leave fields empty
        LoginTests.emptyField();
    }

    @Then("I should be logged in successfully")
    public void iShouldBeLoggedInSuccessfully() {
        // Verify successful login
        LoginTests.SuccessLogin();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        // Verify error message displayed
        LoginTests.errorMessage();
    }

    @Then("I should be prompted to fill in the fields")
    public void iShouldBePromptedToFillInTheFields() {
        // Verify prompt to fill fields
        LoginTests.errorMessageOfEmptyField();
    }
}

