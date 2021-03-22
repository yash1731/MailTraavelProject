package com.mailtravel.steps;

import com.mailtravel.pages.BasePage;
import com.mailtravel.pages.TripToIndia;
import com.mailtravel.support.WorldHelper;
import com.mailtravel.utilities.TestData;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class TripToIndiaSteps {

    private WorldHelper helper;
    private TripToIndia tripToIndia;
    private BasePage basePage;

    public TripToIndiaSteps(WorldHelper helper){
        this.helper = helper;
    }

    @Given("^I am on the 'MailTravel' home page$")
    public void iAmOnTheMailTravelHomePage() throws Throwable {
       basePage = helper.getBasePage();
    }

    @Given("^I accept all cookies$")
    public void iAcceptAllCookies() throws Throwable {
       tripToIndia =  basePage.acceptCookies();
    }

    @When("^I enter 'India' in the search box$")
    public void iEnterIndiaInTheSearchBox() throws Throwable {
        String data = TestData.getValue("search data");
         tripToIndia = tripToIndia.enterSearchDetails(data);
    }

    @Then("^I landed in the page which listed tourism in India$")
    public void iLandedInThePageWhichListedTourismInIndia() throws Throwable {
        String url = TestData.getValue("current url");
        Assert.assertTrue(tripToIndia.verifyCurrentUrl(url));
    }


    @When("^I click on 'More Info' button$")
    public void iClickOnMoreInfoButton() throws Throwable {
      tripToIndia.clickMoreInfoButton();
    }

    @Then("^Verify the date and the price for travelling$")
    public void verifyTheDateAndThePriceForTravelling() throws Throwable {
       String days = TestData.getValue("total days");
       String price = TestData.getValue("total price");
       Assert.assertFalse(tripToIndia.verifyDaysandPrice(days,price));
    }

    @Then("^Verify the telephone number provided in the details$")
    public void verifyTheTelephoneNumberProvidedInTheDetails() throws Throwable {
      String phone = TestData.getValue("tele phone");
      Assert.assertFalse(tripToIndia.verifyPhoneNum(phone));
    }

    @When("^I click on the itineary tab$")
    public void iClickOnTheItinearyTab() throws Throwable {
       tripToIndia.clickitinearyTab();
    }

    @When("^I click on 'Book Online' button$")
    public void iClickOnBookOnlineButton() throws Throwable {
     tripToIndia.clickBookOnline();
    }

    @Then("^Verify the first date of availability$")
    public void verifyTheFirstDateOfAvailability() throws Throwable {
     tripToIndia.verifyAvailableDate();
    }

    @Then("^Verify date available should be departure date$")
    public void verifyDateAvailableShouldBeDepartureDate() throws Throwable {
     tripToIndia.verifyDepartureDate();
    }

    @Then("^Click on 'Select\\. button and view transport info$")
    public void clickOnSelectButtonAndViewTransportInfo() throws Throwable {
      tripToIndia.viewTransportDetails();
    }

    @When("^I enter the details for standard room in accomodation$")
    public void iEnterTheDetailsForStandardRoomInAccomodation() throws Throwable {
      tripToIndia.enterAccomodationDetails();
    }

    @When("^I click on 'Select Accomodatio' button$")
    public void iClickOnSelectAccomodatioButton() throws Throwable {
     tripToIndia.continueAccomobation();
    }

    @When("^I continue without 'Extras'$")
    public void iContinueWithoutExtras() throws Throwable {
      tripToIndia.contWithOutExtras();
    }

    @When("^I enter the passengers info$")
    public void iEnterThePassengersInfo(DataTable dataTable) throws Throwable {
        List<List<String>> fieldOption = dataTable.raw();
        String title = TestData.getValue(fieldOption.get(1).get(1));
        String fname1 = TestData.getValue(fieldOption.get(2).get(1));
        String lastname = TestData.getValue(fieldOption.get(3).get(1));
        String dobday1 = TestData.getValue(fieldOption.get(4).get(1));
        String dobmon1 = TestData.getValue(fieldOption.get(5).get(1));
        String dobyrs1 = TestData.getValue(fieldOption.get(6).get(1));
        tripToIndia.enterPassengersDetails(title,fname1,lastname,dobday1,dobmon1,dobyrs1);

    }

    @When("^I enter the passengers info for second adult$")
    public void iEnterThePassengersInfoForSecondAdult(DataTable dataTable) throws Throwable {
        List<List<String>> fieldOption = dataTable.raw();
        String title = TestData.getValue(fieldOption.get(1).get(1));
        String fname2 = TestData.getValue(fieldOption.get(2).get(1));
        String lastname = TestData.getValue(fieldOption.get(3).get(1));
        String dobday2 = TestData.getValue(fieldOption.get(4).get(1));
        String dobmon2 = TestData.getValue(fieldOption.get(5).get(1));
        String dobyrs2 = TestData.getValue(fieldOption.get(6).get(1));
        tripToIndia.enterSecondPassengersDetails(title,fname2,lastname,dobday2,dobmon2,dobyrs2);
    }

    @When("^I enetr the Lead Contact Details$")
    public void iEnetrTheLeadContactDetails(DataTable dataTable) throws Throwable {
        List<List<String>> fieldOption = dataTable.raw();
        String name = TestData.getValue(fieldOption.get(1).get(1));
        String phoneNum = TestData.getValue(fieldOption.get(2).get(1));
        String emailAddress = TestData.getValue(fieldOption.get(3).get(1));
        String address1 = TestData.getValue(fieldOption.get(4).get(1));
        String address2 = TestData.getValue(fieldOption.get(5).get(1));
        String cityDetails = TestData.getValue(fieldOption.get(6).get(1));
        String postCodeDetails = TestData.getValue(fieldOption.get(7).get(1));
        String hearDetails = TestData.getValue(fieldOption.get(8).get(1));
        tripToIndia.enterLeadPassengersDetails(name,phoneNum,emailAddress,address1,address2,cityDetails,
                postCodeDetails,hearDetails);
    }

    @When("^I click on 'Continue' button$")
    public void iClickOnContinueButton() throws Throwable {
      tripToIndia.continuePassDetails();
    }

}
