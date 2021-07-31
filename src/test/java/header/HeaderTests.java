package header;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ABTestingPage;

public class HeaderTests extends BaseTests {
    @Test
    public void testABTestingHeading(){
        ABTestingPage abTestingPage = homePage.clickABTestingPageLink();
        Assert.assertTrue(abTestingPage.getPageHeading().contains("A/B Test"),"A/B Test Invalid Page");

    }
}
