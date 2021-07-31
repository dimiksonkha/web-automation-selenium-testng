package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramePage;
import pages.NestedFramePage;

public class NestedFrameTests extends BaseTests {
    @Test
    public void testNestedFrame(){

        FramePage framePage = homePage.clickFramePageLink();
        NestedFramePage nestedFramePage = framePage.clickNestedFramePage();
        String leftFrameText = nestedFramePage.getTextFromLeftFrame();
        String bottonFrameText = nestedFramePage.getTextFromBottomFrame();
        Assert.assertEquals(leftFrameText, "LEFT", "Incorrect text of left frame");
        Assert.assertEquals(bottonFrameText, "BOTTOM", "Incorrect text of bottom frame");
    }
}
