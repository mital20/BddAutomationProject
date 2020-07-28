package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

    @Given("^User is already on home page$")
    public void userIsAlreadyOnHomePage() {
        homePage.verifyUserIsOnHomepage();
    }

    @When("^User click on register button$")
    public void userClickOnRegisterButton() {
        homePage.verifyUserIsOnHomepage();
        homePage.clickOnRegisterButton();
    }

    @And("^user enters all required registration details$")
    public void userEntersAllRequiredRegistrationDetails()
    {
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.userEnterRegistrationDetails();
    }

    @And("^User clicks on register-submit button$")
    public void userClicksOnRegisterSubmitButton() {
        registerPage.userClickOnSubmitsButton();
    }

    @Then("^user should be register successfully$")
    public void userShouldBeRegisterSuccessfully() {
        registerSuccessPage.verifyUserIsOnRegisterResultPage();
        registerSuccessPage.userCanSeeSuccessfulMessage();
    }
}
