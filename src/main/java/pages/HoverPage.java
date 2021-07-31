package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");
    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    public FigureCaption hoverOnFigureBox(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(boxCaption));
    }

    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getCaptionHeader(){
            return caption.findElement(header).getText();
        }

        public String getCaptionLink(){
            return caption.findElement(link).getAttribute("href");

        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }

    }
}