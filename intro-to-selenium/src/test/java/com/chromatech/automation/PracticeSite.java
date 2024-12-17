package com.chromatech.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSite {

    public static void main(String[] args) {
        // Navigate to website
        String url = "https://chromatechacademy.net/selenium-practice/";
        WebDriver driver = new FirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.get(url);

        // Locate drop down button
        WebElement dropDownButtonElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/div/button"));
        dropDownButtonElement.click();
        
        // Select option 2
        WebElement option2Element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/div/div/label[2]/input"));
        option2Element.click();
        dropDownButtonElement.click();
        
        // Select JQuery
        WebElement jQueryElement = driver.findElement(By.cssSelector("[value='Jquery']"));
        jQueryElement.click();
        
        // Select Java
        WebElement javaElement = driver.findElement(By.cssSelector("[value='Java']"));
        javaElement.click();
        
        // Locate DropDown Multi-Select Element
        WebElement multiSelecElement = driver.findElement(By.xpath("/html/body/div[1]/div[3]/fieldset/div/div[1]/input"));
        multiSelecElement.click();
        
        // Select Java
        // WebElement javaMultiSelectElement =
        // driver.findElement(By.cssSelector("[aria-activedescendant='choices--choices-multiple-remove-button-item-choice-7']"));
        // javaMultiSelectElement.click();
        
        // Select JQuery
        // WebElement jQueryMultiSelectElement =
        // driver.findElement(By.cssSelector("[aria-activedescendant='choices--choices-multiple-remove-button-item-choice-9']"));
        // jQueryMultiSelectElement.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
