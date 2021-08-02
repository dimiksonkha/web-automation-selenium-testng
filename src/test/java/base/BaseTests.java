package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import util.EmailSender;
import util.WindowManager;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;


public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    private WindowManager windowManager;
    private WebDriver.Navigation navigate;

    @BeforeClass
    public void setup(){
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        // For Linux and Mac Operating System
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"/resources/chromedriver");

        //Comment out this line for Windows Operating System
        //System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"/resources/chromedriver.exe");

        driver = new ChromeDriver(getChromeOptions());
        driver.manage().window().maximize();


    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }


    @AfterMethod
    public void recordFailure(ITestResult result){
        if(result.getStatus()==ITestResult.FAILURE){
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }


    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--unlimited-storage");
        options.addArguments("--enable-notifications");
        options.addArguments("--enable-geolocation");

        return options;
    }



//    @AfterSuite
//    public void sendEmail(){
//        EmailSender emailSender = new EmailSender();
//        emailSender.sendEmail();
//    }
}
