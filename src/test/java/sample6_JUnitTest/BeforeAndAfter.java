package sample6_JUnitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeAndAfter {
    private Object x = new Object();

    @Before
    public void test1(){
        System.out.println("Before" +x);
    }

    @Test
    public void test2(){
        System.out.println("test2" +x);
    }

    @Test
    public void test3(){
        System.out.println("test3" +x);
    }

    public void notATest(){
        System.out.println("notATest");
    }

    //@Test
    private void privateTest(){
        System.out.println("privateTEst");
    }

    @After
    public void disableTest(){
        System.out.println("After" +x);
    }
}
