package appPages;

import org.openqa.selenium.WebDriver;

import facilities.TestInit;

/**
 * @author Arthur Ogunfuye
 */
public class HomePage {

	public WebDriver driver;

    /**
     * @param driver WebDriver driver instance
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Navigate to Home Page.
     * @return HomePage
     */
    public HomePage go() {
        driver.get(TestInit.webUrl);
        return this;
    }
}
