package login;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.GmailHomePage;

public class GmailSendMessageTest extends BaseTest {

    @Test
    public void correctLogin() {

        GmailHomePage gmailHomePage = new GmailHomePage(driver, wait);


    }

    @AfterTest
    public void teardown() {

    }
}
