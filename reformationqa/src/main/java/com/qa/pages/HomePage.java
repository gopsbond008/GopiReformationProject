package com.qa.pages;

import com.qa.pageobjectrepo.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;




public class HomePage extends PageObjectRepo {
        private static String BASE_URL = "https://www.thereformation.com/";
        private String TITLE = "Reformation";
        private static By NEWSLETTER = By.cssSelector("#first-visit-inputs h2");
        private static By NEWSLETTER_CLOSE = By.cssSelector("#first-visit-exit");


    public void navigateToHomepageAndVerify(){

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        Assert.assertEquals(TITLE, driver.getTitle());
        utils.waitForSeconds();
        if (action.getElementText(NEWSLETTER).contains("We’re on the e‑mail")){
            System.out.println("new letter visible");
            action.clickElement(NEWSLETTER_CLOSE);

        }else {
            System.out.println("news letter not displayed");
        }
    }

}
