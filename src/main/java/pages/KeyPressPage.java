package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage {
    private WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");

    public KeyPressPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);

    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void enterPI(){
        enterText(Keys.chord(Keys.ALT,"P")+"=3.14");
    }
}
