package com.mailtravel.pages;

import com.mailtravel.webController.ButtonControl;
import com.mailtravel.webController.DropDownControl;
import com.mailtravel.webController.TextFieldControl;
import com.mailtravel.webWaits.Waits;
import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TripToIndia extends BasePage{

    @FindBy(id = "searchtext_freetext_search_form")
    private WebElement searchField = null;
    @FindBy(id = "iterator_1_product_custom_more-info-button")
    private WebElement moreInfo = null;
    @FindBy(id = "price-pin_days-num-01")
    private WebElement totaldays = null;
    @FindBy(css= "#price-pin_cc_newmarket > span.heading-md.bold.pin-price-normal > span")
    private WebElement totalPrice = null;
    @FindBy(id = "supplier-phone")
    private WebElement num = null;
    @FindBy(css = "#freetext_search_form > form > button > div")
    private WebElement searchButton = null;
    @FindBy(css = "#itinerary_title_tab > a")
    private WebElement itinearyTab = null;
    @FindBy(css = "#book-2276432a15eaf65ebfc0ffb211e6bf09 > button > div.nbf_button.nbf_tpl_pms_book_button > div")
    private WebElement onlineBooking = null;
    @FindBy(css = "#nbf_tpl_pms_calendar-2276432a15eaf65ebfc0ffb211e6bf09 > div.nbf_tpl_pms_calendar > div > div:nth-child(5) > label > div > div.nbf_tpl_pms_calendar_price > span")
    private WebElement availableDate = null;
    @FindBy(css = "#paxDepDateForm > div.nbf_tpl_pms_buttonarea.nbf_grid.nbf_grid--padtopbottom > button")
    private WebElement continueButton = null;
    @FindBy(css = "#transportForm-container > div.nbf_tpl_pms_bf_panel.nbf_tpl_pms_bf_panel_complete.nbf_tpl_pms_bf_panel--collapsed > div.nbf_tpl_pms_bf_panel__title > h2")
    private WebElement transportCollapse = null;
    @FindBy(id = "room-0-numselect")
    private WebElement roomOption = null;
    @FindBy(css = "#accomForm-select > button")
    private WebElement contAcc = null;
    @FindBy(css = "#extraForm-select-b99be44d-8aeb-11eb-8933-20677cd381a0 > button")
    private WebElement withoutExtra = null;
    @FindBy(css = "#paxForm > div > div.nbf_tpl_pms_bf_panel__title > h2")
    private WebElement passHeader = null;
    @FindBy(id = "pax-a-title-1")
    private WebElement title1 = null;
    @FindBy(id = "pax-a-first-1")
    private WebElement firstName = null;
    @FindBy(id = "pax-a-last-1")
    private WebElement lastName = null;
    @FindBy(id = "pax-a-dobd-1")
    private WebElement daydob1 = null;
    @FindBy(id = "pax-a-dobm-1")
    private WebElement mondob1 = null;
    @FindBy(id ="pax-a-doby-1")
    private WebElement yrsdob1 = null;
    @FindBy(id = "pax-a-title-2")
    private WebElement title2 = null;
    @FindBy(id = "pax-a-first-2")
    private WebElement firstName2 = null;
    @FindBy(id = "pax-a-last-2")
    private WebElement lastName2 = null;
    @FindBy(id = "pax-a-dobd-2")
    private WebElement daydob2 = null;
    @FindBy(id = "pax-a-dobm-2")
    private WebElement mondob2 = null;
    @FindBy(id ="pax-a-doby-2")
    private WebElement yrsdob2 = null;
    @FindBy(id = "contact-name")
    private WebElement leadName = null;
    @FindBy(id = "contact-mobile")
    private WebElement phoneNumber = null;
    @FindBy(id = "contact-email")
    private WebElement email = null;
    @FindBy(id = "contact-address1")
    private WebElement add1 = null;
    @FindBy(id = "contact-address2")
    private WebElement add2 = null;
    @FindBy(id = "contact-city")
    private WebElement city = null;
    @FindBy(id = "contact-postcode")
    private WebElement postCode = null;
    @FindBy(id = "contact-hearabout")
    private WebElement hearUs = null;
    @FindBy(xpath = "//*[@id='paxform-select']/button")
    private WebElement contPassButton = null;
    @FindBy(css = "#drop > select")
    private WebElement newstitle = null;
    @FindBy(css = "body > div > div.text-vertical-center.pullDown > div > div > div > form > main > section:nth-child(2) > div:nth-child(1) > input")
    private WebElement newsEmail = null;
    @FindBy(css = "body > div > div.text-vertical-center.pullDown > div > div > div > form > main > section:nth-child(1) > div:nth-child(2) > input")
    private WebElement newsFirstName = null;
    @FindBy(css = "body > div > div.text-vertical-center.pullDown > div > div > div > form > main > section:nth-child(1) > div:nth-child(3) > input")
    private WebElement newsLastName = null;
    @FindBy(css = "body > div > div.text-vertical-center.pullDown > div > div > div > form > main > section:nth-child(2) > div:nth-child(2) > input")
    private WebElement newsPostCode = null;
    @FindBy(css = "body > div > div.text-vertical-center.pullDown > div > div > div > form > main > section:nth-child(2) > div:nth-child(3) > input")
    private WebElement newsPhone = null;
    @FindBy(id = "agree")
    private WebElement terms = null;
    @FindBy(id = "sign-up")
    private WebElement signUp = null;
    @FindBy(id = "reassurance-bar-iter_4_top-bar-text")
    private WebElement news = null;
    @FindBy(css = "body > div > div > div > div > div > h2")
    private WebElement successMsg = null;

    public TripToIndia(WebDriver webDriver) {
        super(webDriver);
    }

    public TripToIndia enterSearchDetails(String data) {
        TextFieldControl.enterText(searchField, data);
        ButtonControl.clickButton(searchButton);
        return this;
    }

    public boolean verifyCurrentUrl(String url) {
        String currentURL = webDriver.getCurrentUrl();
        if(currentURL.contains(url)){
            return true;
        }
        return false;
    }

    public TripToIndia clickMoreInfoButton() {
        ButtonControl.clickButton(moreInfo);
        return this;
    }

    public boolean verifyDaysandPrice(String days, String price) {
        Waits.waitForNoOfSeconds(2);
        if((totaldays.getText().contains(days))&&
                (totalPrice.getText().contains(price))){
            Waits.waitForNoOfSeconds(2);
            return true;
        }
        return false;
    }

    public boolean verifyPhoneNum(String phone) {
        Waits.waitForNoOfSeconds(2);
        if(num.getText().contains(phone)){
            return true;
        }
        return false;
    }

    public TripToIndia clickitinearyTab() {
        ButtonControl.clickButton(itinearyTab);
        return this;
    }

    public TripToIndia clickBookOnline() {
        ButtonControl.clickButton(onlineBooking);
        return this;
    }

    public boolean verifyAvailableDate() {
        try {
            if (availableDate.getText().contains("£1,197")) {
                return true;
            }
        }catch(org.openqa.selenium.StaleElementReferenceException ex){

        }
        return false;
    }

    public TripToIndia verifyDepartureDate() {
        ButtonControl.clickButton(continueButton);
        Waits.waitForNoOfSeconds(2);
        return this;
    }

    public TripToIndia viewTransportDetails() {
        ButtonControl.clickButton(transportCollapse);
        Waits.waitForNoOfSeconds(1);
        ButtonControl.clickButton(transportCollapse);
        return this;
    }

    public TripToIndia enterAccomodationDetails() {
        DropDownControl.selectDropDownByVisibleText(roomOption , "1");
        return this;
    }

    public TripToIndia continueAccomobation() {
        ButtonControl.clickButton(contAcc);
        return this;
    }

    public TripToIndia contWithOutExtras() {
        ButtonControl.clickButton(withoutExtra);
        Waits.waitForNoOfSeconds(1);
        return this;
    }


    public TripToIndia enterPassengersDetails(String title, String fname1, String lastname,
                                              String dobday1, String dobmon1, String dobyrs1) {
        DropDownControl.selectDropDownByVisibleText(title1,title);
        TextFieldControl.enterText(firstName,fname1);
        TextFieldControl.enterText(lastName,lastname);
        DropDownControl.selectDropDownByVisibleText(daydob1,dobday1);
        DropDownControl.selectDropDownByVisibleText(mondob1,dobmon1);
        DropDownControl.selectDropDownByVisibleText(yrsdob1,dobyrs1);
        return this;
    }

    public TripToIndia enterSecondPassengersDetails(String title, String fname2, String lastname,
                                                    String dobday2, String dobmon2, String dobyrs2) {
        DropDownControl.selectDropDownByVisibleText(title2,title);
        TextFieldControl.enterText(firstName2,fname2);
        TextFieldControl.enterText(lastName2,lastname);
        DropDownControl.selectDropDownByVisibleText(daydob2,dobday2);
        DropDownControl.selectDropDownByVisibleText(mondob2,dobmon2);
        DropDownControl.selectDropDownByVisibleText(yrsdob2,dobyrs2);
        return this;
    }

    public TripToIndia enterLeadPassengersDetails(String name, String phoneNum,
                                                  String emailAddress, String address1, String address2,
                                                  String cityDetails, String postCodeDetails, String hearDetails) {
        TextFieldControl.enterText(leadName,name);
        TextFieldControl.enterText(phoneNumber,phoneNum);
        TextFieldControl.enterText(email,emailAddress);
        TextFieldControl.enterText(add1,address1);
        TextFieldControl.enterText(add2,address2);
        TextFieldControl.enterText(city,cityDetails);
        TextFieldControl.enterText(postCode,postCodeDetails);
        DropDownControl.selectDropDownByVisibleText(hearUs,hearDetails);
        return this;
    }

    public TripToIndia continuePassDetails() {
        ButtonControl.clickButton(contPassButton);
        return this;
    }

    public TripToIndia enterSignUpDetails(String title, String email, String fname, String lname,
                                          String postcode, String phoneNo) {
        Waits.waitForNoOfSeconds(1);
        TextFieldControl.enterText(newsFirstName,fname);
        DropDownControl.selectDropDownByVisibleText(newstitle,title);
        TextFieldControl.enterText(newsEmail,email);
        TextFieldControl.enterText(newsLastName,lname);
        TextFieldControl.enterText(newsPostCode,postcode);
        TextFieldControl.enterText(newsPhone,phoneNo);
        return this;
    }

    public TripToIndia checkTerms() {
        ButtonControl.clickButton(terms);
        return this;
    }

    public TripToIndia clickSignUpButton() {
        ButtonControl.clickButton(signUp);
        return this;
    }

    public TripToIndia clickNewsLetterLink() {
        ButtonControl.clickButton(news);
        return this;
    }

    public boolean verifySuccessMesg() {
        Waits.waitForNoOfSeconds(1);
        if(successMsg.getText().contains("Thanks for signing up!")){
            return true;
        }
        return false;
    }
}
