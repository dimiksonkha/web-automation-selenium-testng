package typo;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TypoPage;

public class TypoTests extends BaseTests {
    @Test
    public void testTypo(){
        TypoPage typoPage = homePage.clickTypoPageLink();
        Assert.assertEquals(typoPage.getParagraphText(),"Sometimes you'll see a typo, other times you won't.");
    }
}
