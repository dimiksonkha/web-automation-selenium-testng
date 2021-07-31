package jqueryui;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JQueryUIMenuPage;

import java.io.File;

public class MenuTests extends BaseTests {
    @Test
    public void testJQueryUIMenu() {
        JQueryUIMenuPage jQueryUIMenuPage = homePage.clickJQueryUIMenuPageLink();
        jQueryUIMenuPage.clickEnableSubMenu();
        jQueryUIMenuPage.clickDownloadMenuItem();
        jQueryUIMenuPage.clickPDFMenuItem();
        File file = new File("/home/ayaan/Downloads/menu.pdf");
        Assert.assertTrue(file.exists(), "File doesn't exists!");

    }
}
