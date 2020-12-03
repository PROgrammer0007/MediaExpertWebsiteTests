package framework.selenium.mediaExpert;

import framework.selenium.base.BaseTest;
import framework.selenium.base.helper.TestListener;
import framework.selenium.pages.mediaExpert.HomePage;
import framework.selenium.pages.mediaExpert.ItemPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class mediaExpertTest1 extends BaseTest {

    private final Logger logger = LoggerFactory.getLogger(mediaExpertTest1.class);

    // Test for data from file .xlm
    @Test
    @Parameters({"Item", "nameTown"})
    public void mediaExpertTest1(String item, String nameTown) {

        logger.info("Start test mediaExpertTest1");
        HomePage homepage = new HomePage();
        logger.info("Disable cookie");
        homepage.clickCloseCookieLable();
        logger.info("Search: " + item);
        homepage.searchItem(item);
        logger.info("Opening website " + item);
        homepage.clickSearchButton();
        logger.info("Adding to cart " + item);

        ItemPage itemPage = new ItemPage();
        logger.info("Check availability item in store");
        itemPage.clickCheckAvailabilityInStore();
        logger.info("Select town " + nameTown);
        itemPage.sendNameTown(nameTown);
        itemPage.checkAvailability();
        logger.info("Select only shops with this item");
        itemPage.selectStoreWithThisItem(true);
        logger.info("Select shop from we want to pick up in an hour a item");
        itemPage.pickInAnHourItem();
        logger.info("Select warraty for item");
        itemPage.selectWarraty();
        logger.info("Add to Cart");
        itemPage.keepGoing();
    }
}
