package org.tusharwaraddtsw.ex04_09052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium021_EbayWebSite {

    @Test
    public void test_Method() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.ebay.com/");

        // SearchInputBox
        WebElement searchInputBox = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchInputBox.sendKeys("MacMini");

        // SearchButton
        WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();

        // productList
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='s-card__title']"));

        // priceList
        List<WebElement>productPriceList = driver.findElements(By.xpath("//span[@class='su-styled-text primary bold large-1 s-card__price']"));


        int size = Math.min(productList.size(), productPriceList.size());

        for (int i=0; i < size; i++){

            System.out.println("Title: " + productList.get(i).getText() + "Price: " + productPriceList.get(i).getText());

        }

        Thread.sleep(5000);
        driver.quit();

    }
}
