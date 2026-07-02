package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropPage  extends BasePage {
    public static final String BASE_ANCHOR_DRAGDROP_PAGE = "drag_and_drop";
    private final By dragLeftEl = By.xpath("//header[text()='A']/ancestor::div[@id='column-a']");
    private final By dragRightEl = By.xpath("//header[text()='B']/ancestor::div[@id='column-b']");
    private final By CheckDragPosition = By.xpath("//div[@id='columns']/div[last()-1]/header[text()='B']");

    public DragDropPage (WebDriver driver){
        super(driver);
    }

    public void openPage(){
        driver.get(BASE_URL.formatted(BASE_ANCHOR_DRAGDROP_PAGE));
    }

    public void dragAndDrop(){
        Actions actoins = new Actions(driver);
        WebElement elLeft = driver.findElement(dragLeftEl);
        WebElement elRight = driver.findElement(dragRightEl);
        actoins.dragAndDrop(elLeft, elRight).perform();
    }

    public boolean CheckPlaceItem(){
        return driver.findElement(CheckDragPosition).isDisplayed();
    }
}
