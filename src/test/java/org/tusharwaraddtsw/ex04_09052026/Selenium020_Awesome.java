package org.tusharwaraddtsw.ex04_09052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Selenium020_Awesome {

    @Test
    public void test_Method1() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://awesomeqa.com/practice.html");

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Tushar");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Warad");

        // Check-box
        WebElement femaleCheckBox =  driver.findElement(By.id("sex-1"));
        femaleCheckBox.click();

        // yearCheckBox
        WebElement yearCheckBox = driver.findElement(By.id("exp-3"));
        yearCheckBox.click();

        // DateInputBox
        WebElement dateInputBox =  driver.findElement(By.id("datepicker"));
        dateInputBox.sendKeys("07-10-1994");

        // profile-checkBox
        WebElement profileCheckBox = driver.findElement(By.id("profession-1"));
        profileCheckBox.click();

        // toolCheckBox

        WebElement toolCheckBox = driver.findElement(By.id("tool-2"));
        toolCheckBox.click();

        // Button
        driver.findElement(By.className("btn-info")).click();

        Thread.sleep(3000);
        driver.quit();

    }
}
