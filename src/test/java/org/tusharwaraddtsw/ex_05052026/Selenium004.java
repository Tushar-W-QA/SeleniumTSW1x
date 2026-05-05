package org.tusharwaraddtsw.ex_05052026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium004 {

    @Test
    public void test_selenium_dynamic(){


        WebDriver driver =  new FirefoxDriver();
        driver.get("http://app.vwo.com");
        driver.quit();
    }
}
