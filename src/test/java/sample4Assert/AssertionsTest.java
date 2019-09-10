package sample4Assert;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsTest {
    @Test
    public void testAssertKeyword(){
        assert 2 * 2 == 5;
    }

    @Test
    public void testAssertJUnit(){
        AssertJUnit.assertEquals(5, 2 * 2);
    }

    @Test
    public void testAssertTestNG(){
        Assert.assertEquals(2 * 2, 5);
    }

    @Test
    public void SoftAssert(){
        SoftAssert s = new SoftAssert();
        s.assertEquals(2 * 2, 4, "three");
        s.assertEquals(2 * 2, 5, "four");
        s.assertAll();
    }
}
