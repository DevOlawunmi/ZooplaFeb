package co.uk.zooplaa.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Browser extends DriverLib
{
    //Chrome
    private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    private WebDriver initHeadlessChrome()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","--headless");
        return new ChromeDriver();
    }
  //Firefox
    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    private WebDriver initHeadlessFireFox()
    {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-gpu","--headless");
        return new FirefoxDriver();
    }

    public void launchBrowser(String browser)
    {
        switch (browser)
        {
            case "Chrome":
                driver = initChrome();
                break;
            case "Firefox":
                driver = initFirefox();
            case "Headless":
                driver = initHeadlessChrome();
                break;
            default:initHeadlessChrome();
        }
        driver.manage().window().maximize();
    }
public void closeBrowser()
{
        driver.manage().deleteAllCookies();
        driver.quit();
}
}
