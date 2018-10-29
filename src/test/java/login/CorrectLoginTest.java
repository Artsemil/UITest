package login;

import constants.Users;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.GmailBeginPage;
import pages.GmailHomePage;
import pages.GmailLoginPage;
import url.PageUrl;
import validators.HomePageValidator;

public class CorrectLoginTest extends BaseTest {

    @Test
    public void correctLogin() {

        GmailBeginPage gmailBeginPage = new GmailBeginPage(driver, wait);

        gmailBeginPage.goToPage(PageUrl.GMAIL_HOME_PAGE);

        GmailLoginPage gmailLoginPage = gmailBeginPage.clickEnterButton();

        GmailHomePage gmailHomePage = gmailLoginPage.login(Users.FIRST_USER.getEmail(), Users.FIRST_USER.getPassword());

        HomePageValidator.commonHomePageValidator(gmailHomePage);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
