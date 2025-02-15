package Tests;

import Data.ReadingFromExcelSheet;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class LoginTests extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void navigateToLogin() {

        homePage = new HomePage(driver);
        homePage.clickOnLoginButton();
    }


    @Test
    public void login() throws IOException, InterruptedException {
        loginPage = new LoginPage(driver);
        ReadingFromExcelSheet readingFromExcelSheet = new ReadingFromExcelSheet();
        String email = readingFromExcelSheet.getCellData(0, 0);
        String password = readingFromExcelSheet.getCellData(0, 1);
        loginPage.login(email, password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(homePage.getUserFirstLetter().isDisplayed());


    }
}
