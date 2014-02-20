package com.xsm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Login(String User, String Pwd){
    	WebElement email = driver.findElement(By.id("Email"));
    	email.clear();
    	email.sendKeys(User);
    	WebElement passwd = driver.findElement(By.id("Passwd"));
    	passwd.clear();
    	passwd.sendKeys(Pwd);
    	WebElement signin = driver.findElement(By.id("signIn"));
    	signin.click();    	
    }
}