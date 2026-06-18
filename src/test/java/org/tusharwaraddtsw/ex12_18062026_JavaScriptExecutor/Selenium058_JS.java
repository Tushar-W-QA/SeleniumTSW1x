package org.tusharwaraddtsw.ex12_18062026_JavaScriptExecutor;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium058_JS {

    @Test
    public void test_Method() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500);");


        String url = jse.executeScript("return document.URL").toString();
        System.out.println(url);

        String title = jse.executeScript("return document.title;").toString();
        System.out.println(title);

//        try{
//            Thread.sleep(3000);
//        } catch (RuntimeException e) {
//            throw new RuntimeException(e);
//        }

        Thread.sleep(5000);
        driver.quit();


    }
}
