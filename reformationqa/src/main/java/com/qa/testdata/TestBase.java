package com.qa.testdata;

import com.qa.pageobjectrepo.PageObjectRepo;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class TestBase extends PageObjectRepo {
    public static WebDriver driver;
    Properties properties = new Properties();
      @Before
       public void initializeTest() {
        try {
            properties.load(new FileInputStream("C:\\Projects\\reformationqa\\src\\main\\java\\com\\qa\\config\\config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browserName = properties.getProperty("browser");
        if (browserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println(properties.getProperty("browser"));
        } else if (browserName.equals("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
           System.out.println(properties.getProperty("browser"));
           driver.get(properties.getProperty("url"));
//           utils.waitForSeconds();
           driver.manage().window().maximize();
           driver.manage().deleteAllCookies();


    }
    @After
    public void closeTest(){
          driver.close();

    }

}
