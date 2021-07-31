package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPressPage;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        KeyPressPage keyPressPage = homePage.clickKeyPressPageLink();
        keyPressPage.enterText("A"+ Keys.BACK_SPACE);
        String result = keyPressPage.getResult();
        Assert.assertEquals(result,"You entered: BACK_SPACE","Result is incorrect!");

    }

    @Test
    public void testEnterPI(){
        KeyPressPage keyPressPage = homePage.clickKeyPressPageLink();
        keyPressPage.enterPI();
        Assert.assertEquals(keyPressPage.getResult(),"You entered: 4");

    }


}
