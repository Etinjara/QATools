package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert extends BaseTest
{
    @Test
    public void AlertTest()
    {
        WorkingSet.alertPage.clickDialogButton();
        WorkingSet.alertPage.acceptAlert();
        WorkingSet.alertPage.dismissAlert();
        WorkingSet.alertPage.writeAndAcceptAlert();
    }
}
