package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ElementsPage extends BasePage
{
    private final By findElemButton = By.cssSelector("[href='/elements']");
    private final By userNameSrc = By.cssSelector("[name='username']");
    private final By avatar = By.cssSelector("[src='https://avatars.githubusercontent.com/u/445742?v=4']");
    private final By userName = By.cssSelector(".is-4.title");
    private final By from = By.cssSelector(".subtitle");
    private final By publicRepos = By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/app-usercard/div/div/div[2]/div/div[1]/div/span[2]");
    private final By publicGist = By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/app-usercard/div/div/div[2]/div/div[2]/div/span[2]");
    private final By followers = By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/app-usercard/div/div/div[2]/div/div[3]/div/span[2]");
    private final By linkList = By.cssSelector("[_ngcontent-serverapp-c51=''][type='1']");


    public ElementsPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickFindElemButton()
    {
        click(findElemButton);
    }

    public void userValidation()
    {
        driver.findElement(userNameSrc).sendKeys("Selenium", Keys.ENTER);

        Assert.assertTrue(driver.findElement(avatar).isDisplayed());

        System.out.println("Username: " + driver.findElement(userName).getText());
        System.out.println("From: " + driver.findElement(from).getText());
        System.out.println("Public Repos: " + driver.findElement(publicRepos).getText());
        System.out.println("Public Gist: " + driver.findElement(publicGist).getText());
        System.out.println("Followers: " + driver.findElement(followers).getText());



    }
}
