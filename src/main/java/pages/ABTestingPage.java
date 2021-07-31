package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTestingPage {
    private WebDriver driver;
    private By heading = By.tagName("h3");

    public ABTestingPage(WebDriver driver){
         this.driver = driver;
    }
    public String getPageHeading(){
        return driver.findElement(heading).getText();
    }
}
