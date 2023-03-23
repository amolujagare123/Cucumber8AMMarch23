package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSD {
    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {

    }
    @When("^I Enter (.+) , (.+) , (.+)$")
    public void i_enter_pradeep_pradeep_gmail_com(String name,String email,String phone) {

        System.out.println("name="+name);
        System.out.println("email="+email);
        System.out.println("phone="+phone);
    }
    @When("I click on register")
    public void i_click_on_register() {

    }
    @Then("user should be submitted")
    public void user_should_be_submitted() {

    }
}
