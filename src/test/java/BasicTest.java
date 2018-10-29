import java.util.List;

import config.DriverFactory;
import config.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTest {

    private static final int LINKS_AMOUNT = 5;
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverFactory.getDriver(DriverType.CHROME);
    }

    @Test
    public void test() {
        driver.get("https://www.google.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link: links){
            System.out.println(link.getAttribute("href"));
        }
        assert links.size() > LINKS_AMOUNT;
    }

    @AfterTest
    public void teardown() {
        driver.close();
    }
}
