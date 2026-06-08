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

public class Selenium042_webTableDynamic {

    EdgeDriver edgeDriver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--guest");
        edgeDriver = new EdgeDriver(edgeOptions);
    }
    @Test
    public void test_web_table(){
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://awesomeqa.com/webtable1.html");


        WebElement table = edgeDriver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rowsTable = table.findElements(By.tagName("tr"));
        for (int i = 0; i < rowsTable.size(); i++) {
            List<WebElement> colsTable = rowsTable.get(i).findElements(By.tagName("td"));
            for(WebElement c : colsTable){
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
        edgeDriver.quit();
    }
}
