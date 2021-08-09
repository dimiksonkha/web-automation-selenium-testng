package challengingdom;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChallengingDOMPage;

public class ChallengingDOMTests extends BaseTests {
    @Test
    public void testChallengingDOM(){
        ChallengingDOMPage challengingDOMPage = homePage.clickChallengingDOMPageLink();
        System.out.println(challengingDOMPage.getFirstLinkText());
        System.out.println(challengingDOMPage.getSecondLinkText());
        System.out.println(challengingDOMPage.getThirdLinkText());
        String firstRowFirstColumnData = challengingDOMPage.getFirstRowFirstColumData();
        Assert.assertTrue(firstRowFirstColumnData.contains("Iuvaret0"), "Invalid Data");
    }
}
