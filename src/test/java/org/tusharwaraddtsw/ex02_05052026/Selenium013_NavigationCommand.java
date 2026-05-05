package org.tusharwaraddtsw.ex02_05052026;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium013_NavigationCommand {

    @Test
    public void test_Method(){

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://youtube.com");
        edgeDriver.navigate().refresh();

        edgeDriver.navigate().to("https://google.com");
        edgeDriver.navigate().back();
        edgeDriver.navigate().forward();
        ;
        System.out.println(edgeDriver.getTitle());

    }

}
