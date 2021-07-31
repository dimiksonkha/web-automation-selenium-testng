package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FramesTests extends BaseTests {
    @Test
    public void testFrame(){
        WYSIWYGEditorPage wysiwygEditorPage = homePage.clickWYSIWYGEditorPageLink();
        wysiwygEditorPage.clearTextArea();
        wysiwygEditorPage.increaseIndent();
        wysiwygEditorPage.typeTextInTextArea("Hello World");
        Assert.assertEquals(wysiwygEditorPage.getText(),"Hello World", "Incorrect Text!!!");
    }
}
