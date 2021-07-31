package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    private WebDriver driver;
    private By nestedFrameLink = By.cssSelector("a[href=\"/nested_frames\"]");


    public FramePage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramePage clickNestedFramePage(){
        driver.findElement(nestedFrameLink).click();
        return new NestedFramePage(driver);
    }
}
