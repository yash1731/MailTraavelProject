package com.mailtravel.steps;

import com.mailtravel.pages.BasePage;
import com.mailtravel.pages.TripToIndia;
import com.mailtravel.support.WorldHelper;
import com.mailtravel.utilities.TestData;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class SignUpForNewsletterSteps {

    private WorldHelper helper;
    private TripToIndia tripToIndia;
    private BasePage basePage;

    public SignUpForNewsletterSteps(WorldHelper helper){
        this.helper = helper;
    }

    @When("^I enter the details to sign up for newsletter$")
    public void iEnterTheDetailsToSignUpForNewsletter(DataTable dataTable) throws Throwable {
        List<List<String>> fieldOption = dataTable.raw();
        String title = TestData.getValue(fieldOption.get(1).get(1));
        String email = TestData.getValue(fieldOption.get(2).get(1));
        String fname = TestData.getValue(fieldOption.get(3).get(1));
        String lname = TestData.getValue(fieldOption.get(4).get(1));
        String postcode = TestData.getValue(fieldOption.get(5).get(1));
        String phoneNo = TestData.getValue(fieldOption.get(6).get(1));
        tripToIndia = helper.getTripToIndia().enterSignUpDetails(title,email,fname,lname,
                postcode,phoneNo);
    }

    @When("^I check terms and conditions$")
    public void iCheckTermsAndConditions() throws Throwable {
       tripToIndia.checkTerms();
    }

    @When("^I click on 'Sign-Up' button$")
    public void iClickOnSignUpButton() throws Throwable {
      tripToIndia.clickSignUpButton();
    }

    @Given("^I click on signup for newsletter link$")
    public void iClickOnSignupForNewsletterLink() throws Throwable {
        tripToIndia = helper.getTripToIndia().clickNewsLetterLink();
    }

    @Then("^I landed in confirmation page$")
    public void iLandedInConfirmationPage() throws Throwable {
      tripToIndia.verifySuccessMesg();
    }
}
