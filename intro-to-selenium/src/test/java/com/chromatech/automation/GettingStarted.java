package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingStarted {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://chroma.mexil.it/site/login");

        driver.findElement(By.id("form-username")).sendKeys("test@example.com");
        driver.findElement(By.id("form-password")).sendKeys("12345");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
