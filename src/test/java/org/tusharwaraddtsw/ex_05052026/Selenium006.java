package org.tusharwaraddtsw.ex_05052026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium006 {

    public static void main(String[] args) {
        WebDriver driver =  new FirefoxDriver();
        driver.get("http://app.vwo.com");
        driver.quit();
    }
}
