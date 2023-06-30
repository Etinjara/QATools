package com.ne.base.util;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Assertions extends BasePage
{
    public Assertions(WebDriver driver)
    {
        super(driver);
    }

    public void assertEquals(By locator, String expected, String msg)
    {
        String actual = getText(locator);
        Assert.assertEquals(actual, expected, msg);
    }

    public void assertTrue(boolean condition)
    {
        Assert.assertTrue(condition);
    }
}
