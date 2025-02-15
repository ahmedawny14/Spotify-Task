package Tests;

import Data.ReadingFromExcelSheet;
import Pages.HomePage;
import Pages.RegisterPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class RegisterTests extends TestBase {

    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod
    public void openSignUpPAge()
    {
        homePage=new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage.clickOnSignUpButton();
    }

    @Test
    public void signUp() throws IOException, InterruptedException {

        registerPage = new RegisterPage(driver);
        ReadingFromExcelSheet readingFromExcelSheet = new ReadingFromExcelSheet();
        String email = readingFromExcelSheet.getCellData(0, 0);
        String password = readingFromExcelSheet.getCellData(0, 1);
        String username = readingFromExcelSheet.getCellData(0, 2);
        String birthday = readingFromExcelSheet.getCellData(0, 3);
        String birthMonth=readingFromExcelSheet.getCellData(0,4);
        String birthYear = readingFromExcelSheet.getCellData(0, 5);


        registerPage.signUp(email,password,username,birthday,birthMonth,birthYear);
        String expectedResult = "https://open.spotify.com/";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(expectedResult, actualResult);
    }




}
