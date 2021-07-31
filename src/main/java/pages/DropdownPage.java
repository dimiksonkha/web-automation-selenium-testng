package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changeDropdownAttribute(){
        String script = "document.querySelector('#dropdown').setAttribute('multiple','');";
        var jsExecutor = (JavascriptExecutor)driver;
        jsExecutor.executeScript(script);
    }

    public void selectMultipleOptionFromDropdown(String [] options){
        Select dropdwonSelect = clickDropdownSelect();
        for (int i=0; i<options.length; i++){
            dropdwonSelect.selectByVisibleText(options[i]);
        }

    }
    public void selectOptionFromDropdown(String option){
        Select dropdwonSelect = clickDropdownSelect();
        dropdwonSelect.selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedOptions = clickDropdownSelect().getAllSelectedOptions();
        return selectedOptions.stream().map(e->e.getText()).collect(Collectors.toList());

    }

    private Select clickDropdownSelect(){
        return new Select(driver.findElement(dropdown));
    }

}
