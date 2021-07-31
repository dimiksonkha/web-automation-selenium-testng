package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDomPage {
    private WebDriver driver;
    private By largeTable = By.id("large-table");

    public LargeDeepDomPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToLargeTable(){
        WebElement table = driver.findElement(largeTable);
        String script = "arguments[0].scrollIntoView();";
         var jsexeculter = (JavascriptExecutor)driver;
         jsexeculter.executeAsyncScript(script, table);

    }
}
