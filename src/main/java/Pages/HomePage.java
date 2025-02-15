package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {

        super(driver);
    }

    private By signUpButton=By.xpath("//*[@id=\"global-nav-bar\"]/div[3]/div[2]/button[1]");
    private By loginButton=By.xpath("//*[@class='ButtonInner-sc-14ud5tc-0 jGzjVo encore-inverted-light-set e-9541-button-primary--medium e-9541-button-primary__inner']");
    private By userFirstLetter=By.xpath("//*[@id=\"global-nav-bar\"]/div[3]/button[2]");
    private By searchEngine= By.xpath("//*[@id=\"global-nav-bar\"]/div[2]/div/div/span/div/form/div[2]/input");
    private By addListButton= By.xpath("//*[@id=\"Desktop_LeftSidebar_Id\"]/nav/div/div[1]/div[1]/header/div/div[2]/span/button");
    private By createNewPlayListButton= By.xpath("//*[@id=\"context-menu\"]/ul/li[1]/button");



    public void clickOnSignUpButton()
    {
        driver.findElement(signUpButton).click();
    }

    public void clickOnLoginButton()
    {
        driver.findElement(loginButton).click();
    }

    public WebElement getUserFirstLetter()
    {
        return  driver.findElement(userFirstLetter);
    }

    public void search()
    {
        driver.findElement(searchEngine).sendKeys("ياسر");
    }


    public void clickOnAddPlayListButton()
    {
        driver.findElement(addListButton).click();
    }

    public void clickOnCreateNewPlayListButton()
    {
        driver.findElement(createNewPlayListButton).click();
    }





}
