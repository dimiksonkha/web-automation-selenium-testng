package windows;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPageLoad;
import pages.DynamicPageLoadExample1;
import pages.MultipleWindowsPage;

public class MultipleWindowTests extends BaseTests {
    @Test
    public void testMultipleWindows(){
        MultipleWindowsPage multipleWindowsPage = homePage.clickMultipleWindowsPageLink();
        multipleWindowsPage.clickHere();
        getWindowManager().switchToTab("New Window");



    }

    @Test
    public void testOntherTab(){
        var buttonPage = homePage.clickdynamicPageLoadPageLink().clickExcample1PageForNewTab();
        getWindowManager().switchToNewTab();
        Assert.assertTrue(buttonPage.isStartButtonDisplayed(), "Button page has not been displayed");


    }
}
