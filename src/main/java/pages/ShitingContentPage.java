package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShitingContentPage {
    private WebDriver driver;
    private By menuLink = By.cssSelector("a[href=\"/shifting_content/menu\"]");

    public ShitingContentPage(WebDriver driver){
        this.driver = driver;

    }

    public ShitingContentMenuPage clickmenuLink() {
        driver.findElement(menuLink).click();
        return new ShitingContentMenuPage(driver);
    }

}
