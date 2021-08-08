package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.WindowManager;


public class ShitingContentMenuPage {
    private WebDriver driver;
    private By shiftingMenuLink = By.cssSelector("a[href=\"/gallery/\"]");
    private By shiftingBy100pxLink = By.cssSelector("a[href=\"/shifting_content/menu?pixel_shift=100\"]");
    private WindowManager windowManager;

    public ShitingContentMenuPage(WebDriver driver){
        this.driver = driver;
        windowManager = new WindowManager(driver);

    }

    public boolean isContentShiftedBy100px() {
        int xcordBeforeClick = getElementXcord(shiftingMenuLink);
        driver.findElement(shiftingBy100pxLink).click();
        int xcordAfterClick = getElementXcord(shiftingMenuLink);
        int diff = xcordBeforeClick - xcordAfterClick;
        if(diff==100){
            return true;
        }else{
            return false;
        }
    }

    private int getElementXcord(By locator){
        WebElement element = driver.findElement(locator);
        Point point = element.getLocation();
        int xcord = point.getX();
        return xcord;
    }


}
