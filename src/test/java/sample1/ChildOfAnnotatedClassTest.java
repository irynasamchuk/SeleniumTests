package sample1;

import com.sun.javaws.exceptions.ErrorCodeResponseException;
import org.testng.annotations.Test;

public class ChildOfAnnotatedClassTest{
    @Test(dependsOnMethods = "child2", alwaysRun = true)
    public void child(){
        System.out.println("Hello");
    }

    @Test()
    public void child2(){
        System.out.println("Priority1");
        throw new Error();
    }
}
