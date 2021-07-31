package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DigestAuthPage;

public class DigestAughTests extends BaseTests {
    @Test
    public void testDigestAuth() throws InterruptedException {

        DigestAuthPage digestAuthPage = homePage.clickDigestAuthPageLink();
        Assert.assertTrue(digestAuthPage.getSuccessMessage().contains("Congratulations! You must have the proper credentials."),"Invalid Message!!!");

    }
}
