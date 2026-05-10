package org.tusharwaraddtsw.ex03_06052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium017_HyperLinkTest {


    //Open the URL https://app.vwo.com/#/login

    //Verify that the policy hyperlink and it should open

    // <a Open Tag
    // href="https://vwo.com/privacy-policy/?utm_medium=app&amp;utm_source=login-page&amp;utm_campaign=legal_privacy_login"
    // class="btn btn--link btn--primary Fw(medium)"
    // target="_blank" rel="noreferrer"
    // vwo-html-translate="login:privacyPolicy"
    // data-qa="zecuyopefe">Privacy policy
    // </a> Closed Tag

    // Selenium provides the two more function
    // 1. Link text: Full Match
    // 2. Partial Text : Partial Match

    // Note : This two function works with only anchor tag [<a]

    @Test
    public void test_Method1() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");

//        WebElement freeTrialHyperLink = driver.findElement(By.linkText("Privacy policy"));
//        freeTrialHyperLink.click();

        driver.findElement(By.partialLinkText("FREE TRIAL")).click();

        Thread.sleep(3000);
        driver.quit();




    }
}