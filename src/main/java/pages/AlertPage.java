package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By alertButton = By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By alertToConfirmButton = By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By alertPromptButton = By.xpath("//button[text()=\"Click for JS Prompt\"]");

    private By result = By.id("result");
    public AlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(alertButton).click();
    }
    public void triggerConfirmAlert(){
        driver.findElement(alertToConfirmButton).click();
    }
    public void triggerPromptAlert(){
        driver.findElement(alertPromptButton).click();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void dismissConfirmAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String getConfirmAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void typeTextInAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
}
