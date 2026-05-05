package org.tusharwaraddtsw.ex_05052026;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium001 {


    @Test
    public  void test_selenium(){

        EdgeDriver edgeDriver =  new EdgeDriver();
        edgeDriver.get("http://app.vwo.com");
    }
}
