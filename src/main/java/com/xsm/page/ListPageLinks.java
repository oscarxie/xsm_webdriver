package com.xsm.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.xsm.menu.Sales;

public class ListPageLinks{
	private WebDriver driver;

    public ListPageLinks(WebDriver driver) {
    	//super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
        new WebDriverWait(driver,200).until(ExpectedConditions.visibilityOf(catalogcelltable));
        //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    }

    @FindBy(how = How.XPATH, using = "id('gwt-debug-catalog-mainPanel')/div[1]/h1")
    private WebElement head;
    @FindBy(how = How.XPATH, using = "id('gwt-debug-entityPager')/span")
    private WebElement number;
    @FindBy(how = How.XPATH, using = "id('gwt-debug-catalogStandardView-mainPanel')/div/div/div[2]/div[1]/div/table")
    private WebElement catalogcelltable;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-Catalog")
    private WebElement catalog;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-ListProposals")
    private WebElement proposal;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_MY_PROPOSALS")
    private WebElement myproposals;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_ALL_PROPOSALS")
    private WebElement allproposals;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_STARRED")
    private WebElement starred;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_RECENTLY_VIEWED")
    private WebElement recentlyviewed;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_DRAFT")
    private WebElement draft;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_AWAITING_APPROVAL")
    private WebElement awaitingapproval;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_APPROVED")
    private WebElement senttotrafficking;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_REJECTED")
    private WebElement rejected;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_AWAITING_MY_APPROVAL")
    private WebElement awaitingmyapproval;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-child-LIST_PROPOSALS_ACTIVITY_ARCHIVED")
    private WebElement archived;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-ListProductTemplates")
    private WebElement pt;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-ListProducts")
    private WebElement products;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-ListRateCards")
    private WebElement rates;
    @FindBy(how = How.ID, using = "gwt-debug-sideNavigation-ListWorkflows")
    private WebElement workflows;

    public String getLists(WebElement we){
    	new WebDriverWait(driver,200).until(ExpectedConditions.visibilityOf(we));    	
    	return we.getText();
    }

    public void listsClick(WebElement we){
    	new WebDriverWait(driver,200).until(ExpectedConditions.visibilityOf(we));    	
    	we.click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getCatalog(){
    	return getLists(catalog);
    }

    public String getHead(){
    	return getLists(head);
    }

    public String getNumber(){
    	return getLists(number);
    }

    public String getProposal(){
    	return getLists(proposal);
    }

    public String getMyProposals(){
    	return getLists(myproposals);
    }

    public String getAllProposals(){
    	return getLists(allproposals);
    }

    public String getStarred(){
    	return getLists(starred);
    }

    public String getRecentlyViewed(){
    	return getLists(recentlyviewed);
    }

    public String getDraft(){
    	return getLists(draft);
    }

    public String getAwaitingApproval(){
    	return getLists(awaitingapproval);
    }

    public String getSentToTrafficking(){
    	return getLists(senttotrafficking);
    }

    public String getRejected(){
    	return getLists(rejected);
    }

    public String getAwaitingMyApproval(){
    	return getLists(awaitingmyapproval);
    }

    public String getArchived(){
    	return getLists(archived);
    }

    public String getPT(){
    	return getLists(pt);
    }

    public String getProducts(){
    	return getLists(products);
    }

    public String getRates(){
    	return getLists(rates);
    }

    public String getWorkflows(){
    	return getLists(workflows);
    }

    public void catalogPage(){
    	listsClick(catalog);
    }

    public void proposalPage(){
    	listsClick(proposal);
    }

    public void ratecardPage(){
    	listsClick(rates);
    }
}

