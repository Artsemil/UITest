package validators;

import pages.GmailHomePage;

public class HomePageValidator {

    public static void commonHomePageValidator(GmailHomePage gmailHomePage) {
        assert gmailHomePage.waitVisibilityOfElement(gmailHomePage.getWriteButton()) != null;
    }
}
