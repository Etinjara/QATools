package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Drag extends BaseTest
{
    @Test
    public void DragTest()
    {
        WorkingSet.dragPage.clickAUI1Button();
        WorkingSet.dragPage.dragObject();
    }
}
