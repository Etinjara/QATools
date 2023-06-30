package com.ne.test.tests;

import com.ne.test.test.BaseTest;
import com.ne.test.test.WorkingSet;
import org.testng.annotations.Test;

public class Slider extends BaseTest
{
    @Test
    public void SliderTest()
    {
        WorkingSet.sliderPage.clickAUI5Button();
        WorkingSet.sliderPage.moveSlider();
        WorkingSet.sliderPage.contentValidation();
    }
}
