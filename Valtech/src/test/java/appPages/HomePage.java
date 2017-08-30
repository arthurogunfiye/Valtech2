package appPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    
    @FindBy(css = ".news-post__listing-header>.block-header>.block-header__heading")
    public WebElement latestNewsSectonHeading;
    
    @FindBy(css = ".bloglisting__item__heading>a")
    public List<WebElement> newsArticleHeadings;

    /*About = 0
    Work = 1
    Services = 2*/
    @FindBy(css = ".header__navigation__menu>li>a")
    public List<WebElement> headerNavMenus;

    @FindBy(css = ".active")
    public WebElement contactUsLink;

    @FindBy(css = ".valtech-logo--header")
    public WebElement logo;

    /**
     * Navigate to Home Page.
     * @return HomePage
     */
    public HomePage go() {
        driver.get(TestInit.webUrl);
        return this;
    }
}
