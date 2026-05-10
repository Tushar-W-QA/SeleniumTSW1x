package org.tusharwaraddtsw.ex03_06052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium016 {

    //Open the URL https://app.vwo.com/#/login
    //Find the Email ? and enter the email as tushar@tushar.com
    //Find the Password inputbox** and enter password as admin.
    //Find and Click on the submit button
    //Verify that the error message is shown "Your email, password, IP address or location did not match"


    @Test
    public void test_Method1() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver =  new EdgeDriver(edgeOptions);
        driver.get("c");


        // Step-2: Find the Email ? and enter the email as admin@admin.com
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("tushar@tushar.com");


        // Step-3: Find the Password inputbox** and enter password as tushar
        //<input
        // type="password"
        // class="text-input W(100%)
        // Pend(36px)"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // placeholder="Enter password"
        // data-gtm-form-interact-field-id="1">

        WebElement passwordInputBox = driver.findElement(By.id("login-password"));
        passwordInputBox.sendKeys("tushar");

        // Step-3 Find and Click on the signIn button
         WebElement signInButton = driver.findElement(By.id("js-login-btn"));
         signInButton.click();

         // Step4 - Verify that the error message is shown "Your email, password, IP address or location did not match

        WebElement errorMessageForInvalidCredentials = driver.findElement(By.id("js-notification-box-msg"));
        //errorMessageForInvalidCredentials.getAttribute("Your email, password, IP address or location did not match");


        Assert.assertEquals(errorMessageForInvalidCredentials.getText().trim(), "Your email, password, IP address or location did not match");










        Thread.sleep(5000);
        driver.quit();


    }
}
