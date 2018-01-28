package com.qa.utils;

import com.qa.pageobjectrepo.PageObjectRepo;

import java.util.concurrent.TimeUnit;

public class TestUtils extends PageObjectRepo {

    public void waitForSeconds(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
