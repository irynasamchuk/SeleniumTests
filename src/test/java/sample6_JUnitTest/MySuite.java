package sample6_JUnitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test1.class,
        Test2.class
})
public class MySuite {
}
