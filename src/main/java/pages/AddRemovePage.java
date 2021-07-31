package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.Struct;

public class AddRemovePage {
    private WebDriver driver;
    private By addElementButton = By.cssSelector(".example > button");
    private By removeButton = By.className("added-manually");
    private Integer RemoveElements = 0;

    public AddRemovePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickAddElementButton(){
        driver.findElement(addElementButton).click();
        RemoveElements+=1;
    }
    public void clickRemoveButton(){
        driver.findElement(removeButton).click();
    }
    public boolean isButtonRemoved(){
        int updatedRemoveElements = getNumberOfRemoveButtons();
        if(updatedRemoveElements < RemoveElements){
            return true;
        }else{
            return false;
        }
    }
    private int getNumberOfRemoveButtons(){
        return driver.findElements(removeButton).size();
    }
    public boolean isRemoveButtonDisplayed(){
        return driver.findElement(removeButton).isDisplayed();
    }

}
