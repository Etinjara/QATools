package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarPage extends BasePage
{
    private final By dateTimeButton = By.cssSelector("[href='/calendar']");
    private final By datePicker = By.xpath("//*[@id=\"datetimePicker215a3829-aea9-4f8d-bdbc-108d40b18fe5\"]/div[1]/div/input[1]");
    private final By today = By.xpath("//*[@id=\"datetimePicker250eff59-2092-4977-8e65-cb26b8aa9de9\"]/div[2]/div[2]/div[2]/button[2]");
    private final By datePickerToday = By.xpath("//*[@id=\"datetimePicker215a3829-aea9-4f8d-bdbc-108d40b18fe5\"]/div[2]/div[2]/div[2]/button[2]");

    public CalendarPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickDateTimeButton()
    {
        click(dateTimeButton);
    }

    public void today()
    {
        click(today);
    }

    public void todayPlusThree()
    {
        click(datePicker);
        click(datePickerToday);
    }
}
