package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropPage extends BasePage
{
    private final By aui2Button = By.cssSelector("[href='/dropable']");
    private final By from = By.cssSelector("[style='position: relative;']");
    private final By to = By.cssSelector(".ui-widget-header");

    public DropPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickAUI2Button()
    {
        click(aui2Button);
    }

    public void dragAndDropElems()
    {
        WebElement elem1 = driver.findElement(from);
        WebElement elem2 = driver.findElement(to);
        Actions act = new Actions(driver);
        act.dragAndDrop(elem1, elem2).build().perform();
    }

}
