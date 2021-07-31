package disappearedelements;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DisappearingPage;
import util.WindowManager;


public class DisappearElementTests extends BaseTests {
    @Test
    public void testDisappearingElement(){
        DisappearingPage disappearingPage = homePage.clickDisapperingPageLink();
        int numberOfMenuItemsBeforeRefresh = disappearingPage.getNumberOfMenuItems();
        getWindowManager().refresh();
        int numberOfMenuItemsAfterRefresh = disappearingPage.getNumberOfMenuItems();
        Assert.assertEquals(numberOfMenuItemsBeforeRefresh,numberOfMenuItemsAfterRefresh,"Invalid number of menu items");
        Assert.assertEquals(disappearingPage.getNumberOfMenuItems(),5,"Wrong number of elements");


    }






}
