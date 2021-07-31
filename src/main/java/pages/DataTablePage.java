package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataTablePage {
    private WebDriver driver;

    private By firstNameSorterTable1 = By.cssSelector("#table1 th:nth-child(2)");
    private By firstNameTable1 = By.cssSelector("#table1 tr:nth-child(1) td:nth-child(2)");


    public DataTablePage(WebDriver driver){
        this.driver = driver;
    }

    public void sortByFirstName(){
        driver.findElement(firstNameSorterTable1).click();
    }
    public String getFirstNameFromFirstRow(){
        return driver.findElement(firstNameTable1).getText();
    }
}
