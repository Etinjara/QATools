package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class FIle extends BaseTest
{
    @Test
    public void FileTest()
    {
        WorkingSet.filePage.clickFileButton();
        WorkingSet.filePage.uploadFile();
        WorkingSet.filePage.downloadExcel();
        WorkingSet.filePage.downloadPDF();
        WorkingSet.filePage.downloadText();
    }
}
