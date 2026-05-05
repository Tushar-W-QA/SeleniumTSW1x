package org.tusharwaraddtsw.ex02_05052026;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class Selenium014_VerifyTheStringInPage {

    @Test
    public void test_Method() throws Exception {

        // open the URL https://katalon-demo-cura.herokuapp.com/
        // Verify the search string and title in page source
        // Add the assertion to CURA Healthcare service is visible in the page source.

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        // Alternate way to maximize the window
        // driver.manage().window().maximize();

        // TestNG Assertion
        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        // AssertJ
        assertThat(driver.getTitle()).isNotEmpty().isNotNull().isNotBlank();
        assertThat(driver.getTitle()).isEqualTo("CURA Healthcare Service");
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/");


        if(driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
        } else {
            throw new Exception("Header is not expected");
        }
        driver.quit();
    }
}
