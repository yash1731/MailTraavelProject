package com.mailtravel.webController;

import com.mailtravel.utilities.EnvConfig;
import com.mailtravel.webWaits.Waits;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class BaseController {
    protected static int time = Integer.parseInt(EnvConfig.getValue("default.timer"));
    private static Logger logger = LogManager.getLogger("TestLogger");


    protected static boolean isElementDisplayed(WebElement element) {
        for (int i = 0; i < time; i++) {
            if (element.isDisplayed()) {
                logger.info("Element is displayed");
                return true;
            } else {
                Waits.waitForNoOfSeconds(1);
            }
        }
        return false;
    }

    protected static boolean isElementSelected(WebElement element) {
        for (int i = 0; i < time; i++) {
            if (element.isSelected()) {
                boolean status = element.isSelected();
                logger.info("The element selected status is " + status);
                return true;
            } else {
                Waits.waitForNoOfSeconds(1);
            }
        }
        return false;
    }

    protected static boolean isElementEnabled(WebElement element) {
        for (int i = 0; i < time; i++) {
            if (element.isEnabled()) {
                logger.info("The element enabled status is " + element.isEnabled());
                return true;
            } else {
                Waits.waitForNoOfSeconds(1);
            }
        }
        return false;
    }

    public static Boolean isElementNotDisplayedAndPresent(WebElement element) {
        try {
            element.isDisplayed();
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }
}
