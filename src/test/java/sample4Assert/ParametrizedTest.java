package sample4Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ParametrizedTest {
    @Test(dataProvider = "users")
    public void test1(String user, String password){
        System.out.println(user + " ; " +password);
    }

    @DataProvider
    public Iterator<Object[]> users(){
        List<Object[]> data = new ArrayList<Object[]>();
        for (int i = 0; i < 10; i++){
            data.add(new Object[]{ generateRandomName(),
                    generateRandomPassword()});
        }
//        data.add(new Object[]{"admin", "admin"});
//        data.add(new Object[]{"guest", "guest"});
        return data.iterator();
    }

    private Object generateRandomPassword() {
        return "password" + new Random().nextInt();
    }

    private Object generateRandomName() {
        return "user" + new Random().nextInt();
    }
}
