package org.tusharwaraddtsw.ex11_08062026_Action_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium049Window_Practice {

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
        driver.get("https://the-internet.herokuapp.com/windows");

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for(String handle: windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("The Internet")){
                System.out.println("Passed");
                break;
            }
        }

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
