package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPage extends BasePage
{
    private final By tabsButton = By.cssSelector("[href='/windows']");
    private final By homeButton = By.cssSelector("#home");
    private final By multiWindowButton = By.cssSelector("#multi");

    public WindowPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickTabsButton()
    {
        click(tabsButton);
    }

    public void windowTitles()
    {
        click(homeButton);
        System.out.println(driver.getTitle());
        click(multiWindowButton);
        System.out.println(driver.getTitle());
    }

    public void closeWindows()
    {
        driver.close();
        driver.quit();
    }
}
