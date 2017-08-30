package com.valtech.tests;

import org.testng.annotations.Test;
import static facilities.LogReporter.logFailure;
import static facilities.LogReporter.logPrint;
import static facilities.Utilities.waitUntilElementIsDisplayed;
import static org.testng.Assert.assertTrue;

import facilities.TestCaseObject;

public class AssertRelevantPageNameIsDisplayed extends TestCaseObject {

    @Test
    public void verifyAboutPageHeadingIsDisplayed() {

        page.homePage().go();
        waitUntilElementIsDisplayed(page.homePage().logo);

        //Click on About menu to navigate to About page
        page.homePage().headerNavMenus.get(0).click();
        waitUntilElementIsDisplayed(page.homePage().logo);

        try {
        	assertTrue(page.aboutPage().pageName.isDisplayed());
        	logPrint("Page header is displayed: " + page.aboutPage().pageName.getText());
        } catch (Exception e) {
        	logFailure("Page header is not displayed");
        }

        //Return to the home page
        page.aboutPage().logo.click();
        waitUntilElementIsDisplayed(page.homePage().logo);
    }

    @Test
    public void verifyWorkPageHeadingIsDisplayed() {

        page.homePage().go();
        waitUntilElementIsDisplayed(page.homePage().logo);

        //Click on About menu to navigate to About page
        page.homePage().headerNavMenus.get(1).click();
        waitUntilElementIsDisplayed(page.homePage().logo);

        try {
        	assertTrue(page.workPage().pageName.isDisplayed());
        	logPrint("Page header is displayed: " + page.workPage().pageName.getText());
        } catch (Exception e) {
        	logFailure("Page header is not displayed");
        }

        //Return to the home page
        page.workPage().logo.click();
        waitUntilElementIsDisplayed(page.homePage().logo);
    }

    @Test
    public void verifyServicesPageHeadingIsDisplayed() {

        page.homePage().go();
        waitUntilElementIsDisplayed(page.homePage().logo);

        //Click on About menu to navigate to About page
        page.homePage().headerNavMenus.get(2).click();
        waitUntilElementIsDisplayed(page.homePage().logo);

        try {
        	assertTrue(page.servicesPage().pageName.isDisplayed());
        	logPrint("Page header is displayed: " + page.servicesPage().pageName.getText());
        } catch (Exception e) {
        	logFailure("Page header is not displayed");
        }

        //Return to the home page
        page.servicesPage().logo.click();
        waitUntilElementIsDisplayed(page.homePage().logo);
    }
}
