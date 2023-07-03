package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jakel\\Desktop\\WebDrivers\\chromedriver.exe");

        //ChromeDriver - subclass of WebDRiver. used for testing web apps on Chrome (we also have Edge, Firefox, Safari, etc.)
        //Launches a blank browser of specified type
        WebDriver driver = new ChromeDriver();

        //Visit facebook home page **Requires http:// in address**
        driver.get("https://www.facebook.com");

        //maximize window
        driver.manage().window().maximize();

        //---> Login Testing <---

        //find email element
        WebElement email = driver.findElement(By.id("email"));

        //fill email field
        email.sendKeys("lawhornejake@gmail.com");

        //...wait
        Thread.sleep(2000);


        //find password element
        WebElement password = driver.findElement(By.id("pass"));

        //fill password field
        password.sendKeys("uattesting");

        //...wait
        Thread.sleep(2000);


        //click login button
        driver.findElement(By.name("login")).click();

        //---> End Login Testing <---




    }
}