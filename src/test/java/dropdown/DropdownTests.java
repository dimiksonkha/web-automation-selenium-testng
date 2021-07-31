package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropdownPageLink();
        String option ="Option 1";
        dropdownPage.selectOptionFromDropdown(option);
        Assert.assertEquals(dropdownPage.getSelectedOptions().size(),1,"Incorrect Number of selection");
        Assert.assertTrue(dropdownPage.getSelectedOptions().contains(option), "Option 1 has not been selected");

    }

}
