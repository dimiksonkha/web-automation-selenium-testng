package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlPage {
    private WebDriver driver;

    private By addRemoveButton = By.cssSelector("#checkbox-example > button");
    private By loading = By.id("loading");
    private By message = By.id("message");

    public DynamicControlPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddRemoveButton(){
        driver.findElement(addRemoveButton).click();
    }
    public String getMessage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(message));
        return driver.findElement(message).getText();
    }

}
