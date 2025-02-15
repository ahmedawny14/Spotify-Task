package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class paractising extends TestBase{

    @Test  //DropDown
    public void useDropDown()
    {

        WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select dropdownItems =new Select(dropdown);
        dropdownItems.selectByIndex(1);


    }
@Test
    public void context() throws InterruptedException {

         driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions action=new Actions(driver);

        action.contextClick(driver.findElement(By.xpath("//div[@id='hot-spot']"))).build().perform();
        Thread.sleep(3000);


    }
@Test
    public void dragAndDrop() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions action=new Actions(driver);

        action.dragAndDrop(driver.findElement(By.xpath("//div[@id='column-a']")), driver.findElement(By.xpath("//div[@id='column-b']"))).build().perform();
        Thread.sleep(3000);

    WebElement fileInput = driver.findElement(By.id("myFile"));

    }

@Test
    public void uploadFile() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/upload");
       WebElement fileInput = driver.findElement(By.xpath("//input[@id='file-upload']"));
    String filePath = "C:\\Users\\AhmedAwny\\Downloads\\Ahmed Awny Ahmed CV.pdf";
    fileInput.sendKeys(filePath);

    Thread.sleep(3000);

    }


     @Test
    public void selectDate() throws InterruptedException {


        driver.get("https://formy-project.herokuapp.com/datepicker");

         WebElement dateField = driver.findElement(By.id("datepicker"));
         dateField.click();

         // Get today's date and format it (e.g., "15")
         LocalDate today = LocalDate.now();
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
         String day = today.format(formatter);

         System.out.println(today);
         System.out.println(day);

         // Select today's date in the calendar
         WebElement date = driver.findElement(By.xpath("//td[@class='day' and text()='" + day + "']"));
         date.click();

         // Optional: Print the selected date for verification
         System.out.println("Today's date (" + day + ") has been selected!");

         Thread.sleep(10000);

    }

    @Test
    public void selectDate2() throws InterruptedException {

        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Open the calendar
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();

        // Select a date (e.g., 15th)
        WebElement date = driver.findElement(By.xpath("//a[text()='15']"));
        date.click();
        Thread.sleep(10000);
        driver.quit();

    }

    @Test
    public void javaScriptExecuted() throws InterruptedException {

           driver.get("https://www.google.com/webhp?hl=ar&sa=X&ved=0ahUKEwiJtOPvgo-LAxX00gIHHVnpDKQQPAgI");
         JavascriptExecutor js= (JavascriptExecutor) driver;
         String title= (String) js.executeScript("return document.title");
        Assert.assertEquals("Google", title);
        long links=(Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");

    }

    @Test
    public void javaScriptScroll() throws InterruptedException {

        driver.get("https://www.amazon.com");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        String title= (String) js.executeScript("scrollBy(0,3000)");
        Thread.sleep(3000);

    }




}
