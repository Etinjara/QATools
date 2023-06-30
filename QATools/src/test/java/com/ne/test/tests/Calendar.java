package com.ne.test.tests;

import com.ne.base.pages.CalendarPage;
import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.TimeZone;

public class Calendar extends BaseTest
{
    @Test
    public void CalendarTest()
    {
        WorkingSet.calendarPage.clickDateTimeButton();
        WorkingSet.calendarPage.today();
        WorkingSet.calendarPage.todayPlusThree();
    }
}
