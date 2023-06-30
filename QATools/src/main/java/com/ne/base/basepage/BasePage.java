package com.ne.base.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BasePage
{
    protected static WebDriver driver;

    public BasePage (WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement findElement (By locator)
    {
        return driver.findElement(locator);
    }

    public List<WebElement> findElements (By locator)
    {
        return (List<WebElement>) driver.findElements(locator);
    }

    public void input (By locator, String inputValue)
    {
        WebElement element = findElement(locator);
        element.clear();
        element.click();
        element.sendKeys(inputValue);
    }

    public void click (By locator)
    {
        WebElement element = findElement(locator);
        element.click();
    }

    public void navigateTo ()
    {
        driver.get("https://letcode.in/test");
    }

    public void selectDropDownValue (By locator, String value)
    {
        new Select(driver.findElement(locator)).selectByValue(value);
    }

    public void selectDropDownIndex (By locator, int index)
    {
        new Select(driver.findElement(locator)).selectByIndex(index);
    }

    public void selectDropDownVisibleText (By locator, String text)
    {
        new Select(driver.findElement(locator)).selectByVisibleText(text);
    }

    public void getAttribute(By locator, String attribute)
    {
        WebElement element = findElement(locator);
        element.getAttribute(attribute);
    }

    public String getText (By locator)
    {
        return driver.findElement(locator).getText();
    }

    public boolean isElemPresent (By locator)
    {
        return driver.findElements(locator).size() != 0;
    }

    public void clear (By locator)
    {
        WebElement element = findElement(locator);
        element.clear();
    }

    public void isElemDisabled(By locator)
    {
        WebElement element = findElement(locator);
        element.isEnabled();
    }

    public void elemLocation (By locator)
    {
        WebElement element = findElement(locator);
        System.out.println(element.getLocation().getX());
        System.out.println(element.getLocation().getY());
    }

    public void elemColor (By locator)
    {
        WebElement element = findElement(locator);

    }

    public void elemSize (By locator)
    {
        WebElement element = findElement(locator);
        System.out.println(element.getSize().getHeight());
        System.out.println(element.getSize().getWidth());
    }

}
