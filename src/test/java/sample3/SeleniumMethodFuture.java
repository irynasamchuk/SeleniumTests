package sample3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class SeleniumMethodFuture {

    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearnDown(){
        System.out.println("Stopping the browser");
        if(driver != null){
            driver.quit();
        }
    }

}
