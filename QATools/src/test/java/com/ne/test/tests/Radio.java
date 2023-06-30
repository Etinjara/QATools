package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Radio extends BaseTest
{
    @Test
    public void RadioTest()
    {
        WorkingSet.radioPage.clickToggleButton();
        WorkingSet.radioPage.clickAny();
        WorkingSet.radioPage.confirmOnlyOne();
        WorkingSet.radioPage.findBug();
        WorkingSet.radioPage.whichIsSelected();
        WorkingSet.radioPage.confirmLastDisabled();
        WorkingSet.radioPage.isCheckboxChecked();
        WorkingSet.radioPage.acceptTC();
    }
}
