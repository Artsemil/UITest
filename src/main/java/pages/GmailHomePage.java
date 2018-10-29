package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailHomePage extends BasePage{

    public GmailHomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
    private WebElement writeButton;

    public WebElement getWriteButton() {
        return writeButton;
    }
}
