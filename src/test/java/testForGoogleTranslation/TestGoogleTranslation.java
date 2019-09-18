package testForGoogleTranslation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestGoogleTranslation extends GoogleTranslatePageTest{
    GoogleTranslatePageTest googleTranslatePage;

    protected WebDriver driver;

   @BeforeMethod
    public void setUp() {
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

   @Test
    public void tryToEnterText(){
        driver.get("https://translate.google.com/?hl=ru");
        googleTranslatePage.clickOnTheEnglishButton();
        googleTranslatePage.enterText("apple");
    }

   @AfterMethod
    public void tearnDown() {
        System.out.println("Stopping the browser");
        if (driver != null) {
            driver.quit();
        }
    }

}