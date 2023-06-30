package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputPage extends BasePage
{
    private final By inputEdit = By.cssSelector("[href='/edit']");
    private final By inputFullName = By.cssSelector("#fullName");
    private final By textAppendField = By.cssSelector("#join");
    private final By boxContent = By.cssSelector("#getMe");
    private final By boxToClear = By.cssSelector("#clearMe");
    private final By boxDisabled = By.cssSelector("#noEdit");
    private final By boxReadOnly = By.cssSelector("#dontwrite");

    public InputPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickEditButton()
    {
        click(inputEdit);
    }

    public void inputCredentials(String strFullName)
    {
        input(inputFullName, strFullName);
    }

    public void appendTextField()
    {
        System.out.println(getText(textAppendField));
    }

    public void textBoxContent(String attributeName)
    {
        getAttribute(boxContent, attributeName);
    }

    public void clearTextBox()
    {
        clear(boxToClear);
    }

    public void isFieldDisabled()
    {
        isElemDisabled(boxDisabled);
    }
}
