package org.tusharwaraddtsw.ex02_05052026;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium010_extensionByUsingEdgeOption {

    @Test
    public void test_Method(){

        EdgeOptions edgeOptions =  new EdgeOptions();
        edgeOptions.addArguments("--load-extension=C:\\Users\\hp\\IdeaProjects\\untitled\\src\\test\\java\\org\\tusharwaraddtsw\\AdBlock");

        EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://youtube.com");

    }
}
