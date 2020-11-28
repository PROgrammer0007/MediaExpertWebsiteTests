package framework.selenium.base.utils.reports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

    private static ExtentReports extentReports;

    public synchronized static ExtentReports getExtentReports(){
        if(extentReports==null){
            String sciezkaDoKatalogu = System.getProperty("user.dir");
            String raportName = sciezkaDoKatalogu + "//ExtentReports//Report.html";
            extentReports = new ExtentReports(raportName, true);
        }
        return extentReports;
    }
}
