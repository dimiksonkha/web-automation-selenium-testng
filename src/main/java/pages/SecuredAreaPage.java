package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecuredAreaPage {
    private WebDriver driver;
    private By alerttext = By.id("flash");


    public SecuredAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
        return  driver.findElement(alerttext).getText();
    }
}
