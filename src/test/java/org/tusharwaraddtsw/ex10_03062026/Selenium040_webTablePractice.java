package org.tusharwaraddtsw.ex10_03062026;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium040_webTablePractice {

    EdgeDriver edgeDriver;
    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--guest");
        edgeDriver = new EdgeDriver(edgeOptions);
    }
    @Test
    public void test_web_table(){
        edgeDriver.manage().window().maximize();
        edgeDriver.get("https://awesomeqa.com/webtable.html");

        // Xpath: //table[@id='customers']/tbody/tr[2]/td[2]
        String firstPart = "//table[@id='customers']/tbody/tr[";
        String secondPart = "]/td[";
        String thirdPart = "]";

        // dynamicXpath = firstPart + i + secondPart + j + thirdPart;

        int rows =  edgeDriver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int cols =  edgeDriver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
        System.out.println(rows);
        System.out.println(cols);

        for(int i = 2; i <= rows; i++){
            for(int j=1; j <= cols; j++){
                String dynamicXpath = firstPart + i + secondPart + j + thirdPart;
                String fullData = edgeDriver.findElement(By.xpath(dynamicXpath)).getText();
                System.out.println(fullData);


                if(fullData.contains("Roland Mendel")){
                    String companyPath1 = dynamicXpath + "/following-sibling::td";
                    String countryPath1 = dynamicXpath + "/preceding-sibling::td";

                    String companyText1 = edgeDriver.findElement(By.xpath(companyPath1)).getText();
                    String countryText1 = edgeDriver.findElement((By.xpath(countryPath1))).getText();

                    System.out.println("------------------<><><><><><><><><>------------------");
                    System.out.println("Roland Mendel is working in " + companyText1);
                    System.out.println("Roland Mendel is present in " + countryText1);

                    return;


                }

            }
        }

    }

    @AfterTest

    public void closeBrowser(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        edgeDriver.quit();
    }
}
