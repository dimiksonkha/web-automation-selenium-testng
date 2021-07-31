package floatingmenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FloatingMenuPage;

public class FloatingMenuTests extends BaseTests {
    @Test
    public void testFloatingMenu(){
        FloatingMenuPage floatingMenuPage = homePage.clickFloatingMenuPageLink();
        floatingMenuPage.clickHomeLink();
        String url = floatingMenuPage.getCurrentURL();
        Assert.assertEquals(url,"https://the-internet.herokuapp.com/floating_menu#home",  "Wrong URL");

    }
}
