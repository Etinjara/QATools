package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class MultiSelect extends BaseTest
{
    @Test
    public void MultiSelectTest()
    {
        WorkingSet.multiSelectPage.clickAUI4Button();
        WorkingSet.multiSelectPage.selectAll();
    }
}
