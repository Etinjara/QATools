package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class WaitsPage extends BasePage
{
    private final By timeoutButton = By.cssSelector("[href='/waits']");

    public WaitsPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickTimeoutButton()
    {
        click(timeoutButton);
    }

    public boolean isAlertPresent()
    {
        boolean presentFlag = false;

        try{
            Alert alert = driver.switchTo().alert();
            presentFlag = true;
            alert.accept();
        }catch(NoAlertPresentException ex){
            ex.printStackTrace();
    }
        return presentFlag;
    }
}
