package javascript;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;
import pages.InfiniteScrollPage;
import pages.LargeDeepDomPage;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testJSExecution(){
        LargeDeepDomPage largeDeepDomPage = homePage.clickLargeDeepDomPageLink();
        largeDeepDomPage.scrollToLargeTable();

    }

    @Test
    public void testScrolltoParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScrollPageLink();
        infiniteScrollPage.scrollToParagraph(5);
    }

    @Test
    public void testDropdown(){
        DropdownPage dropdownPage = homePage.clickDropdownPageLink();
        dropdownPage.changeDropdownAttribute();
        String options [] = {"Option 1","Option 2"};
        dropdownPage.selectMultipleOptionFromDropdown(options);
        Assert.assertEquals(dropdownPage.getSelectedOptions().toString(),"[Option 1, Option 2]", "Wrong options");
        System.out.println(dropdownPage.getSelectedOptions());
    }

}
