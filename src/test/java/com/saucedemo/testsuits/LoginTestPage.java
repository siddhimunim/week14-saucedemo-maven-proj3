package com.saucedemo.testsuits;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTestPage extends BaseTest {
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();




    @Test
    public void  userSholdLoginSuccessfullyWithValidCreditials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        String expText= "PRODUCTS";
        String actText = inventoryPage.verifyProduct();
        Assert.assertEquals(actText,expText,"Not Verify products");
    }
    @Test
    public void  verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLogin();
        int expText1 = 6;
        int actText1 = inventoryPage.verifyListPro();
        Assert.assertEquals(actText1,expText1,"Not verify");
        System.out.println("Total Product" + actText1);


    }
}
