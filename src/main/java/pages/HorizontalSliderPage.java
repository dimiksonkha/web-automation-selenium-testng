package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By range = By.id("range");
    private By slider = By.cssSelector(".sliderContainer input");
    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickRange(){
        WebElement rangeElement = driver.findElement(slider);
        rangeElement.click();
        while (getRangeValue()<4){
            rangeElement.sendKeys(Keys.ARROW_RIGHT);
        }

    }
    public Double getRangeValue(){
        Double rangeValue = Double.parseDouble(driver.findElement(range).getText());
        return rangeValue;
    }
}
