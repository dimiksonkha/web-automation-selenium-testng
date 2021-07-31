package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;

import javax.sound.midi.ShortMessage;

public class AlertTests extends BaseTests {
    @Test
    public void testAlert(){
        AlertPage alertPage = homePage.clickAlertPageLink();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getResult(),"You successfully clicked an alert", "Incorrect Result Message");
    }

    @Test
    public void testConfirmAlert(){
        AlertPage alertPage = homePage.clickAlertPageLink();
        alertPage.triggerConfirmAlert();
        alertPage.dismissConfirmAlert();
        Assert.assertEquals(alertPage.getResult(),"You clicked: Cancel", "Incorrect Result!");
    }

    @Test
    public void testPromptAlert(){
        AlertPage alertPage = homePage.clickAlertPageLink();
        alertPage.triggerPromptAlert();
        alertPage.typeTextInAlert("Shifan");
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.getResult(),"You entered: Shifan", "Inccorrect Result!");
    }
}
