package org.tusharwaraddtsw.ex03_06052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium018_FreeTrial {

    @Test
    public void test_Method1() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial/");

//        WebElement freeTrialHyperLink = driver.findElement(By.linkText("Privacy policy"));
//        freeTrialHyperLink.click();

        // <input
        // class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email" required="">
        WebElement emailInputBox= driver.findElement(By.id("page-v1-step1-email"));
        emailInputBox.sendKeys("jdshsuerw");


        // <input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true"
        // data-qa="page-free-trial-step1-gdpr-consent-checkbox">

//        driver.findElement(By.partialLinkText("FREE TRIAL")).click();
//

        WebElement checkBox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkBox.click();

        // <button
        // type="submit"
        // disabled=""
        // class="button
        // button--disabled-primary W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit">Create a Free Trial Account</button>

        List <WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();

        WebElement error_Message =  driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_Message.getText(), "The email address you entered is incorrect.");
        Thread.sleep(3000);
        driver.quit();
    }
}