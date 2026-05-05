package org.tusharwaraddtsw.ex02_05052026;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium012_CloseVsQuit {

    @Test
    public void testMethod01() throws InterruptedException {

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.get("https://youtube.com");
        //Thread.sleep(6000);

        // closed - Closed only the current tab
        // session id != null
        // edgeDriver.close();

        // QUit - it closes the all tab with full browser
        // session id = null
        //edgeDriver.quit();

    }
}