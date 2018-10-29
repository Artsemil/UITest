package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginPage extends BasePage {

    public GmailLoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath = "//div[@id='identifierNext']")
    private WebElement continueEmailButton;

    @FindBy(xpath = "//div[@id='passwordNext']")
    private WebElement continuePasswordButton;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    private void enterEmail(String email){
        emailField.sendKeys(email);
        continueEmailButton.click();
    }
    private void enterPassword(String password){
        waitVisibilityOfElement(passwordField);
        passwordField.sendKeys(password);
        continuePasswordButton.click();
    }

    public GmailHomePage login(String email, String password){
        enterEmail(email);
        enterPassword(password);
        return new GmailHomePage(getDriver(), getWait());
    }
}
