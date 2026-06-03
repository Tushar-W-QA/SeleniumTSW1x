package org.tusharwaraddtsw.ex10_03062026;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium039_WebTable {

    EdgeDriver driver;



    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("\"--guest\"");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);
    }

    @Test
    public void test_Web_table() {
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/webtable.html");


        // //table[@id='customers']/tbody/tr[2]/td[1]

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

        System.out.println(rows);
        System.out.println(cols);
        //table[@id='customers']/tbody/tr[2]/td[1]

        String firstPart = "//table[@id='customers']/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j<= cols; j++) {
                String dynamicPath = firstPart + i + secondPart + j + thirdPart;
                String fetchData = driver.findElement(By.xpath(dynamicPath)).getText();
                // System.out.println(fetchData);


                if(fetchData.contains("Helen Bennett")){
                    String countryPath = dynamicPath + "/following-sibling::td";
                    String companyPath = dynamicPath + "/preceding-sibling::td";

                    String countryText = driver.findElement(By.xpath(countryPath)).getText();
                    String companyText = driver.findElement(By.xpath(companyPath)).getText();

                    System.out.println("------------<><><><><><><><>------------");

                    System.out.println("Helen Bennett is working in " + companyText);
                    System.out.println("Helen Bennett is living in " + countryText);

                    break;

                }
            }
        }






    }

    @AfterTest
    public void afterCloseBrowser(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
