package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SortPage extends BasePage
{
    private final By aui3button = By.cssSelector("[href='/sortable']");
    private final By getToWork = By.xpath("//*[@id=\"sample-box1\"]");
    private final By pickUpGroceries = By.xpath("//*[@id=\"sample-box1\"]");
    private final By goHome = By.xpath("//*[@id=\"sample-box1\"]");
    private final By fallAsleep = By.xpath("//*[@id=\"sample-box1\"]");
    private final By walkDog = By.xpath("//*[@id=\"sample-box1\"]");

    Point point1 = findElement(walkDog).getLocation();
    Point point2 = findElement(getToWork).getLocation();
    Point point3 = findElement(pickUpGroceries).getLocation();
    Point point4 = findElement(goHome).getLocation();
    int x1 = point1.getX();
    int y1 = point1.getY();
    int x2 = point2.getX();
    int y2 = point2.getY();
    int x3 = point3.getX();
    int y3 = point3.getY();
    int x4 = point4.getX();
    int y4 = point4.getY();

    public SortPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickAUI3Button()
    {
        click(aui3button);
    }

    public void moveToElement()
    {
        Actions act = new Actions(driver);

        WebElement elem1 = findElement(getToWork);
        act.moveToElement(elem1).build().perform();
        act.moveByOffset(x1, y1).build().perform();

        WebElement elem2 = findElement(pickUpGroceries);
        act.moveToElement(elem2).build().perform();
        act.moveByOffset(x2, y2).build().perform();

        WebElement elem3 = findElement(goHome);
        act.moveToElement(elem3).build().perform();
        act.moveByOffset(x3, y3).build().perform();

        WebElement elem4 = findElement(fallAsleep);
        act.moveToElement(elem4).build().perform();
        act.moveByOffset(x4, y4).build().perform();
    }




}
