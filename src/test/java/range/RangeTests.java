package range;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class RangeTests extends BaseTests {
    @Test
    public void testRange(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPageLink();
        horizontalSliderPage.clickRange();
        Assert.assertEquals(horizontalSliderPage.getRangeValue(),4.0,"Range Incorrect");
    }
}
