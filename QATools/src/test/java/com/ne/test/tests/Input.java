package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Input extends BaseTest
{
    @Test
    public void InputTest()
    {
        String FullName = "Nikola Etinski";
        String AttributeName = "Text";

        WorkingSet.inputPage.clickEditButton();
        WorkingSet.inputPage.inputCredentials(FullName);
        WorkingSet.inputPage.appendTextField();
        WorkingSet.inputPage.textBoxContent(AttributeName);
        WorkingSet.inputPage.clearTextBox();
        WorkingSet.inputPage.isFieldDisabled();
    }
}
