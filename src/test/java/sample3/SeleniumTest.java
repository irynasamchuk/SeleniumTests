package sample3;

import org.testng.annotations.*;

public class SeleniumTest extends SeleniumMethodFuture {

    @Test
    public void test1(){
        driver.get("http://google.com");
    }

    @Test
    public void test2(){
        driver.get("https://www.cat.com/");
    }
}
