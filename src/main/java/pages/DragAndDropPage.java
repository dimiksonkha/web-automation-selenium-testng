package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import javax.swing.*;

public class DragAndDropPage {
    private WebDriver driver;
    private By columnA = By.id("column-a");
    private By columnB = By.id("column-b");
    private By header = By.tagName("header");

    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
    }
    private void dragAndDropByLocator(By locatorA, By locatorB){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(locatorA),driver.findElement(locatorB));
    }

    public void dragAndDropAtoB(){
        dragAndDropByLocator(columnA,columnB);
    }
    public void dragAndDropBtoA(){
        dragAndDropByLocator(columnB,columnA);
    }
    public String getColumnHeader(){
        return driver.findElement(header).getText();
    }

}
