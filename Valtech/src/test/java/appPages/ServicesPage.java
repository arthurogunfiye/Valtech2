package appPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicesPage {

	public WebDriver driver;

    /**
     * @param driver WebDriver driver instance
     */
    public ServicesPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "h1")
    public WebElement pageName;

    @FindBy(css = ".valtech-logo--header")
    public WebElement logo;
}
