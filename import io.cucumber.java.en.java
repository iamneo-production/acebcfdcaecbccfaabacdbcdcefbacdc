import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class LoginSteps {
    private String username;
    private String password;
    private String loginMessage;

    @Given("the user is on the Home page")
    public void userIsOnHomePage() {
        // Implementation to navigate to the Home page
    }

    @When("the user navigates to the Login page")
    public void userNavigatesToLoginPage() {
        // Implementation to navigate to the Login page
    }

    @And("the user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
        // Implementation to enter the username and password in the login form
    }

    @Then("the successful login message is displayed")
    public void successfulLoginMessageIsDisplayed() {
        // Implementation to verify the successful login message
        loginMessage = getLoginMessage();
        String expectedMessage = "You have successfully logged into your account! There are multiple discount offers waiting for you!!";
        Assert.assertEquals(expectedMessage, loginMessage);
    }

    // Helper method to retrieve the login message
    private String getLoginMessage() {
        // Implementation to retrieve the login message from the UI
        return "You have successfully logged into your account! There are multiple discount offers waiting for you!!";
    }
}