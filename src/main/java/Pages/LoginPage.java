package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private  By email= By.id("login-username");
    private  By pass=By.id("login-password");
    private By loginButton=By.xpath("//*[@id=\"login-button\"]/span[1]");

    public void enterUserName(String username) {
        driver.findElement(email).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(pass).sendKeys(password);
    }

    public void clickOnLogin() {
        driver.findElement(loginButton).click();
    }







    public void login(String username,String password)
    {

        enterUserName(username);
        enterPassword(password);
        clickOnLogin();
    }

}

