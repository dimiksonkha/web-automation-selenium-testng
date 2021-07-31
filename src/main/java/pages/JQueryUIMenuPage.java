package pages;

import com.sun.mail.imap.AppendUID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryUIMenuPage {
    private WebDriver driver;
    private By enableSubmenu = By.id("ui-id-3");
    private By downloadMenuItem = By.id("ui-id-4");
    private By pdfMenuItem = By.id("ui-id-5");

    public JQueryUIMenuPage(WebDriver driver){
    this.driver = driver;
    }
    public void clickEnableSubMenu(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(enableSubmenu)).click().perform();
    }
    public void clickDownloadMenuItem(){
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(downloadMenuItem)));
        actions.moveToElement(driver.findElement(downloadMenuItem)).click().perform();
    }
    public void clickPDFMenuItem(){
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(pdfMenuItem)));
        actions.moveToElement(driver.findElement(pdfMenuItem)).click().perform();

    }

}
