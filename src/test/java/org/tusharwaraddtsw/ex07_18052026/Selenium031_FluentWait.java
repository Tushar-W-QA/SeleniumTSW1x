package org.tusharwaraddtsw.ex07_18052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium031_FluentWait {

    @Test
    public void testMethod() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        driver.navigate().to("https://www.idrive360.com/enterprise/");
        System.out.println(driver.getTitle());

        WebElement emailTextBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))
        );
        emailTextBox.sendKeys("augtest_040823@idrive.com");

        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='password']"));
        passwordTextBox.sendKeys("123456");

        WebElement signInButton = driver.findElement(By.xpath("//button[@id ='frm-btn']"));
        signInButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("id-card-title")));
        WebElement msg = driver.findElement(By.className("id-card-title"));
        System.out.println(msg.getText());


        Assert.assertEquals(msg.getText(), "Your free trial has expired!");

        Thread.sleep(10000);
        driver.quit();







    }
}
