package org.tusharwaraddtsw.ex06_14052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium026 {

    @Test
    public void testMethod1() {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--start-maximized");

        WebDriver driver = new FirefoxDriver(firefoxOptions);

        driver.get("https://www.ebay.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        WebElement searchInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("gh-ac"))
        );

        searchInput.sendKeys("Mac Mini");

        WebElement searchButton = driver.findElement(By.id("gh-search-btn"));
        searchButton.click();

        List<WebElement> products = wait.until(
                ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//span[@role='heading']")
                )
        );

        System.out.println(products.size());

        for (WebElement product : products) {

            String text = product.getText();

            if (!text.isEmpty()) {

                System.out.println(text);
            }
        }

        driver.quit();
    }
}