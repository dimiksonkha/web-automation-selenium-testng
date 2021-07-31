package tables;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DataTablePage;

public class DataTableTests extends BaseTests {
    @Test
    public void testSortDataTable(){
        DataTablePage dataTablePage = homePage.clickDataTablePageLink();
        dataTablePage.sortByFirstName();
        String sortedFirstName = dataTablePage.getFirstNameFromFirstRow();
        Assert.assertTrue(sortedFirstName.contains("Frank"), "First Name should be Frank");
    }
}
