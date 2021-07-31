package geolocation;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GeolocationPage;

public class GeolocationTests extends BaseTests {
    @Test
    public void testGeolocation() {
        GeolocationPage geolocationPage = homePage.clickGeolocationPageLink();
        geolocationPage.clickLocationButton();
//        Assert.assertTrue(geolocationPage.geLatitude().contains("0"), "Wrong Latitude");
//        Assert.assertTrue(geolocationPage.geLongitude().contains("0"), "Wrong Longitude");


    }
}
