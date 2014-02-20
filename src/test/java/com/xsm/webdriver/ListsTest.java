package com.xsm.webdriver;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.xsm.menu.Sales;
import com.xsm.page.ListPageLinks;

public class ListsTest{
	private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        new Sales(driver);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void listsTest() {
    	ListPageLinks l = new ListPageLinks(driver);
        assertTrue(l.getCatalog().contains("Catalog"));
        assertTrue(l.getProposal().contains("Proposals"));
        assertTrue(l.getMyProposals().contains("My proposals"));
        assertTrue(l.getAllProposals().contains("All proposals"));
        assertTrue(l.getStarred().contains("Starred"));
        assertTrue(l.getRecentlyViewed().contains("Recently viewed"));
        assertTrue(l.getDraft().contains("Draft"));
        assertTrue(l.getAwaitingApproval().contains("Awaiting approval"));
        assertTrue(l.getSentToTrafficking().contains("Sent to trafficking"));
        assertTrue(l.getRejected().contains("Rejected"));
        assertTrue(l.getAwaitingMyApproval().contains("Awaiting my approval"));
        assertTrue(l.getArchived().contains("Archived"));
        assertTrue(l.getPT().contains("Product templates"));
        assertTrue(l.getProducts().contains("Products"));
        assertTrue(l.getRates().contains("Rates"));
        assertTrue(l.getWorkflows().contains("Workflows"));
    }

    @Test
    public void catalogTest(){
    	ListPageLinks l= new ListPageLinks(driver);
    	assertTrue(l.getHead().contains("Catalog"));
    	assertFalse(l.getNumber().contains("1-1 over 0"));
    	System.out.println(l.getNumber());
    } 
}
