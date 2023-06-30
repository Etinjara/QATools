package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class SimpleTable extends BaseTest
{
    @Test
    public void SimpleTableTest()
    {
        WorkingSet.simpleTablePage.clickSimpleTableButton();
        WorkingSet.simpleTablePage.totalPriceCheck();
        WorkingSet.simpleTablePage.clickCheckboxRaj();
        WorkingSet.simpleTablePage.checkingSorting();
    }
}
