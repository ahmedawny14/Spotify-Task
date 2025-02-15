package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.time.Duration;

public class TestBase
{
  WebDriver driver;
    @BeforeTest
    public void openUrl() {
        driver = new ChromeDriver();

      driver.get("https://www.spotify.com");
        driver.manage().window().maximize();

    }




//    @AfterTest
//    public void closeBrowser() {
//
//        driver.quit();
//    }
}


