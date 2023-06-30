package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Button extends BaseTest
{
    @Test
    public void ButtonTest()
    {
        WorkingSet.buttonPage.clickClickButton();
        WorkingSet.buttonPage.clickHomeButton();
        WorkingSet.buttonPage.getLocation();
        WorkingSet.buttonPage.getElemColor();
        WorkingSet.buttonPage.getElemSize();
        WorkingSet.buttonPage.buttonDisabled();
        WorkingSet.buttonPage.clickAndHold();
    }
}
