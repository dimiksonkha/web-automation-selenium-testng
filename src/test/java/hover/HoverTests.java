package hover;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoverPage;

public class HoverTests extends BaseTests {
    @Test
    public void testHover(){
        HoverPage hoverPage = homePage.clickHoverPageLink();
        HoverPage.FigureCaption caption= hoverPage.hoverOnFigureBox(1);
        Assert.assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        Assert.assertEquals(caption.getCaptionHeader(),"name: user1", "Caption header not correct");
        Assert.assertTrue(caption.getCaptionLink().endsWith("/users/1"),"Link Incorrect!");
        Assert.assertEquals(caption.getLinkText(),"View profile", "Inccorrect Link Text!");


    }

}
