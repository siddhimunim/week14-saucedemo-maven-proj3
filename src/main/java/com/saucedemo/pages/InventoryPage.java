package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventoryPage extends Utility {

    By verifyProduct = By.xpath("//span[contains(text(),'Products')]");
    By verifyListOfProduct =By.xpath("//div[@class='inventory_item']");




    public String verifyProduct(){
        return getTextFromElement(verifyProduct);
    }
    public int verifyListPro() {

        return driver.findElements(verifyListOfProduct).size();


    }
    }

