package org.tusharwaraddtsw.ex10_03062026;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium043_WebTableDynamicPractice {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);
    }

    @Test
    public void test_Dynamic_WebTable(){
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> row_table = table.findElements(By.tagName("tr"));
        for (int i = 0; i < row_table.size(); i++) {

            List<WebElement> col = row_table.get(i).findElements(By.tagName("td"));
            for (WebElement c:col) {
                System.out.println(c.getText());
            }
        }
    }

    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
