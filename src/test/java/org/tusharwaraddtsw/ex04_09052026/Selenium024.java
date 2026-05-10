package org.tusharwaraddtsw.ex04_09052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.spec.EdECPublicKeySpec;
import java.sql.Driver;
import java.time.Duration;
import static org.assertj.core.api.Assertions.*;

public class Selenium024 {

    @Test
    public void testMethod() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement emailInputBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));

        emailInputBox.sendKeys("augtest_040823@idrive.com");

        WebElement passwordInputBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))
        );
        passwordInputBox.sendKeys("123456");

        WebElement rememberMeCheckBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='id-checkmark']"))
        );
        rememberMeCheckBox.click();

        WebElement signInButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))
        );
        signInButton.click();

        WebElement msg = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[contains(text(), 'expired!')]"))
        );

        // Assertation
        Assert.assertEquals(msg.getText(),"Your free trial has expired!");

        assertThat(msg.getText()).isNotBlank().isNotNull().isNotEmpty().isEqualTo("Your free trial has expired!");

        Thread.sleep(5000);
        driver.quit();
    }
}