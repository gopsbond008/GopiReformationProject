package com.qa.actions;

import com.qa.pageobjectrepo.PageObjectRepo;
import org.openqa.selenium.By;

public class ActionsClass extends PageObjectRepo{

    public void clickElement(By element){
        driver.findElement(element).click();
    }

    public void sendKeysToElement(By element, String keysToSend ){
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(keysToSend);
    }

    public String getElementText(By element){
        return driver.findElement(element).getText();
    }

    public void getElementAttribute(By element, String attribute){
        driver.findElement(element).getAttribute(attribute);
    }

    public void getElementSize(By element){
        driver.findElement(element).getSize();
    }

    public void getElements(By element, int index){
        driver.findElements(element).get(index).click();
    }
}
