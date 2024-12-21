package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingStarted {
    
    public static void main(String[] args) {
        WebDriver firefox = new FirefoxDriver();
        String url = "https://chromatechacademy.net/selenium-practice/";
        firefox.manage().deleteAllCookies();
        firefox.get(url);

        // Click 'Bootstrap multi-select drop-down example'
        firefox.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/div/button")).click();
        firefox.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        firefox.findElement(By.xpath("/html/body/div[1]/div[2]/fieldset/select/option[1]")).click();
        firefox.findElement(By.xpath("//option[@value='Jquery']")).click();
        
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        firefox.quit();
    }
}
