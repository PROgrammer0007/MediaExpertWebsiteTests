package framework.selenium.base;

import framework.selenium.base.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    @BeforeMethod
    @Parameters({"browserName", "env"})
    public void setUp(String browser, String url) {
        DriverManager.createInstance(browser);
        WebDriver driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        DriverManager.getDriver().quit();
    }
}
