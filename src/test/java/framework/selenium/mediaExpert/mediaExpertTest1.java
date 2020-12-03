package framework.selenium.mediaExpert;

import framework.selenium.base.BaseTest;
import framework.selenium.base.helper.TestListener;
import framework.selenium.pages.mediaExpert.HomePage;
import framework.selenium.pages.mediaExpert.ItemPage;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class mediaExpertTest1 extends BaseTest {

    // Test for data from file .xlm
    @Test
    @Parameters({"Item", "nameTown"})
    public void mediaExpertTest1(String item, String nameTown) {

        Reporter.log("Start test mediaExpertTest1");
        HomePage homepage = new HomePage();
        Reporter.log("Disable cookie");
        homepage.clickCloseCookieLable();
        Reporter.log("Search: " + item);
        homepage.searchItem(item);
        Reporter.log("Opening website " + item);
        homepage.clickSearchButton();
        Reporter.log("Adding to cart " + item);

        ItemPage itemPage = new ItemPage();
        Reporter.log("Check availability item in store");
        itemPage.clickCheckAvailabilityInStore();
        Reporter.log("Select town " + nameTown);
        itemPage.sendNameTown(nameTown);
        itemPage.checkAvailability();
        Reporter.log("Select only shops with this item");
        itemPage.selectStoreWithThisItem(true);
        Reporter.log("Select shop from we want to pick up in an hour a item");
        itemPage.pickInAnHourItem();
        Reporter.log("Select warraty for item");
        itemPage.selectWarraty();
        Reporter.log("Add to Cart");
        itemPage.keepGoing();
    }
}
