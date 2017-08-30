package com.valtech.tests;

import org.testng.annotations.Test;
import static facilities.LogReporter.logPrint;
import static facilities.Utilities.waitUntilElementIsDisplayed;
import facilities.TestCaseObject;

public class OutputNumberOfOfficesInContactPage extends TestCaseObject {

    @Test
    public void verifyNumberOfOfficesInContactPage() {

        goTo("/about/contact-us/");
        waitUntilElementIsDisplayed(page.contactPage().pageName);

        for (int i = 0; i < page.contactPage().officeLocations.size(); i++) {
            logPrint("Valtech has an office located in " + page.contactPage().officeLocations.get(i).getText());
        }

        logPrint("Valtech has " + page.contactPage().officeLocations.size() + " offices");
    }
}
