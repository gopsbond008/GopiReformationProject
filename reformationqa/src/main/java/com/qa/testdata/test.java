package com.qa.testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static WebDriver driver;
    public static String BASE_URL = "https://www.thereformation.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#first-visit-exit")).click();
        Thread.sleep(3000);
        String nl = driver.findElement(By.cssSelector("#first-visit-inputs h2")).getText();
        if (nl.contains("We’re on the e‑mail")){
            System.out.println("new letter visible");
            driver.findElement(By.cssSelector("#first-visit-exit")).click();

        }else {
            System.out.println("new letter not visible");
        }
        driver.findElement(By.cssSelector("a[href*='profile']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#at-signup-link")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name*='spree_user[email]']")).sendKeys("dsdsds@dsds.com");




      //  driver.close();
    }
}
