package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.DragDropPage;
import pages.IframePage;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    IframePage iframePage;
    DragDropPage dragDropPage;
    ContextMenuPage contextMenuPage;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        iframePage = new IframePage(driver);
        dragDropPage = new DragDropPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
