package framework.selenium.mediaExpert;

import framework.selenium.base.BaseTest;
import framework.selenium.base.helper.ExcelReader;
import framework.selenium.pages.mediaExpert.HomePage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class mediaExpertTest2 extends BaseTest {

    private final Logger logger = LoggerFactory.getLogger(mediaExpertTest2.class);

    // Test for data from excel
    @Test(dataProvider = "getData")
    public void mediaExpertTest2(String item) {

        logger.info("Start test mediaExpertTest1");
        HomePage homepage = new HomePage();
        logger.info("Disable cookie");
        homepage.clickCloseCookieLable();
        logger.info("Search: " + item);
        homepage.searchItem(item);
        logger.info("Opening website " + item);
        homepage.clickSearchButton();
        Reporter.log("Adding to cart " + item);
    }


    @DataProvider
    public Object[][] getData() {
        Object[][] data = null;
        try {
            data = ExcelReader.readExcelFile2(new File("src/test/resources/dataFromExcel/Dane.xls"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
