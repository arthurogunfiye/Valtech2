package appPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage {

	public WebDriver driver;

    /**
     * @param driver WebDriver driver instance
     */
    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "h1")
    public WebElement pageName;

    @FindBy(css = ".office__heading>a")
    public List<WebElement> officeLocations;
}
