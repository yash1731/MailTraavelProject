package com.mailtravel.pages;

import com.mailtravel.webController.ButtonControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver webDriver;

    @FindBy(css = "body > div.optanon-alert-box-wrapper > div.optanon-alert-box-bg > div.optanon-alert-box-button-container > div.optanon-alert-box-button.optanon-button-allow > div > button")
    private WebElement cookies = null;


    public BasePage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public TripToIndia acceptCookies() {
        ButtonControl.clickButton(cookies);
        return PageFactory.initElements(webDriver,TripToIndia.class);
    }
}
