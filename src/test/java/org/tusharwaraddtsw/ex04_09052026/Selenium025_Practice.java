package org.tusharwaraddtsw.ex04_09052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium025_Practice {

    @Test
    public void test_Method() throws InterruptedException {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--incognito");
        firefoxOptions.addArguments("--start-maximized");
        //firefoxOptions.addArguments("--headless");

        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://www.idrive360.com/enterprise/login");
        System.out.println(driver.getTitle());


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));



        //Username input
        WebElement usernameInputBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']"))
        );
        usernameInputBox.sendKeys("augtest_040823@idrive.com");



        // Password
        WebElement passwordInputBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']"))
        );
        passwordInputBox.sendKeys("123456");

        // RememberMe

        WebElement rememberMeCheckBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='id-checkmark']"))
        );
        rememberMeCheckBox.click();

        //SignInButton
        WebElement signInButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='frm-btn']"))
        );
        signInButton.click();

        WebElement displayMessage = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'paid')]"))
        );
        System.out.println(displayMessage.getText());

        Assert.assertEquals(displayMessage.getText(),"Your free trial account has expired. To continue using the service, please choose one of our paid plans.");

        Thread.sleep(5000);
        driver.quit();


    }
}
