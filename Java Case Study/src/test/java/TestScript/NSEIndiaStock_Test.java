package TestScript;

import Pages.NSEIndiaStock_Page;
import Pages.Nifty50_Page;
import Utilities.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class NSEIndiaStock_Test extends BaseTest {

   NSEIndiaStock_Page NSEIndiaStock_Page ;
   Nifty50_Page Nifty50_Page ;

    @Test
    public void verifyStockInformationRCOM() throws InterruptedException, IOException {


        Log.info("Starting Test named verifyStockInformationRCOM  ");

        NSEIndiaStock_Page=new NSEIndiaStock_Page(driver);
        String stockName = "RCOM";
        NSEIndiaStock_Page.searchStock(stockName);
        Log.info("Verify Stock information  ");
        //Assert.assertTrue(NSEIndiaStock_Page.stockCurrentValue().equals("1.75"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockPreviousValue().equals("1.80"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockOpenValue().equals("1.75"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockHighValue().equals("2.58"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockLowValue().equals("1.45"));
        //RCOM 52 week values verification
        Assert.assertTrue(NSEIndiaStock_Page.get52WeekHighPrice().equals("2.58"));
        Assert.assertTrue(NSEIndiaStock_Page.get52WeekLowPrice().equals("1.45"));

        Log.info("Printing 52 week High and Low values ");
        System.out.println("52 week High Value is ----  "+NSEIndiaStock_Page.get52WeekHighPrice() );
        System.out.println("52 week High Value is ----  "+NSEIndiaStock_Page.get52WeekLowPrice() );
        captureScreenshot(driver, "verifyStockInformationRCOM");
        Log.info("End of executing test");
    }


    @Test
    public void verifyStockInformationTATA() throws InterruptedException, IOException {


        Log.info("Starting Test named verifyStockInformationRCOM  ");

        NSEIndiaStock_Page=new NSEIndiaStock_Page(driver);
        String stockName = "TATA MOTORS";
        NSEIndiaStock_Page.searchStock(stockName);
        Log.info("Verify Stock information  ");
        //Assert.assertTrue(NSEIndiaStock_Page.stockCurrentValue().equals("1.75"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockPreviousValue().equals("1.80"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockOpenValue().equals("1.75"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockHighValue().equals("2.58"));
        //Assert.assertTrue(NSEIndiaStock_Page.stockLowValue().equals("1.45"));
        //RCOM 52 week values verification
        Assert.assertTrue(NSEIndiaStock_Page.get52WeekHighPrice().equals("2.58"));
        Assert.assertTrue(NSEIndiaStock_Page.get52WeekLowPrice().equals("1.45"));

        Log.info("Printing 52 week High and Low values ");
        System.out.println("52 week High Value is ----  "+NSEIndiaStock_Page.get52WeekHighPrice() );
        System.out.println("52 week High Value is ----  "+NSEIndiaStock_Page.get52WeekLowPrice() );
        captureScreenshot(driver, "verifyStockInformationTATA");
        Log.info("End of executing test");
    }


    /*@Test
    public void selectAnyStockNIFTY50() throws InterruptedException, IOException {


        Log.info("Starting Test named verifyStockInformationAnyNifty50  ");

        NSEIndiaStock_Page=new NSEIndiaStock_Page(driver);
        NSEIndiaStock_Page.clickNifty50();
        Log.info("Verify All 50 Stocks information  ");
        Assert.assertTrue(Nifty50_Page.getSecondStockCurrent().equals("22,544.70"));
        Log.info("Printing All Nifty 50 stocks Last Close, 52 week High and Low values ");
        System.out.println("Current Last Close value for First stock in Nifty 50 is"+Nifty50_Page.getSecondStockCurrent());
        //System.out.println("52 week High Value is ----  "+NSEIndiaStock_Page.get52WeekHighPrice() );
        //System.out.println("52 week High Value is ----  "+NSEIndiaStock_Page.get52WeekLowPrice() );
        captureScreenshot(driver, "verifyStockInformationAnyNifty50");
        Log.info("End of executing test");

    }*/
}
