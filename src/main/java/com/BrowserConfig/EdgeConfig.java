package com.BrowserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeConfig {
    public static WebDriver driver;

    public static void main(String[] args) {

        launch_Edge();
    }
    public static void launch_Edge(){
    System.setProperty("webdriver.edge.driver","./src/main/resources/msedgedriver.exe");
    driver=new EdgeDriver();
    }
}
