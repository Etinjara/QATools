package com.ne.base.pages;

import com.beust.ah.A;
import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectPage extends BasePage
{
    private final By aui4Button = By.cssSelector("[href='/selectable']");
    private final By Selenium = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[1]/h3");
    private final By Protractor = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[2]/h3");
    private final By Appium = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[3]/h3");
    private final By TestNG = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[4]/h3");
    private final By Postman = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[5]/h3");
    private final By Cypress = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[6]/h3");
    private final By WebdriverIO = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[7]/h3");
    private final By TestprojectIO = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[8]/h3");
    private final By Letcode = By.xpath("/html/body/app-root/app-selectable/section[1]/div/div/div[1]/div/div/div/div/div[9]/h3");

    public MultiSelectPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickAUI4Button()
    {
        click(aui4Button);
    }

    public void selectAll()
    {
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).build().perform();
        act.moveToElement(findElement(Selenium)).click();
        act.moveToElement(findElement(Protractor)).click();
        act.moveToElement(findElement(Appium)).click();
        act.moveToElement(findElement(TestNG)).click();
        act.moveToElement(findElement(Postman)).click();
        act.moveToElement(findElement(Cypress)).click();
        act.moveToElement(findElement(WebdriverIO)).click();
        act.moveToElement(findElement(TestprojectIO)).click();
        act.moveToElement(findElement(Letcode)).click();
    }

}
