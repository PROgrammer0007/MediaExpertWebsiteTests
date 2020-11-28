//package framework.selenium.base.helper;
//
//import framework.selenium.base.driver.DriverManager;
//
//import java.io.IOException;
//
//public class TestListener implements ITestListener {
//
//    @Override
//    public void onTestStart(ITestResult result) {
//    }
//
//    @Override
//    public void onTestSuccess(ITestResult result) {
//    }
//
//    @Override
//    public void onTestFailure(ITestResult result) {
//        try {
//            System.out.println("On test failure");
//            SeleniumHelper.takeScreenShot(DriverManager.getDriver());
//        } catch (IOException e) { // obsługa wyjątku - co ma się zadrzyć jeśli próba się nie powiedzie???
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void onTestSkipped(ITestResult result) {
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//    }
//
//    @Override
//    public void onTestFailedWithTimeout(ITestResult result) {
//    }
//
//    @Override
//    public void onStart(ITestContext context) {
//    }
//
//    @Override
//    public void onFinish(ITestContext context) {
//    }
//}
