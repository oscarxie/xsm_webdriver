package com.xsm.menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.xsm.page.LoginPage;

public class Sales {
	private WebDriver driver;
    private final String url = "";
	private final String email="";
	private final String passwd="";
    
    public Sales(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
        LoginPage lg= new LoginPage(driver);
        lg.Login(email, passwd);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getContent() {
        return driver.getPageSource();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/a")
    WebElement menu;

    public String getMenu(){
    	new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(menu));
    	return menu.getText();
    }
}
