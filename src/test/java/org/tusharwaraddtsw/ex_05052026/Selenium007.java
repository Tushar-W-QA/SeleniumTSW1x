package org.tusharwaraddtsw.ex_05052026;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium007 {
    public static void main(String[] args) {
        EdgeDriver edgeDriver =  new EdgeDriver();
        edgeDriver.get("http://app.vwo.com");
        edgeDriver.quit();
    }
}

