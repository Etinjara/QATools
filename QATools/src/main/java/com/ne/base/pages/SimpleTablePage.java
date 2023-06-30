package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SimpleTablePage extends BasePage
{
    private final By simpleTableButton = By.cssSelector("[href='/table']");
    private final By chocoPrice = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tbody/tr[1]/td[2]");
    private final By applePrice = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tbody/tr[2]/td[2]");
    private final By eggsPrice = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tbody/tr[3]/td[2]");
    private final By cornPrice = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tbody/tr[4]/td[2]");
    private final By totalPrice = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[1]/table/tfoot/td[2]/b");
    private final By rajCheckbox = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[2]/table/tbody/tr[2]/td[4]/input");
    private final By sortByDessert = By.cssSelector("[style='opacity: 0; transform: translateY(25%);']");
    private final By sortByCalories = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[2]/div/div[2]");
    private final By sortByFat = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[3]/div/div[2]");
    private final By sortByCarbs = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[4]/div/div[2]/div[2]/div[1]");
    private final By sortByProtein = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[5]/div/div[2]");
    private final By sortByCholesterol = By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[6]/div/div[2]");


    public SimpleTablePage(WebDriver driver)
    {
        super(driver);
    }

    public void clickSimpleTableButton()
    {
        click(simpleTableButton);
    }

    public void totalPriceCheck()
    {
        String ChocolatePrice = findElement(chocoPrice).getText();
        String ApplePrice = findElement(applePrice).getText();
        String EggsPrice = findElement(eggsPrice).getText();
        String CornPrice = findElement(cornPrice).getText();
        String TotalPriceExpect = findElement(totalPrice).getText();

        int ChocoPrice = Integer.parseInt(ChocolatePrice);
        int AppPrice = Integer.parseInt(ApplePrice);
        int EggPrice = Integer.parseInt(EggsPrice);
        int CorPrice = Integer.parseInt(CornPrice);
        int TotalExpected = Integer.parseInt(TotalPriceExpect);
        int TotalActual = ChocoPrice + AppPrice + EggPrice + CorPrice;

        Assert.assertEquals(TotalExpected, TotalActual, "Total prices match");

    }

    public void clickCheckboxRaj()
    {
        click(rajCheckbox);
    }

    public void checkingSorting()
    {
        click(sortByDessert);
        click(sortByCalories);
        click(sortByCarbs);
        click(sortByFat);
        click(sortByProtein);
        click(sortByCholesterol);
    }

}
