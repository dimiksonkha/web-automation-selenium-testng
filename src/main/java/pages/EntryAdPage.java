package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    private WebDriver driver;
//    private By closeButton = By.cssSelector(".modal-footer > p");
    private By closeButton = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");
    private By modalTitle = By.cssSelector(".modal-title > h3");

    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAddTitle(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalTitle))).getText();

    }

    public void clickCloseButton(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(closeButton))).click();
    }
}
