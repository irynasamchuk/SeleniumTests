package sample6_JUnitTest;

import org.junit.Ignore;
import org.junit.Test;

public class Test2 {
    @Test
    public void test12(){
        System.out.println("Test12");
    }

    @Test
    public void test22(){
        System.out.println("test22");
    }

    public void notATest2(){
        System.out.println("notATest2");
    }

    //@Test
    private void privateTest2(){
        System.out.println("privateTEst2");
    }

    @Test
    @Ignore
    public void disableTest2(){
        System.out.println("ignoreTest2");
    }
}
