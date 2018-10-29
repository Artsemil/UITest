package login;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.GmailHomePage;
import pages.GmailLoginPage;
import url.PageUrl;

public class LoginTest extends BaseTest{

    private static final String CORRECT_EMAIL_ADRESS = "smauker@gmail.com";

    @Test
    public void correctLogin(){

        GmailHomePage gmailHomePage = new GmailHomePage(driver);

        gmailHomePage.goToPage(PageUrl.GMAIL_HOME_PAGE);

        GmailLoginPage gmailLoginPage = gmailHomePage.clickEnterButton();

        gmailLoginPage.login(CORRECT_EMAIL_ADRESS);
    }

    @AfterTest
    public void teardown() {

    }
}
