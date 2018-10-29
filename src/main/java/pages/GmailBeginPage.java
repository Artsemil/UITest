package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailBeginPage extends BasePage {

    public GmailBeginPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }

    @FindBy(xpath = "//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
    private WebElement enterButton;

    public GmailLoginPage clickEnterButton(){
        enterButton.click();
        return new GmailLoginPage(getDriver(), getWait());
    }
}
