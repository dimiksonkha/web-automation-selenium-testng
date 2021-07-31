package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DigestAuthPage {
    private WebDriver driver;
    private  By succesMessage= By.tagName("p");

    public DigestAuthPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSuccessMessage(){
        return driver.findElement(succesMessage).getText();
    }

}
