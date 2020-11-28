package framework.selenium.base.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class DriverManager {

    private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        return webDriver.get();
    }

    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }

    public static void createInstance(String browserName) {
        setWebDriver(DriverFactory.createWebDriverInstance(browserName));
    }
}
