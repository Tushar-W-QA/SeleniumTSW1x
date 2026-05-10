package org.tusharwaraddtsw.ex04_09052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium022_idriveWebsite {

    @Test
    public void testMethod () throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver webDriver = new EdgeDriver(edgeOptions);
        webDriver.get("https://www.idrive360.com/enterprise/login");

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));

        //Email
        WebElement emailInputBox = webDriver.findElement(By.xpath("//input[@id='username']"));
        emailInputBox.sendKeys("augtest_040823@idrive.com");

        // Password
        WebElement passwordInputBox = webDriver.findElement(By.xpath("//input[@id='password']"));
         passwordInputBox.sendKeys("123456");

         // CheckBox - RememberMe
        WebElement  rememberMeCheckBox = webDriver.findElement(By.xpath("//span[@class='id-checkmark']"));
        rememberMeCheckBox.click();

        // SignIn Button
        WebElement signInButton = webDriver.findElement(By.xpath("//button[@id='frm-btn']"));
        signInButton.click();

        Thread.sleep(4000);
        webDriver.quit();

    }
}
