package org.tusharwaraddtsw.ex12_18062026_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium059_JS_P1 {

    @Test
    public void test_Method() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement scroll_to_div = driver.findElement(By.xpath("//div[@id='userName']"));
        jse.executeScript("arguments[0].scrollIntoView();",scroll_to_div);

//        try{
//            Thread.sleep(3000);
//        } catch (RuntimeException e) {
//            throw new RuntimeException(e);
//        }

        Thread.sleep(5000);
        driver.quit();


    }
}
