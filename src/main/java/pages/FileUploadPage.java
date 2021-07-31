package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void chooseFile(String absoluteFilePath){
        driver.findElement(inputField).sendKeys(absoluteFilePath);
    }

    public void uploadFile(){
        driver.findElement(uploadButton).click();

    }
    public String getUploadedFileName(){
        return driver.findElement(uploadedFile).getText();
    }
}
