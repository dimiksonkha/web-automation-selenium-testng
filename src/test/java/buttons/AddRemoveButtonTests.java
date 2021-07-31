package buttons;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class AddRemoveButtonTests extends BaseTests {
    @Test
    public void testAddElementAction(){
        AddRemovePage addRemovePage = homePage.clickAddRemovePageLink();
        addRemovePage.clickAddElementButton();
        Assert.assertTrue(addRemovePage.isRemoveButtonDisplayed(), "Remove Button has not been displayed!");

    }

    @Test
    public void testRemoveAction(){
        AddRemovePage addRemovePage = homePage.clickAddRemovePageLink();
        addRemovePage.clickAddElementButton();
        addRemovePage.clickRemoveButton();
        Assert.assertTrue(addRemovePage.isButtonRemoved(),"Invalid number Of Button");

    }
}
