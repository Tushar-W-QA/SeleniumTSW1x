package org.tusharwaraddtsw.ex08_22052026_SVG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium038_filpCart_SVG_searvh {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }

    @Test
    public void testFlipCartSearch(){


        driver.manage().window().maximize();
        String URL = "https://www.flipkart.com/";
        driver.get(URL);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement closeButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@role='button']"))
        );
        closeButton.click();

        // Enter the MacMini In SearchBox
        driver.findElement(By.name("q")).sendKeys("Mac");

        // Click on The Search ICON (SVG)
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(2).click();

        List<WebElement> titleResults = driver.findElements(By.cssSelector(".col > div:nth-child(1)"));
        for(WebElement title : titleResults){

            System.out.println(title.getText());


        }
    }


    @AfterTest
    public void closeBrowser() {

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }

}
