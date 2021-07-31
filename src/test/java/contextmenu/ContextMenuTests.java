package contextmenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenuPageLink();
        contextMenuPage.hoverOnHotspotBox();
        String alertText = contextMenuPage.getAlertText();
        contextMenuPage.dismissAlert();
        Assert.assertEquals(alertText, "You selected a context menu", "Incorrect Alert Text!");
    }
}
