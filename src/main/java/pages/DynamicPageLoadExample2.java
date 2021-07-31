package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DynamicPageLoadExample2 {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loading = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicPageLoadExample2(WebDriver driver){
        this.driver = driver;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
    }
    public void waitForFinish(){
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5))
        .pollingEvery(Duration.ofSeconds(1))
        .ignoring(NoSuchElementException.class);
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

}
