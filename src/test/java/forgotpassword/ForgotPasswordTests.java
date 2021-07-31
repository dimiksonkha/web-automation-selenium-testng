package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;



public class ForgotPasswordTests extends BaseTests {
    @Test
    public void forgotPasswordTest(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordPageLink();
        forgotPasswordPage.setEmail("abc@gmail.com");
        forgotPasswordPage.clickSubmitButton();

    }
}
