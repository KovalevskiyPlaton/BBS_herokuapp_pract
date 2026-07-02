package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public static final String BASE_URL = "https://the-internet.herokuapp.com/%s";

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
