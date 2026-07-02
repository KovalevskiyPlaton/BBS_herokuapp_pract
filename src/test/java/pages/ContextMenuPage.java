package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {
    public static final String BASE_ANCHOR_CMENU_PAGE = "context_menu";
    private final By openLAert = By.xpath("//h3/following-sibling::div[last()]");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL.formatted(BASE_ANCHOR_CMENU_PAGE));
    }

    public String getContextMenu() {
        Actions actoins = new Actions(driver);
        WebElement el = driver.findElement(openLAert);
        actoins.contextClick(el).perform();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }
}
