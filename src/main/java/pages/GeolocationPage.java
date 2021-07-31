package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeolocationPage {
    private WebDriver driver;
    private By locationButton = By.cssSelector("#content button");
    private By latValue = By.id("lat-value");
    private By longValue = By.id("long-value");

    public GeolocationPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickLocationButton() throws InterruptedException {
        driver.findElement(locationButton).click();
        Thread.sleep(500);
    }
    public String geLatitude(){
        return driver.findElement(latValue).getText();
    }
    public String geLongitude(){
        return driver.findElement(longValue).getText();
    }


}
