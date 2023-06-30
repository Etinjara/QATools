package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class ButtonPage extends BasePage
{
    private final By clickButtons = By.cssSelector("[href='/buttons']");
    private final By homeButton = By.cssSelector("#home");
    private final By locationButton = By.cssSelector("#position");
    private final By cssButton = By.cssSelector("#color");
    private final By propertyButton = By.cssSelector("#property");
    private final By disabledButton = By.cssSelector("[disabled='']");
    private final By holdButton = By.cssSelector("h2");

    public ButtonPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickClickButton()
    {
        click(clickButtons);
    }

    public void clickHomeButton()
    {
        click(homeButton);
    }

    public void getLocation()
    {
        elemLocation(locationButton);
    }

    public void getElemColor()
    {
        WebElement t = findElement(cssButton);
        String s = t.getCssValue("color");
        String c = Color.fromString(s).asHex();
        System.out.println("The color is: " + s);
        System.out.println("Color in Hex: " + c);
    }

    public void getElemSize()
    {
        elemSize(propertyButton);
    }

    public void buttonDisabled()
    {
        isElemDisabled(disabledButton);
    }

    public void clickAndHold()
    {
        WebElement t = findElement(holdButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(t);
        actions.clickAndHold(t);
        actions.build().perform();
    }

}
