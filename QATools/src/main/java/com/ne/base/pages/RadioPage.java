package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioPage extends BasePage
{
    private final By toggleButton = By.cssSelector("[href='/radio']");
    private final By yesRB1 = By.cssSelector("#yes");
    private final By yesRB2 = By.cssSelector("#one");
    private final By noRB2 = By.cssSelector("#two");
    private final By yesRB3 = By.cssSelector("#nobug");
    private final By noRB3 = By.cssSelector("#bug");
    private final By fooButton = By.cssSelector("#foo");
    private final By barButton = By.cssSelector("#notfoo");
    private final By maybeButton = By.cssSelector("#maybe");
    private final By checkedCheckbox = By.cssSelector("[checked=''][type='checkbox']");
    private final By tcButton = By.cssSelector(".checkbox a");


    public RadioPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickToggleButton()
    {
        click(toggleButton);
    }

    public void clickAny()
    {
        click(yesRB1);
    }

    public void confirmOnlyOne()
    {
        click(yesRB2);
        click(noRB2);

        if(!driver.findElement(yesRB2).isSelected())
        {
            System.out.println("Ony one can be selected.");
        }
        else
        {
            System.out.println("Both can be selected.");
        }
    }

    public void findBug()
    {
        click(yesRB3);
        click(noRB3);

        if(!driver.findElement(yesRB3).isSelected())
        {
            System.out.println("Ony one can be selected.");
        }
        else
        {
            System.out.println("BUG: Both can be selected.");
        }
    }

    public void whichIsSelected()
    {
        if(driver.findElement(fooButton).isSelected())
        {
            System.out.println("Foo button selected.");
        }
        else if(driver.findElement(barButton).isSelected())
        {
            System.out.println("Bar button selected");
        }
    }

    public void confirmLastDisabled()
    {
        System.out.println("Button enabled: " + driver.findElement(maybeButton).isEnabled());
    }

    public void isCheckboxChecked()
    {
        System.out.println("Checkbox selected: " + driver.findElement(checkedCheckbox).isSelected());
    }

    public void acceptTC()
    {
        click(tcButton);
    }

}
