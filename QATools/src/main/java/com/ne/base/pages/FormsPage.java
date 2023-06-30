package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends BasePage
{
    private final By formButton = By.cssSelector("[href='/forms']");
    private final By firstName = By.cssSelector("#firstname");
    private final By lastName = By.cssSelector("#lasttname");
    private final By email = By.cssSelector("#email");
    private final By dropDownCode = By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[2]/div[2]/div/div/div/select");
    private final By phoneNumber = By.cssSelector("[placeholder='Phone Number']");
    private final By addressLine1 = By.cssSelector("[placeholder='Address Line-1']");
    private final By addressLine2 = By.cssSelector("[placeholder='Address Line-2']");
    private final By state = By.cssSelector("[placeholder='State']");
    private final By postalCode = By.cssSelector("[placeholder='Postal-Code']");
    private final By dropDownCountry = By.xpath("/html/body/app-root/app-forms/section[1]/div/div/div[1]/div/div/form/div[5]/div[2]/div/div/div/select");
    private final By date = By.cssSelector("#Date");
    private final By gender = By.cssSelector("#male");
    private final By terms = By.cssSelector("[type='checkbox']");
    private final By submit = By.cssSelector("[type='submit']");

    public FormsPage(WebDriver driver)
    {
        super(driver);
    }

    public void clickFormButton()
    {
        click(formButton);
    }

    public void inputInfo(String frName, String ltName)
    {
        findElement(firstName).sendKeys(frName);
        findElement(lastName).sendKeys(ltName);
        click(email);
        findElement(email).clear();
        findElement(email).sendKeys("hello@gmail.com");
        selectDropDownVisibleText(dropDownCode, "Serbia (+381)");
        findElement(phoneNumber).sendKeys("692205667");
        findElement(addressLine1).sendKeys("7. Jula 25B");
        findElement(addressLine2).sendKeys("Becej");
        findElement(state).sendKeys("Vojvodina");
        findElement(postalCode).sendKeys("21220");
        selectDropDownVisibleText(dropDownCountry, "Serbia");
        findElement(date).sendKeys("22052000");
        click(gender);
        click(terms);
        click(submit);
    }


}
