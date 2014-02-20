package com.xsm.webdriver;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.xsm.menu.Sales;

public class SalesTest {
	private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void salesTest() {
        Sales s = new Sales(driver);
        assertTrue(s.getTitle().contains(""));
        assertTrue(s.getMenu().contains("Sales (Beta)"));
    }
}
