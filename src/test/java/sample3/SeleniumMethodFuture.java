package sample3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class SeleniumMethodFuture {

    SeleniumMethodFuture SearchPage;

    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
    }

    @AfterClass
    public void tearnDown(){
        System.out.println("Stopping the browser");
        if(driver != null){
            driver.quit();
        }
    }

}
