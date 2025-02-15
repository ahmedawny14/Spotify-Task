package Tests;

import Data.ReadingFromExcelSheet;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PlayListPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;


public class createPlayList extends TestBase {
    LoginPage loginPage;
    ReadingFromExcelSheet readingFromExcelSheet;
    HomePage homePage;
    PlayListPage playListPage;

    @BeforeMethod
    public void loginBeforeCreatePlayList() throws IOException {
        homePage = new HomePage(driver);
        homePage.clickOnLoginButton();
        loginPage = new LoginPage(driver);
        readingFromExcelSheet = new ReadingFromExcelSheet();
        String email = readingFromExcelSheet.getCellData(0, 0);
        String password = readingFromExcelSheet.getCellData(0, 1);
        loginPage.login(email, password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

    @Test
    public void createPlayList() throws IOException, InterruptedException {

        homePage = new HomePage(driver);
        playListPage = new PlayListPage(driver);

        homePage.search();
        homePage.clickOnAddPlayListButton();
        homePage.clickOnCreateNewPlayListButton();
        playListPage.setSearchForSongOrEpisode().sendKeys("سورة يوسف");
        playListPage.setSearchForSongOrEpisode().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        playListPage.addToPlayList();

        Thread.sleep(5000);
        playListPage.playTheList();
        Thread.sleep(1500);


    }

}
