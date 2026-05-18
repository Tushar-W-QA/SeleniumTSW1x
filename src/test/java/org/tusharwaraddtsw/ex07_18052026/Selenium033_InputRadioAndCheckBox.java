package org.tusharwaraddtsw.ex07_18052026;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium033_InputRadioAndCheckBox {

    public static void main(String[] args) {
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://awesomeqa.com/practice.html");

        edgeDriver.findElement(By.name("firstname")).sendKeys("Tushar");
        edgeDriver.findElement(By.name("lastname")).sendKeys("Warad");

        edgeDriver.findElement(By.id("sex-0")).click();
        edgeDriver.findElement(By.id("tool-0")).click();

    }
}
