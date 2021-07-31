package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FloatingMenuPage {
    private WebDriver driver;
    private By home = By.cssSelector("a[href=\"#home\"]");

    public FloatingMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickHomeLink(){
        driver.findElement(home).click();
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }



}
