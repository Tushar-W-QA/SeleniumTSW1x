package org.tusharwaraddtsw.ex04_09052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium023 {

    @Test
    public void testMethod() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.idrive360.com/enterprise/login");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Username
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("username"))
        );


        username.sendKeys("augtest_040823@idrive.com");

        // Password
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("password"))
        );

        password.sendKeys("123456");

        // Remember Me
        WebElement rememberMe = wait.until(
                ExpectedConditions.elementToBeClickable(By.className("id-checkmark"))
        );

        rememberMe.click();

        // Sign In
        WebElement signInButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("frm-btn"))
        );

        signInButton.click();

        driver.quit();
    }
}