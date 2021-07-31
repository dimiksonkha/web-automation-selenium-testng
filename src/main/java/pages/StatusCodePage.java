package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {
    private WebDriver driver;
    private By statusOkPageLink = By.cssSelector("a[href=\"status_codes/200\"]");

    public StatusCodePage(WebDriver driver){
        this.driver = driver;

    }

    public StatusOkPage clickStatusOKPageLink(){
        driver.findElement(statusOkPageLink).click();
        return new StatusOkPage(driver);

    }
}
