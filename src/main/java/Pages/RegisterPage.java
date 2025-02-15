package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RegisterPage extends PageBase {


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private By email = By.id("username");

    private By firstPageNextButton = By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 hvvTXU encore-bright-accent-set']");
    private By password = By.id("new-password");
    private By secondPageNextButton = By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]");
    private By name = By.id("displayName");
    private By birthDay = By.id("day");
    private By birthMonth = By.id("month");
    private By birthYear = By.id("year");
    private By gander = By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[3]/fieldset/div/div/div[1]/label/span[1]");
    private By thirdPageNextButton = By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button/span[1]");
    private By offersAndNewsCheckButton = By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[4]/div[1]/div/div/label");
    private By registerationDataCheckButton = By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[1]/div[2]/div/section/div[4]/div[2]/div/label");
    private By signUpFormButton = By.xpath("//*[@id=\"__next\"]/main/main/section/div/form/div[2]/button");


    public void enterEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    public void clickOnFirstNextButton() {
        driver.findElement(firstPageNextButton).click();
    }

    public void enterPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
    }

    public void clickOnSecondNextButton()
    {
        driver.findElement(secondPageNextButton).click();

    }

    public void enterName(String userName)
    {
        driver.findElement(name).sendKeys(userName);
    }

    public void enterBirthDay(String userBirthDay)
    {
        driver.findElement(birthDay).sendKeys(userBirthDay);
    }

    public WebElement selectMonth()
    {
        return driver.findElement(birthMonth);
    }

    public void enterYear(String userBirthYear)
    {
        driver.findElement(birthYear).sendKeys(userBirthYear);

    }

    public void selectGander()
    {
        driver.findElement(gander).click();
    }

    public void clickOnThirdNextButton()
    {
        driver.findElement(thirdPageNextButton).click();
    }

    public void clickOnoffersCheckBox()
    {
        driver.findElement(offersAndNewsCheckButton).click();
    }

    public void clickOnRegisterationDataCheckButton()
    {
        driver.findElement(registerationDataCheckButton).click();
    }


    public void clickOnSignUpButton()
    {
        driver.findElement(signUpFormButton).click();
    }


    public void signUp(String email,String password,String name,String birthDay,String birthMonth, String birthYear) throws InterruptedException {
        enterEmail(email);
        Thread.sleep(3000);
        clickOnFirstNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterPassword(password);
        Thread.sleep(3000);
        clickOnSecondNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        enterName(name);
        enterBirthDay(birthDay);
        Select month=new Select(selectMonth());
        month.selectByVisibleText(birthMonth);
        enterYear(birthYear);
        selectGander();
        Thread.sleep(6000);
        clickOnThirdNextButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        clickOnoffersCheckBox();
        clickOnRegisterationDataCheckButton();
        clickOnSignUpButton();
        Thread.sleep(10000);



    }




    }









