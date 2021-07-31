package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationPage {
    private WebDriver driver;
    private By notificationMessageField = By.id("flash");

    public NotificationPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isNotificationMessageDisplayed(){
        return driver.findElement(notificationMessageField).isDisplayed();
    }

    public String getNotificationMessage(){
        return driver.findElement(notificationMessageField).getText();
    }
}
