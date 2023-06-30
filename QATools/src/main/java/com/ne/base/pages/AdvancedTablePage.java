package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AdvancedTablePage extends BasePage
{
    private final By advancedTableButton = By.cssSelector("[href='/advancedtable']");
    private final By uniNames = By.cssSelector("[style='width: 100.078px;']");
    private final By nextButton = By.cssSelector("[data-dt-idx='8']");
    private final By displayed = By.cssSelector("[name='advancedtable_length']");

    public AdvancedTablePage(WebDriver driver)
    {
        super(driver);
    }

    public void clickAdvancedTableButton()
    {
        click(advancedTableButton);
    }

    public void comparingRowCount() throws Exception {
        try {
            List<WebElement> universityNamesElements = driver.findElements(uniNames);
            System.out.println("Size of university names elements" + universityNamesElements.size());
            List<String> universityNames = new ArrayList<String>();
            //adding column1 elements to the list
            for (WebElement nameEle : universityNamesElements) {
                universityNames.add(nameEle.getText());
            }
            //displaying the list elements on console
            for (WebElement s : universityNamesElements) {
                System.out.println(s.getText());
            }
            //locating next button
            String nextButtonClass = driver.findElement(nextButton).getAttribute("class");
            //traversing through the table until last page and adding names to list
            while (!nextButtonClass.contains("disabled")) {
                click(nextButton);
                universityNamesElements = findElements(uniNames);

                for (WebElement nameEle : universityNamesElements) {
                    universityNames.add(nameEle.getText());
                }
                nextButtonClass = findElement(nextButton).getAttribute("class");
            }
            //printing the whole list elements
            for (String name : universityNames) {
                System.out.println(name);
            }
            //counting the size of list
            int actualCount = universityNames.size();
            System.out.println("Total number of university names: " + actualCount);
            //locating displayed count
            String displayedCountString = findElement(displayed).getText().split(" ")[5];
            int displayedCount = Integer.parseInt(displayedCountString);
            System.out.println("Total number of displayed universities: " + displayedCount);
            //actual count calculated vs displayed count
            if (actualCount == displayedCount) {
                System.out.println("Actual row count = Displayed row count");
            } else {
                System.out.println("Actual row count != Displayed row count");
                throw new Exception("Actual row count != Displayed row count");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}
