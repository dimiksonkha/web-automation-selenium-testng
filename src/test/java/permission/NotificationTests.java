package permission;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationPage;

public class NotificationTests extends BaseTests {
    @Test
    public void testNotification(){
        NotificationPage notificationPage = homePage.clickNotificationPageLink();
        Assert.assertTrue(notificationPage.isNotificationMessageDisplayed(),"No Notification Message Found");
        Assert.assertTrue(notificationPage.getNotificationMessage().contains("Action"), "Error Message");

    }

}
