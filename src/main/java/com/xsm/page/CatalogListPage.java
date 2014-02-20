package com.xsm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogListPage extends ListPageLinks{
	private WebDriver driver;

    public CatalogListPage(WebDriver driver) {
    	super(driver);
        //this.driver = driver;
        //PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "id('gwt-debug-catalog-mainPanel')/div[1]/h1")
    private WebElement head;
    @FindBy(how = How.XPATH, using = "id('gwt-debug-entityPager')/span")
    private WebElement number;
    @FindBy(how = How.XPATH, using = "id('gwt-debug-catalogStandardView-mainPanel')/div/div/div[2]/div[1]/div/table")
    private WebElement catalogcelltable;

    public String getHead(){
    	return getLists(head);
    }

    public String getNumber(){
    	//new WebDriverWait(driver,300).until(ExpectedConditions.visibilityOf(head));
    	new WebDriverWait(driver,300).until(ExpectedConditions.visibilityOf(catalogcelltable));
    	return getLists(number);
    }
}
