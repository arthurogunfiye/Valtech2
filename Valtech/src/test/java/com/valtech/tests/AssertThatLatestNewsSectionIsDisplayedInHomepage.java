package com.valtech.tests;

import static facilities.LogReporter.logFailure;
import static facilities.LogReporter.logPrint;
import static facilities.Utilities.waitUntilElementIsDisplayed;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import facilities.TestCaseObject;

public class AssertThatLatestNewsSectionIsDisplayedInHomepage extends TestCaseObject {

    @Test
    public void assertThatLatestNewsIsDisplayed () {

        page.homePage().go();

        waitUntilElementIsDisplayed(page.homePage().logo);

        try {
            assertTrue(page.homePage().latestNewsSectonHeading.isDisplayed());
            for(int i = 0; i < page.homePage().newsArticleHeadings.size(); i++) {
            	logPrint("News article heading: " + page.homePage().newsArticleHeadings.get(i).getText() + " is displayed");
            	logPrint("");
            }
            logPrint("Latest news section is displayed in the home page");
        } catch (Exception e) {
            logFailure("Latest News section is not displayed");
        }
    }
}
