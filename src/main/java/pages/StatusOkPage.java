package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusOkPage {
    private WebDriver driver;
    private By statusParagraph =By.cssSelector(".example p:nth-child(2)");

    public StatusOkPage(WebDriver driver){
        this.driver = driver;
    }
    public String getStatusParagraphText(){
        return driver.findElement(statusParagraph).getText();
    }
}
