package framework.selenium.mediaExpert;

import framework.selenium.base.BaseTest;
import framework.selenium.pages.mediaExpert.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class mediaExpertTest1 extends BaseTest {

    @Test
    @Parameters({"ITEM"}) // tych parametrów może być więcej, zostaną przekazane do metody zgodnie zkolejnością wpisania // podajemy nazwy parametrów z .xml
    public void mediaExpertTest1(String item) {

        Reporter.log("Start test mediaExpertTest1");
        HomePage homepage = new HomePage();
        Reporter.log("Disable cookie");
        homepage.clickCloseCookieLable();
        Reporter.log("Search: " + item);
        homepage.searchItem(item);
        Reporter.log("Opening website " + item);
        homepage.clickSearchButton();
        Reporter.log("Adding to cart " + item);
    }
}
