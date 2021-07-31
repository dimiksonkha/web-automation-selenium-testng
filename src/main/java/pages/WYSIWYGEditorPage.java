package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String iFrameID = "mce_0_ifr";
    private By textArea =By.id("tinymce");
    private By indentButton = By.cssSelector("button[title=\"Increase indent\"]");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void typeTextInTextArea(String text){
        switchToEditorArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void clearTextArea(){
        switchToEditorArea();
        driver.findElement(textArea).clear();
        switchToMainArea();

    }

    public String getText(){
        switchToEditorArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void increaseIndent(){
        driver.findElement(indentButton).click();

    }
    private void switchToEditorArea(){
        driver.switchTo().frame(iFrameID);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }



}
