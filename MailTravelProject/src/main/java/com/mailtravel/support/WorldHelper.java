package com.mailtravel.support;

import com.mailtravel.browser.WebBrowserFactory;
import com.mailtravel.pages.BasePage;
import com.mailtravel.pages.TripToIndia;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WorldHelper {

    private WebDriver driver = WebBrowserFactory.getThreadedDriver();
    private static BasePage basePage = null;
    private static TripToIndia tripToIndia = null;


    public BasePage getBasePage(){
        if(basePage != null) return basePage;
        return PageFactory.initElements(driver, BasePage.class);
    }

    public TripToIndia getTripToIndia(){
        if(tripToIndia != null) return tripToIndia;
        return PageFactory.initElements(driver, TripToIndia.class);
    }
}
