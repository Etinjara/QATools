package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragPage extends BasePage
{
    private final By aui1Button = By.cssSelector("[href='/draggable']");
    private final By draggable = By.cssSelector("[style='transform: translate3d(-2px, -2px, 0px);']");
    private final By dragTo = By.cssSelector(".example-boundary");

    public DragPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickAUI1Button()
    {
        click(aui1Button);
    }

    public void dragObject()
    {
        WebElement elem1 = driver.findElement(draggable);
        WebElement elem2 = driver.findElement(dragTo);
        Actions act = new Actions(driver);
        act.dragAndDrop(elem1, elem2).build().perform();
    }

}
