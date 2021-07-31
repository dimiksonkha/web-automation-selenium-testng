package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicContentPage {
    private WebDriver driver;
    private By withStaticContentLink = By.cssSelector("a[href=\"/dynamic_content?with_content=static\"]");
    private By staticContent = By.xpath("//*[@id=\"content\"]/div[1]/div[2]");
    private By dynamicContent = By.xpath("//*[@id=\"content\"]/div[3]/div[2]");

    public DynamicContentPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickWithStaticLink(){
        driver.findElement(withStaticContentLink).click();
    }
    public String getStaticContent(){
        return driver.findElement(staticContent).getText();
    }
    public String getDynamicContent(){
        return driver.findElement(dynamicContent).getText();
    }


}
