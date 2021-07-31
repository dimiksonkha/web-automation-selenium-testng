package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TypoPage {
    private WebDriver driver;
    private By paragraph = By.cssSelector(".example p:nth-child(3)");

    public TypoPage(WebDriver driver){
        this.driver = driver;
    }
    public String getParagraphText(){
        return driver.findElement(paragraph).getText();
    }

}
