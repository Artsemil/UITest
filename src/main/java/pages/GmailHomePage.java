package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailHomePage extends BasePage {

    public GmailHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
    private WebElement enterButton;

    public GmailLoginPage clickEnterButton(){
        enterButton.click();
        return new GmailLoginPage(getDriver());
    }
}
