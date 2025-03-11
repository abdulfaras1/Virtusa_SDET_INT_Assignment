package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nifty50_Page {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"equityStockTable\"]/tbody/tr[1]/td[1]")
    private WebElement firstStock;

    @FindBy(xpath = "//*[@id=\"equityStockTable\"]/tbody/tr[1]/td[5]")
    private static WebElement firstStockCurrent;

    @FindBy(xpath = "//*[@id=\"equityStockTable\"]/tbody/tr[2]/td[1]/a")
    private WebElement secondStock;

    @FindBy(xpath = "//*[@id=\"equityStockTable\"]/tbody/tr[2]/td[4]")
    private static WebElement secondStockCurrent;

    @FindBy(xpath = "//*[@id=\"equityStockTable\"]/tbody/tr[3]/td[1]/a")
    private  WebElement thirdStock;

    public Nifty50_Page(WebDriver driver, WebElement firstStockCurrent) throws InterruptedException {
        this.driver = driver;

        PageFactory.initElements(driver, this );
        Thread.sleep(5000);
        //Nifty50_Page.firstStockCurrent = firstStockCurrent;
    }

    /*public Nifty50_Page(WebElement firstStock) {
        this.firstStock = firstStock;
    }

    public static String getFirstStockCurrent() {
        return firstStockCurrent.getText();
    }*/

    public Nifty50_Page(WebElement secondStock) {
        this.secondStock = secondStock;
    }

    public static String getSecondStockCurrent() {
        return secondStockCurrent.getText();
    }
}
