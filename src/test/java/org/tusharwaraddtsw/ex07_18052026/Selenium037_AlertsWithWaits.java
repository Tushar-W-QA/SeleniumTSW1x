package org.tusharwaraddtsw.ex07_18052026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Selenium037_AlertsWithWaits {
    public static void main(String[] args) {


        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(edgeDriver.getTitle());






        WebElement clickJsPrompts = edgeDriver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        clickJsPrompts.click();

        WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = edgeDriver.switchTo().alert();
         //alert.sendKeys("Tushar");
         //alert.accept();
         alert.dismiss();



        String result = edgeDriver.findElement(By.xpath("//p[@id='result']")).getText();

        System.out.println(result);
        //Assert.assertEquals(result, "You entered: Tushar");
        Assert.assertEquals(result, "You entered: null");
    }
}
