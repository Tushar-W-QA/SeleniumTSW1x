package org.tusharwaraddtsw.ex11_08062026_Action_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium053_Relative_locator_P1 {

    EdgeDriver driver;
    @BeforeTest
    public void openBrower() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        driver = new EdgeDriver(edgeOptions);

    }

    @Test
    public void testActionMethod() {

        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement b1 = driver.findElement(By.xpath("//div[@dir=\"ltr\"]/div[14]/span"));

        driver.findElement(with(By.id("exp-4")).toRightOf(b1)).click();






    }


    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
