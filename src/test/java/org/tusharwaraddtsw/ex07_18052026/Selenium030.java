package org.tusharwaraddtsw.ex07_18052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium030 {

    @Test
    public void testMethod(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver =  new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

        WebElement inputEmailBox = driver.findElement(By.xpath("//input[@type='email']"));
        inputEmailBox.sendKeys("dedjhed");

        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='login-password']"));
        passwordBox.sendKeys("dhgdh");

        WebElement signInButton = driver.findElement(By.xpath("//button[@id='js-login-btn']"));
        signInButton.click();



        WebElement errorMsg = driver.findElement(By.xpath("//div[@id='js-notification-box-msg']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(errorMsg));
        wait.until(ExpectedConditions.textToBePresentInElement( errorMsg,"Your email, password, IP address or location did not match"));


    }
}
