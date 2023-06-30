package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage extends BasePage
{
    private final By aui5Button = By.cssSelector("[href='/slider']");
    private final By slider = By.cssSelector("[type='range']");
    private final By content = By.cssSelector(".has-text-primary-light");

    public SliderPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickAUI5Button()
    {
        click(aui5Button);
    }

    public void moveSlider()
    {
        WebElement wrdSlider = findElement(slider);
        Actions act = new Actions(driver);
        act.dragAndDropBy(wrdSlider, 30, 0);
    }

    public void contentValidation()
    {
        String countries = findElement(content).getText();
        System.out.println(countries);
    }
}
