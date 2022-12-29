package com.cydeo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {

    public static void main(String[] args) {


        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/Users/User/Desktop/chromedriver");


        WebDriver driver = new ChromeDriver();

  driver.get("https://www.google.com");

    }
}
