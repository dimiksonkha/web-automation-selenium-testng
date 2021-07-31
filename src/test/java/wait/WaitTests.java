package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicPageLoad;
import pages.DynamicPageLoadExample1;
import pages.DynamicPageLoadExample2;

public class WaitTests extends BaseTests {
    @Test
    public void testWait(){
        DynamicPageLoad dynamicPageLoad = homePage.clickdynamicPageLoadPageLink();
        DynamicPageLoadExample1 example1= dynamicPageLoad.clickExcample1Page();
        example1.clickStartButton();
        example1.waitForFinish();
        String loadedText = example1.getLoadedText();
        Assert.assertEquals(loadedText,"Hello World!", "Incorrect Loaded Text!");
    }
    @Test
    public void testWaitSolution(){
        DynamicPageLoad dynamicPageLoad = homePage.clickdynamicPageLoadPageLink();
        DynamicPageLoadExample2 example2= dynamicPageLoad.clickExcample2Page();
        example2.clickStartButton();
        example2.waitForFinish();
        String loadedText = example2.getLoadedText();
        Assert.assertEquals(loadedText,"Hello World!", "Incorrect Loaded Text!");
    }
}
