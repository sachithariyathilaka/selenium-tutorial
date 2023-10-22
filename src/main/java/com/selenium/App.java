package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class App {

    @Test
    public void MainTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:4200");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement username = driver.findElement(By.id("name"));
        username.sendKeys("Sachith Ariyathilaka");

        WebElement submitBtn = driver.findElement(By.id("submit-btn"));
        submitBtn.click();
    }
}
