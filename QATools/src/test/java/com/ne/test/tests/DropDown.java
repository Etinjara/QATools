package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class DropDown extends BaseTest
{
    @Test
    public void dropDownTest()
    {
        WorkingSet.dropDownPage.clickDropDownButton();
        WorkingSet.dropDownPage.selectFruit();
        WorkingSet.dropDownPage.multipleSelect();
        WorkingSet.dropDownPage.selectLang();
        WorkingSet.dropDownPage.selectCountry();
    }
}
