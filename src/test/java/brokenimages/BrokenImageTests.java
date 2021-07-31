package brokenimages;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrokenImagePage;

public class BrokenImageTests extends BaseTests {
    @Test
    public void testBrokenImage(){
        BrokenImagePage brokenImagePage = homePage.clickBrokenImagePageLink();
        Assert.assertTrue(brokenImagePage.isImg1BrokenImage(), "Img 1 should be broken images");
        Assert.assertTrue(brokenImagePage.isImg2BrokenImage(), "Img 2 should be broken images");
        Assert.assertFalse(brokenImagePage.isImg3BrokenImage(), "Img 3 should not be broken images");
        Assert.assertEquals(brokenImagePage.getNumberOfBrokenImages(),2,"Number of broken images should be 2");
    }
}
