package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Forms extends BaseTest
{
    @Test
    public void FormsTest()
    {
        WorkingSet.formsPage.clickFormButton();
        WorkingSet.formsPage.inputInfo("Nikola", "Etinski");
    }
}
