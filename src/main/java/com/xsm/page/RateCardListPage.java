package com.xsm.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RateCardListPage extends ListPageLinks{
		//private WebDriver driver;

	    public RateCardListPage(WebDriver driver) {
	    	super(driver);
	        //this.driver = driver;
	        //PageFactory.initElements(driver, this);
	    	ratecardPage();
	    	System.out.println(celltable.getAttribute("__data_loadstate"));
	    	if (celltable.getAttribute("__data_loadstate")!="DONE"){
	    		    try {
						Thread.sleep(5000);
						System.out.println("sleep");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	    			System.out.println(celltable.getAttribute("__data_loadstate"));
	    			System.out.println("Good");
	    		}
	    }

	    @FindBy(how = How.XPATH, using = "id('gwt-debug-listRateCards-mainPanel')/div[1]/h1")
	    private WebElement head;
	    @FindBy(how = How.XPATH, using = "id('gwt-debug-entityPager')/span")
	    private WebElement number;
	    @FindBy(how = How.XPATH, using = "id('gwt-debug-listRateCards-mainPanel')/div[2]/div/div[2]/div[1]/table")
	    private WebElement celltable;
	    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-ListRateCards")
	    private WebElement rates;
	    @FindBy(how = How.XPATH, using = "id('gwt-debug-listRateCards-mainPanel')/div[2]/div/div[2]/div[1]/table/thead/tr/th[3]/div/div[2]")
	    private WebElement namecolumn;

	    public String getHead(){
	    	return getLists(head);
	    }

	    public String getNumber(){
	    	return getLists(number);
	    }
}
