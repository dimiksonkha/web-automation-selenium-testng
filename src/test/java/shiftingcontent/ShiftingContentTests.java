package shiftingcontent;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShitingContentMenuPage;
import pages.ShitingContentPage;

public class ShiftingContentTests extends BaseTests {
    @Test
    public void testShiftingContent() {
        ShitingContentPage shitingContentPage = homePage.clickShiftingContentPageLink();
        ShitingContentMenuPage shitingContentMenuPage = shitingContentPage.clickmenuLink();
        Boolean isContentShiftedBy100px = shitingContentMenuPage.isContentShiftedBy100px();
        Assert.assertTrue(isContentShiftedBy100px,"Contens has not been shifted by 100px!!!");

    }
}
