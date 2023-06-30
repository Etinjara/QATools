package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class AdvancedTable extends BaseTest
{
    @Test
    public void AdvancedTableTest() throws Exception
    {
        WorkingSet.advancedTablePage.clickAdvancedTableButton();
        WorkingSet.advancedTablePage.comparingRowCount();
    }
}
