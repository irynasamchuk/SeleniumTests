package sample3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class SeleniumTest extends SeleniumMethodFuture {
    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchTerms;

    @FindBy(name="go")
    private WebElement lookupButton;


    @Test
    public void test1(){
        driver.get("http://google.com");
        searchTerms.sendKeys("pizza");
    }

//    @Test
//public void test2(){
//    driver.get("https://www.cat.com/");
//}
}
