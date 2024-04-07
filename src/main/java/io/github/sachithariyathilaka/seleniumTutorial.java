package io.github.sachithariyathilaka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Main class for the selenium tutorial application.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/07
 */
public class seleniumTutorial {

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
