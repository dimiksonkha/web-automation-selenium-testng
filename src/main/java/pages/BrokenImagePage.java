package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImagePage {
    private WebDriver driver;
    private By img1 = By.cssSelector("img[src=\"asdf.jpg\"]");
    private By img2 = By.cssSelector("img[src=\"hjkl.jpg\"]");
    private By img3 = By.cssSelector("img[src=\"img/avatar-blank.jpg\"]");

    public BrokenImagePage(WebDriver driver){
        this.driver = driver;
    }
    public boolean isImg1BrokenImage(){
        return driver.findElement(img1).getAttribute("naturalWidth").equals("0");
    }

    public boolean isImg2BrokenImage(){
        return driver.findElement(img2).getAttribute("naturalWidth").equals("0");
    }

    public boolean isImg3BrokenImage(){
        return driver.findElement(img3).getAttribute("naturalWidth").equals("0");
    }
    public int getNumberOfBrokenImages(){
        int numberOfBrokenImages = 0;
        List<WebElement> elements = driver.findElements(By.cssSelector(".example img"));
        for(WebElement element: elements){
            if(isBrokenImage(element)){
                numberOfBrokenImages+=1;
            }
        }
        return numberOfBrokenImages;
    }
    private boolean isBrokenImage(WebElement image){
        return image.getAttribute("naturalWidth").equals("0");

    }

}
