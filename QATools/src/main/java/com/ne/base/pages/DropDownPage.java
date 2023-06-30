package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage extends BasePage
{
    private final By dropDownClick = By.cssSelector("[href='/dropdowns']");
    private final By fruitsDropDown = By.cssSelector("#fruits");
    private final By langDropDown = By.cssSelector("#lang");
    private final By countryDropDown = By.cssSelector("#country");


    public DropDownPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickDropDownButton()
    {
        click(dropDownClick);
    }

    public void selectFruit()
    {
        selectDropDownVisibleText(fruitsDropDown, "Apple");
    }

    public void multipleSelect()
    {
        //select multiple options
        Actions builder = new Actions(driver);
        WebElement select = driver.findElement(By.cssSelector("#superheros"));
        List<WebElement> options = select.findElements(By.cssSelector("#superheros"));

        System.out.println(options.size());
        Action selectMultiple =
                builder.keyDown(Keys.CONTROL).click(options.get(2)).click(options.get(4)).click(options.get(6)).build();

        selectMultiple.perform();
    }

    public void selectLang()
    {
        selectDropDownIndex(langDropDown, 4);

        //select all options
        WebElement selectElement = driver.findElement(langDropDown);
        Select select = new Select(selectElement);
        List<WebElement> allOptions = select.getOptions();

        System.out.println(allOptions);

    }

    public void selectCountry()
    {
        selectDropDownValue(countryDropDown, "India");

        //print selected option
        WebElement selectElement = driver.findElement(countryDropDown);
        Select select = new Select(selectElement);
        WebElement op = select.getFirstSelectedOption();
        System.out.println(op);
    }





}
