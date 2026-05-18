package org.tusharwaraddtsw.ex07_18052026;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium034_SelectStatic {

    public static void main(String[] args) {
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://the-internet.herokuapp.com/dropdown");
        edgeDriver.manage().window().maximize();

        WebElement selectDropDown = edgeDriver.findElement(By.id("dropdown"));
        Select select = new Select(selectDropDown);
        // select.selectByVisibleText("Option 2");
        select.selectByIndex(2);



    }
}
