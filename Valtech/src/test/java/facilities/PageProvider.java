package facilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import appPages.*;

/**
 * @author Arthur Ogunfuye
 * <p>This PageFactory class initialises every page
 * and the elements exposed in each page.<p>
 */
public class PageProvider {

	private WebDriver driver;

	public PageProvider(WebDriver driver)
    {
        this.driver = driver;
    }

	/**
     * Initialise the Home page and its elements.
     * @param driver
     * @return Home Page
     */
    public HomePage homePage() {
        return PageFactory.initElements(driver, HomePage.class);
    }

    /**
     * Initialise the Login page and its elements.
     * @param driver
     * @return Login Page
     */
    public AboutPage aboutPage() {
        return PageFactory.initElements(driver, AboutPage.class);
    }

    /**
     * Initialise the Contact page and its elements.
     * @param driver
     * @return Contact Page
     */
    public ContactPage contactPage() {
        return PageFactory.initElements(driver, ContactPage.class);
    }

    /**
     * Initialise the Services page and its elements.
     * @param driver
     * @return Services Page
     */
    public ServicesPage servicesPage() {
        return PageFactory.initElements(driver, ServicesPage.class);
    }

    /**
     * Initialise the Work page and its elements.
     * @param driver
     * @return Work Page
     */
    public WorkPage workPage() {
        return PageFactory.initElements(driver, WorkPage.class);
    }
}
