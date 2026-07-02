package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IframePage extends BasePage {

    public static final String BASE_ANCHOR_IFRAME_PAGE = "iframe";

    public IframePage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get(BASE_URL.formatted(BASE_ANCHOR_IFRAME_PAGE));
    }

    public boolean checkIFameText(String innerText) {
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        boolean frameTextisExist = driver.getPageSource().contains(innerText);
        driver.switchTo().defaultContent();
        return frameTextisExist;
    }

    public String checkIFameText() {
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);
        WebElement iframeInnerText = driver.findElement(By.xpath("//body/p"));
        String resultText = iframeInnerText.getText();
        driver.switchTo().defaultContent();
        return resultText;
    }
}
