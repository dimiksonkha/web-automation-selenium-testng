package upload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTests {
    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUploadPageLink();
        fileUploadPage.chooseFile("/home/ayaan/Projects/WebAutomationSeleniumTestNG/resources/chromedriver");
        fileUploadPage.uploadFile();
        Assert.assertEquals(fileUploadPage.getUploadedFileName(), "chromedriver", "Incorrect File Name");

    }
}
