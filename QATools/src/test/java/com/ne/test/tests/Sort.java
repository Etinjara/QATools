package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Sort extends BaseTest
{
    @Test
    public void SortTest()
    {
        WorkingSet.sortPage.clickAUI3Button();
        WorkingSet.sortPage.moveToElement();
    }
}
