package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Shadow extends BaseTest
{
    @Test
    public void ShadowTest()
    {
        WorkingSet.shadowPage.clickDOMButton();
        WorkingSet.shadowPage.inputFirstName();
        WorkingSet.shadowPage.inputLastName();
        WorkingSet.shadowPage.inputEmail();
    }
}
