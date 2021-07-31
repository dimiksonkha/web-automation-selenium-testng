package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class DynamicPageLoad {
    private WebDriver driver;
    private By exmaple1Link = By.cssSelector("a[href=\"/dynamic_loading/1\"]");
    private By exmaple2Link = By.cssSelector("a[href=\"/dynamic_loading/2\"]");

    public DynamicPageLoad(WebDriver driver){
        this.driver = driver;
    }

    public DynamicPageLoadExample1 clickExcample1Page(){
        driver.findElement(exmaple1Link).click();
        return new DynamicPageLoadExample1(driver);
    }

    public DynamicPageLoadExample1 clickExcample1PageForNewTab(){
        driver.findElement(exmaple1Link).sendKeys(Keys.CONTROL, Keys.RETURN);

        return new DynamicPageLoadExample1(driver);
    }

    public DynamicPageLoadExample2 clickExcample2Page(){
        driver.findElement(exmaple2Link).click();
        return new DynamicPageLoadExample2(driver);
    }
}
