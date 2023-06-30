package com.ne.test.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ne.base.basepage.BasePage;
import com.ne.base.pages.*;
import com.ne.base.util.Assertions;
import com.ne.test.tests.Drop;
import com.ne.test.tests.FIle;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.sl.usermodel.Slide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.io.File;
import java.time.Duration;

public class BaseTest
{
    public static WebDriver driver;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;
    public static Assertions assertions;

    @BeforeTest
    public void startup()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }

    @BeforeSuite
    public void initializeExtentReports()
    {
        extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("AllTests.html");
        ExtentSparkReporter sparkReporter_failed = new ExtentSparkReporter("FailedTests.html");
        sparkReporter_failed.filter().statusFilter().as(new Status[]{Status.FAIL});

        extentReports.attachReporter(sparkReporter_all);
        extentReports.attachReporter(sparkReporter_failed);

        sparkReporter_all.config().setTheme(Theme.DARK);
        sparkReporter_all.config().setDocumentTitle("All Reports");
        sparkReporter_failed.config().setTheme(Theme.DARK);
        sparkReporter_failed.config().setDocumentTitle("Failed Reports");

        extentReports.setReportUsesManualConfiguration(true);

    }

    @AfterSuite
    public void generateExtentReports() throws Exception {
        extentReports.flush();
        Desktop.getDesktop().browse(new File("AllTests.html").toURI());
        Desktop.getDesktop().browse(new File("FailedTests.html").toURI());
    }
}
