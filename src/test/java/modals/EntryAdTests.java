package modals;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class EntryAdTests extends BaseTests {
    @Test
    public void testEntryAdd(){
        EntryAdPage entryAdPage = homePage.clickEntryAdPageLink();
        String title = entryAdPage.getAddTitle();
        entryAdPage.clickCloseButton();
        Assert.assertTrue(title.contains("THIS IS A MODAL WINDOW"), "Wrong add title");

    }

}
