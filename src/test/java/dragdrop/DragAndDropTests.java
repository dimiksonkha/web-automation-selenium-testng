package dragdrop;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDropTests extends BaseTests {
    @Test
    public void testDragAndDrop(){
        DragAndDropPage dragAndDropPage = homePage.clickDragAndDropPageLink();
        dragAndDropPage.dragAndDropAtoB();
        String header1 = dragAndDropPage.getColumnHeader();
        Assert.assertTrue(header1.contains("A"), "Wrong Column Header");
        String header2 = dragAndDropPage.getColumnHeader();
        dragAndDropPage.dragAndDropBtoA();
        Assert.assertTrue(header2.contains("A"), "Wrong Column Header");

    }
}
