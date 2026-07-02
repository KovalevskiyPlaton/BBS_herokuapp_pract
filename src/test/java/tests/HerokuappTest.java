package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HerokuappTest extends BaseTest {

    @Test
    public void testIframe() {
        iframePage.openPage();
        assertTrue(iframePage.checkIFameText("Your content goes here."),
                "Текст не соответсвует элементу iFRame");
        assertEquals(iframePage.checkIFameText(), "Your content goes here.",
                "Текст не соответсвует элементу iFRame");
    }

    @Test
    public void testDrugDrop() {
        dragDropPage.openPage();
        dragDropPage.dragAndDrop();
        assertTrue(dragDropPage.CheckPlaceItem(), "Перемещение не выполненно");
    }

    @Test
    public void testAlertAccept() {
        contextMenuPage.openPage();
        assertEquals("You selected a context menu", contextMenuPage.getContextMenu(), "Текст alert не соответсвует");
    }
}
