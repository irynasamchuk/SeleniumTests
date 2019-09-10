package sample6_JUnitTest;

import org.junit.Ignore;
import org.junit.Test;

public class Test1 {
    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    public void notATest(){
        System.out.println("notATest");
    }

    //@Test
    private void privateTest(){
        System.out.println("privateTEst");
    }

    @Test
    @Ignore
    public void disableTest(){
        System.out.println("ignoreTest");
    }
}
