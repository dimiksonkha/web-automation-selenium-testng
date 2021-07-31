package modals;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExitIntentPage;

import java.awt.*;

public class ExitIntentTests extends BaseTests {
    @Test
    public void testExitIntent() throws InterruptedException, AWTException {
        ExitIntentPage exitIntentPage = homePage.clickExitIntenPage();
        exitIntentPage.getModal();
        String title = exitIntentPage.getAddTitle();
        exitIntentPage.clickCloseButton();
        Assert.assertTrue(title.contains("THIS IS A MODAL WINDOW"), "Wrong add title");
    }
}
