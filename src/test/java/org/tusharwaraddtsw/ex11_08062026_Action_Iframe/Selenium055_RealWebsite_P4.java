package org.tusharwaraddtsw.ex11_08062026_Action_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium055_RealWebsite_P4 {

    EdgeDriver driver;
    @BeforeTest
    public void openBrower() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        driver = new EdgeDriver(edgeOptions);

    }

    @Test
    public void testActionMethod() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        Thread.sleep(15000);

        driver.switchTo().frame("result");

        WebElement submitButton = driver.findElement(By.xpath("//form[@id='form']/button"));
        submitButton.click();

        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement errorMessageElement = driver.findElement(with(By.tagName("small")).below(userName));
        System.out.println(errorMessageElement);

        String errorMessage = errorMessageElement.getText();
        Assert.assertTrue(errorMessageElement.isDisplayed());
        Assert.assertEquals(errorMessage,"Username must be at least 3 characters");







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
