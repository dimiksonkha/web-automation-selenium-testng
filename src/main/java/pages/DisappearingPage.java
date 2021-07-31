package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WindowManager;

public class DisappearingPage {
    private WebDriver driver;
    private By menuItems = By.cssSelector("ul li a");

    public DisappearingPage(WebDriver driver){
        this.driver = driver;
    }

    public int getNumberOfMenuItems(){
        return driver.findElements(menuItems).size();
    }

}
