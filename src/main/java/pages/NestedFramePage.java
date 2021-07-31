package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {
    private WebDriver driver;
    private String topFrameName = "frame-top";
    private String leftFrame ="frame-left";
    private String bottomFrame = "frame-bottom";
    private By frameBody = By.tagName("body");

    public NestedFramePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTextFromLeftFrame(){
        switchToFrameByName(topFrameName);
        switchToFrameByName(leftFrame);
        String frameText = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return frameText;

    }

    public String getTextFromBottomFrame(){
        switchToFrameByName(bottomFrame);
        String frameText = getFrameText();
        driver.switchTo().parentFrame();
        return frameText;

    }
    private void switchToFrameByName(String frameName){
        driver.switchTo().frame(frameName);

    }

    private String getFrameText(){
        return driver.findElement(frameBody).getText();
    }
}
