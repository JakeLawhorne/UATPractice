package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {
    @Given("I navigate to the login page of facebook")
    public void iNavigateToTheLoginPageOfFacebook() {
        System.out.println("I should see user login page");
        throw new io.cucumber.java.PendingException();
    }

    @And("I enter the email as {string} and password as {string}")
    public void iEnterTheEmailAsAndPasswordAs(String arg0, String arg1) {
        System.out.println("Username is: " + arg0 + " and password is: " + arg1);
        throw new io.cucumber.java.PendingException();

    }
    @And("I click the login button")
    public void iClickTheLoginButton() {
        System.out.println("Click login button");
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see the user home page")
    public void iShouldSeeTheUserHomePage() {
        System.out.println("I can see the user home page");
        throw new io.cucumber.java.PendingException();
    }
}
