package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengingDOMPage {
    private WebDriver driver;
    private By firstLink = By.cssSelector("div.large-2.columns a:nth-child(1)");
    private By secondLink = By.cssSelector("div.large-2.columns a:nth-child(3)");
    private By thirdLink = By.cssSelector("div.large-2.columns a:nth-child(5)");
    private By firstRowFirstColum = By.cssSelector("div table tbody tr:nth-child(1) td:nth-child(1)");


    public ChallengingDOMPage(WebDriver driver){
        this.driver = driver;
    }
    public String getFirstLinkText(){
        return driver.findElement(firstLink).getText();
    }
    public String getSecondLinkText(){
        return driver.findElement(firstLink).getText();
    }
    public String getThirdLinkText(){
        return driver.findElement(firstLink).getText();
    }

    public String getFirstRowFirstColumData(){
        return driver.findElement(firstRowFirstColum).getText();
    }
}
