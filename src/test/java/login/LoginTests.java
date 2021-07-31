package login;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecuredAreaPage;

public class LoginTests extends BaseTests {
    private WebDriver driver;

    @Test
    public void successfullLoginTest(){
        LoginPage loginPage = homePage.clickFormAuthenticationPageLink();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecuredAreaPage securedAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(securedAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert Text incorrect!!");
    }
}
