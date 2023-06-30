package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Drop extends BaseTest
{
    @Test
    public void DropTest()
    {
        WorkingSet.dropPage.clickAUI2Button();
        WorkingSet.dropPage.dragAndDropElems();
    }
}
