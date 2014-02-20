package com.xsm.webdriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.xsm.menu.Sales;
import com.xsm.page.RateCardListPage;

public class RateCardListPageTest {
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
    public void ratecardlistpageTest() {
    	RateCardListPage r = new RateCardListPage(driver);
    	assertTrue(r.getHead().contains("Rates"));
    	System.out.println(r.getNumber());
    	assertFalse(r.getNumber().contains("1-1 over 0"));

    }
}
