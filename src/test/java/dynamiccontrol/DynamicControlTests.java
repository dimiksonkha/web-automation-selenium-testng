package dynamiccontrol;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicControlPage;

public class DynamicControlTests extends BaseTests {
    @Test
    public void testDaynamicControl(){
        DynamicControlPage dynamicControlPage = homePage.clickDynamicControlPageLink();
        dynamicControlPage.clickAddRemoveButton();
        String messageAfterRemoveAction = dynamicControlPage.getMessage();
        dynamicControlPage.clickAddRemoveButton();
        String messageAfterAddAction = dynamicControlPage.getMessage();
        Assert.assertTrue(messageAfterRemoveAction.contains("It's gone!"), "Wrong Remove Action Message!");
        Assert.assertTrue(messageAfterAddAction.contains("It's back!"), "Wrong Add Action Message!");

    }
}
