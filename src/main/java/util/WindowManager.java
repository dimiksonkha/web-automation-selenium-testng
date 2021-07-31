package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;

    public WindowManager(WebDriver driver){
        this.driver = driver;
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refresh(){
        driver.navigate().refresh();
    }

    public void goTo(String url){
        driver.navigate().to(url);
    }

    public void switchToTab(String tabTitle){
        var windows = driver.getWindowHandles();

        for(String window : windows){

            driver.switchTo().window(window);
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }

    }

    public void switchToNewTab(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }



}
