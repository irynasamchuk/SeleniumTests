import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver  =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 20);
    }

    @Test
    public void myFirstTest(){
        driver.navigate().to("https://translate.google.com/?hl=ru");
        WebElement languagesMenuFrom = driver.findElement(By.xpath("//div[@class='sl-more tlid-open-source-language-list']"));
        languagesMenuFrom.click();
        WebElement searchLanguage = driver.findElement(By.xpath("//input[@id='sl_list-search-box']"));
        searchLanguage.sendKeys("английский", Keys.ENTER);
        WebElement languageMenuTo = driver.findElement(By.xpath("//div[@class='tl-more tlid-open-target-language-list']"));
        wait.until(ExpectedConditions.visibilityOf(languageMenuTo)).click();
        searchLanguage.sendKeys("украинский", Keys.ENTER);
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
