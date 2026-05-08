package org.tusharwaraddtsw.ex_06052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Selenium019_Katalon {


    @Test
    public void test_Method1() throws InterruptedException {

        ChromeOptions chromeOptions =  new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");

        WebDriver chromeDriver = new ChromeDriver(chromeOptions);
        chromeDriver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement makeAppointment = chromeDriver.findElement(By.id("btn-make-appointment"));
        makeAppointment.click();

        // chromeDriver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");

        // Username
        //<input type="text"
        // class="form-control"
        // id="txt-username"
        // name="username"
        // placeholder="Username"
        // value=""
        // autocomplete="off">

        Assert.assertEquals(chromeDriver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement userNameInputBox = chromeDriver.findElement(By.id("txt-username"));
        userNameInputBox.sendKeys("TusharWarad");

        //Password
        WebElement passwordInputBox = chromeDriver.findElement(By.id("txt-password"));
        passwordInputBox.sendKeys("Tushar");

        // Login button
        WebElement loginButton = chromeDriver.findElement(By.id("btn-login"));
        loginButton.click();

        // Error Message
        WebElement error_Message = chromeDriver.findElement(By.className("text-danger"));
        Assert.assertEquals(error_Message.getText(), "Login failed! Please ensure the username and password are valid.");
        assertThat(error_Message.getText()).isNotEmpty().isNotBlank().isNotNull().isEqualTo("Login failed! Please ensure the username and password are valid.");

        Thread.sleep(3000);
        chromeDriver.quit();

    }
}
