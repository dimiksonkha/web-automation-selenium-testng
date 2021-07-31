package statuscodes;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StatusCodePage;
import pages.StatusOkPage;

public class StatusCodeTests extends BaseTests {
    @Test
    public void testOKStatusCode(){
        StatusCodePage statusCodePage = homePage.clickStatusCodePageLink();
        StatusOkPage statusOkPage = statusCodePage.clickStatusOKPageLink();
        Assert.assertTrue(statusOkPage.getStatusParagraphText().contains("200"), "Invalid Status Code");
    }
}
