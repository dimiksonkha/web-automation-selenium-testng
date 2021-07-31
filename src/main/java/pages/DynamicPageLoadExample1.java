package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPageLoadExample1 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicPageLoadExample1(WebDriver driver){
        this.driver = driver;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
    }
    public void waitForFinish(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

    public boolean isStartButtonDisplayed(){
        return driver.findElement(startButton).isDisplayed();
    }



}
