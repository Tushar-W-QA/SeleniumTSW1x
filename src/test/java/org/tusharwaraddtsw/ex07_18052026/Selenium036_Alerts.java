package org.tusharwaraddtsw.ex07_18052026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.sql.Struct;

public class Selenium036_Alerts {
    public static void main(String[] args) {


        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(edgeDriver.getTitle());

//        WebElement clickJsAlerts = edgeDriver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
//        clickJsAlerts.click();
//        Alert alert = edgeDriver.switchTo().alert();
//        alert.accept();
//
//        String result = edgeDriver.findElement(By.xpath("//p[@id='result']")).getText();
//
//        System.out.println(result);
//        Assert.assertEquals(result, "You successfully clicked an alert");


//        WebElement clickJsConfirm = edgeDriver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
//        clickJsConfirm.click();
//        Alert alert = edgeDriver.switchTo().alert();
//        alert.accept();
//        // alert.dismiss();
//
//        String result = edgeDriver.findElement(By.xpath("//p[@id='result']")).getText();
//
//        System.out.println(result);
//        Assert.assertEquals(result, "You clicked: Ok");
//        //Assert.assertEquals(result, "You clicked: Cancel");


        WebElement clickJsPrompts = edgeDriver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        clickJsPrompts.click();
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
