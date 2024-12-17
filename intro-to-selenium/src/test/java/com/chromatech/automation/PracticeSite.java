package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSite {

    public static void main(String[] args) {
        String url = "https://chromatechacademy.net/selenium-practice/";
        WebDriver driver = new FirefoxDriver();
        driver.get(url);

        // Locate element
        WebElement homeButton = driver.findElement(By.xpath("/html/body/header/div/button[2]"));
        if (homeButton == null) {
            System.out.println("Keep looking");
        } else {
            System.out.println("Found it");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
