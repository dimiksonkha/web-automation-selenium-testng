package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxPage {
    private WebDriver driver;
    private By checkbox1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
    private By checkbox2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");

    public CheckboxPage (WebDriver driver){
     this.driver = driver;
    }
    public void clickCheckbox1(){
        driver.findElement(checkbox1).click();
    }

    public void clickCheckbox2(){
        driver.findElement(checkbox2).click();
    }

    public boolean isCheckbox1Selected(){
        return driver.findElement(checkbox1).isSelected();
    }
    public boolean isCheckbox2Selected(){
        return driver.findElement(checkbox2).isSelected();
    }
}
