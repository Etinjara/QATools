package com.ne.test.test;

import com.ne.base.basepage.BasePage;
import com.ne.base.pages.*;

public class WorkingSet extends BaseTest
{
    public static BasePage basePage;
    public static InputPage inputPage;
    public static ButtonPage buttonPage;
    public static DropDownPage dropDownPage;
    public static AlertPage alertPage;
    public static RadioPage radioPage;
    public static WindowPage windowPage;
    public static ElementsPage elementsPage;
    public static DragPage dragPage;
    public static DropPage dropPage;
    public static SortPage sortPage;
    public static MultiSelectPage multiSelectPage;
    public static SliderPage sliderPage;
    public static SimpleTablePage simpleTablePage;
    public static AdvancedTablePage advancedTablePage;
    public static CalendarPage calendarPage;
    public static WaitsPage waitsPage;
    public static FormsPage formsPage;
    public static FilePage filePage;
    public static ShadowPage shadowPage;

    public void workingSet()
    {
        basePage = new BasePage(driver);
        inputPage = new InputPage(driver);
        buttonPage = new ButtonPage(driver);
        dropDownPage = new DropDownPage(driver);
        alertPage = new AlertPage(driver);
        radioPage = new RadioPage(driver);
        windowPage = new WindowPage(driver);
        elementsPage = new ElementsPage(driver);
        dragPage = new DragPage(driver);
        dropPage = new DropPage(driver);
        sortPage = new SortPage(driver);
        multiSelectPage = new MultiSelectPage(driver);
        sliderPage = new SliderPage(driver);
        simpleTablePage = new SimpleTablePage(driver);
        advancedTablePage = new AdvancedTablePage(driver);
        calendarPage = new CalendarPage(driver);
        waitsPage = new WaitsPage(driver);
        formsPage = new FormsPage(driver);
        filePage = new FilePage(driver);
        shadowPage = new ShadowPage(driver);
    }
}
