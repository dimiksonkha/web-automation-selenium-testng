package checkboxes;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxPage;

public class CheckboxTests extends BaseTests {
    @Test public void testCheckbox(){
        CheckboxPage checkboxPage = homePage.clickCheckBoxPageLink();
        checkboxPage.clickCheckbox1();
        Assert.assertTrue(checkboxPage.isCheckbox1Selected(),"Checkbox should be selected");
        checkboxPage.clickCheckbox2();
        Assert.assertFalse(checkboxPage.isCheckbox2Selected(),"Checkbox should be unselected!");

    }
}
