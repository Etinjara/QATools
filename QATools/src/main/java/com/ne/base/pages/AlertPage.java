package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage
{
    private final By dialogButton = By.cssSelector("[href='/alert']");
    private final By simpleAlert = By.cssSelector("#accept");
    private final By confirmAlert = By.cssSelector("#confirm");
    private final By promptAlert = By.cssSelector("#prompt");

    public AlertPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickDialogButton()
    {
        click(dialogButton);
    }

    public void acceptAlert()
    {
        click(simpleAlert);
        driver.switchTo().alert().accept();

    }

    public void dismissAlert()
    {
        click(confirmAlert);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }

    public void writeAndAcceptAlert()
    {
        click(promptAlert);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Nikola");
        alert.accept();
    }

}
