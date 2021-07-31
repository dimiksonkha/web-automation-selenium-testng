package dynamiccondent;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicContentPage;

public class DynamicContentTests extends BaseTests {
    @Test
    public void testDynamicContent(){
        DynamicContentPage dynamicContentPage = homePage.clickDynamicContentPageLink();
        dynamicContentPage.clickWithStaticLink();
        String staticContent = dynamicContentPage.getStaticContent();
        String dynamicContent1 = dynamicContentPage.getDynamicContent();
        dynamicContentPage.clickWithStaticLink();
        String dynamicContent2 = dynamicContentPage.getDynamicContent();

        Assert.assertTrue(staticContent.contains("Accusantium"), "Invalid Static Content");
        Assert.assertNotEquals(dynamicContent1,dynamicContent2, "Dynamic Content should not be same!");
    }
}
