package org.tusharwaraddtsw.ex11_08062026_Action_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class Selenium050_File_Upload {

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
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement uploadFileButton = driver.findElement(By.xpath("//input[@id=\"fileToUpload\"]"));

        uploadFileButton.sendKeys("C:\\Users\\hp\\IdeaProjects\\untitled\\src\\test\\java\\org\\tusharwaraddtsw\\ex11_08062026_Action_Iframe\\File.txt");
        driver.findElement(By.name("submit")).click();





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
