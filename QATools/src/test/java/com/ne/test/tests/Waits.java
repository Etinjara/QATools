package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Waits extends BaseTest
{
    @Test
    public void WaitsTest()
    {
        WorkingSet.waitsPage.clickTimeoutButton();
        WorkingSet.waitsPage.isAlertPresent();
    }
}
