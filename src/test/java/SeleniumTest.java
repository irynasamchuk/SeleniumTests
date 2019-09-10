import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver  =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void myFirstTest(){
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.className("MiYK0e")).click();
        driver.findElement(By.id("K32")).click();
        WebElement q = driver.findElement(By.name("q"));
       // driver.navigate().refresh();
        q.sendKeys("webdriwer");
        driver.findElement(By.name("btnK")).click();
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
