package sample8_browser;

import org.junit.Test;

public class SeleniumTest extends  SeleniumClassFixture{
    @Test
    public void test1(){
        driver.get("http://google.com");
    }

    @Test
    public void test2(){
        driver.get("https://www.cat.com/");
    }
}
