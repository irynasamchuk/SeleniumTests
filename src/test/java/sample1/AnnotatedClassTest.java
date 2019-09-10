package sample1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotatedClassTest {

    @BeforeMethod
    public void beforeMethodTest(){
       System.out.println("beforeMethodTest");
   }


    private void notTest(){
       System.out.println("private Test");
   }

   @Test(groups = "positive")
    public void test(){
        System.out.println("positive Test1");
    }

    @Test(groups =  "broken")
    public void test2(){
        System.out.println("broken broken");
    }

   @AfterMethod
    public void afterMethodTest(){
        System.out.println("afterMethodTest");
    }

   @Test(enabled = false)
    public void disabledTest(){
       System.out.println("Test");
   }
}
