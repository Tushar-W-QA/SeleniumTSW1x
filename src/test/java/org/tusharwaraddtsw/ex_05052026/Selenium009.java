package org.tusharwaraddtsw.ex_05052026;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium009 {

    @Test
    public void test_Method() {
        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--headless");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("http://google.com");
        System.out.println(driver.getTitle()); // To check the respective URL is run or not in background

    }
}