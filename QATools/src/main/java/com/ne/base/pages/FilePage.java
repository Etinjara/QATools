package com.ne.base.pages;

import com.ne.base.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.crypto.KeyAgreementSpi;

public class FilePage extends BasePage
{
    private final By fileButton = By.cssSelector("[href='/file']");
    private final By upFile = By.cssSelector(".file-cta");
    private final By dwExcel = By.cssSelector("[download='file/file.xlsx']");
    private final By dwPDF = By.cssSelector("[download='file/file.pdf']");
    private final By dwTXT = By.cssSelector("[download='file/file.txt']");

    public FilePage(WebDriver driver)
    {
        super(driver);
    }

    public void clickFileButton()
    {
        click(fileButton);
    }

    public void uploadFile()
    {
        click(upFile);
        findElement(upFile).sendKeys("C:\\Users\\nikola.etinski\\Downloads\\Selenium.png", Keys.ENTER);
    }

    public void downloadExcel()
    {
        click(dwExcel);
    }

    public void downloadPDF()
    {
        click(dwPDF);
    }

    public void downloadText()
    {
        click(dwTXT);
    }
}
