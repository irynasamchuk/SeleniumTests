package sample8_browser;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassFixture {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearnDown(){
        System.out.println("Stopping the browser");
        if(driver != null){
            driver.quit();
        }
    }

}
