package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasicAuthPage;
import pages.DigestAuthPage;

public class BasicAuthTests extends BaseTests {
    @Test
    public void testBasicAuth() throws InterruptedException {

        BasicAuthPage basicAuthPage = homePage.clickBasicAuthPageLink();
        Assert.assertTrue(basicAuthPage.getSuccessMessage().contains("Congratulations! You must have the proper credentials."),"Invalid Message!!!");

    }

}
