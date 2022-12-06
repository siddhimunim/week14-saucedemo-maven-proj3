package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //store locators
    By userName = By.id("user-name");
    By password = By.id("password");
    By loginLink = By.id("login-button");


    public void enterUserName(String name) {
        sendTextToElement(userName, name);
    }

    public void enterPassword(String password1) {
        sendTextToElement(password, password1);
    }

    public void clickOnLogin() {
        clickOnElement(loginLink);
    }


}

