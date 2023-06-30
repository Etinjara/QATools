package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShadowPage extends BasePage
{
    private final By btnDOM = By.cssSelector("[href='/shadow']");
    private final By firstName = By.xpath("//*[@id=\"fname\"]");
    private final By lastName = By.xpath("//*[@id=\"lname\"]");

    public ShadowPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickDOMButton()
    {
        click(btnDOM);
    }

    public void inputFirstName()
    {
        findElement(firstName).sendKeys("Nikola");
    }

    public void inputLastName()
    {
        findElement(lastName).sendKeys("Etinski");
    }

    public void inputEmail()
    {

    }
}
