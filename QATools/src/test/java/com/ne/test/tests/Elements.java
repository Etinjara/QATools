package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Elements extends BaseTest
{
    @Test
    public void ElementsTest()
    {
        WorkingSet.elementsPage.clickFindElemButton();
        WorkingSet.elementsPage.userValidation();
    }
}
