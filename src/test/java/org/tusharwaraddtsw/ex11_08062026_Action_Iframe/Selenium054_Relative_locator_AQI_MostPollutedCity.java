package org.tusharwaraddtsw.ex11_08062026_Action_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Selenium054_Relative_locator_AQI_MostPollutedCity {

    EdgeDriver driver;
    @BeforeTest
    public void openBrower() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        driver = new EdgeDriver(edgeOptions);

    }

    @Test
    public void testActionMethod() {

        driver.manage().window().maximize();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");

        WebElement searchInputBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        searchInputBox.sendKeys("India" + Keys.ENTER);

        List<WebElement> list_of_cities = driver.findElements(By.xpath("//div/div/a[@class='rw-g rw-p'][2]"));
        //System.out.println(list_of_cities);

        for (WebElement l : list_of_cities) {
            // System.out.println(l.getText());
            String s1 = driver.findElement(with(By.tagName("p")).toRightOf(l)).getText();
        }






    }


    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
