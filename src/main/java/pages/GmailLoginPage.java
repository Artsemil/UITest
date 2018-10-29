package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage extends BasePage {

    public GmailLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='identifierNext']")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;

    private void enterEmail(String email){
        emailField.sendKeys(email);
        continueButton.click();
    }

    public void login(String email){
        enterEmail(email);
    }
}
