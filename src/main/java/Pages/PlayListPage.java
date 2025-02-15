package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayListPage extends PageBase{

    public PlayListPage(WebDriver driver) {
        super(driver);
    }


private By searchForSongOrEpisode=By.xpath("//*[@id=\"main\"]/div/div[2]/div[4]/div/div/div[2]/div[2]/div/main/section/div[2]/div[3]/div/section/div/div/input");

    private By addToPlayListButton=By.xpath("//*[@id=\"main\"]/div/div[2]/div[4]/div/div/div[2]/div[2]/div/main/section/div[2]/div[3]/div/div/div[1]/div/div[2]/div[1]/div/div[3]/button");
    private By playTheList= By.xpath("//*[@id=\"main\"]/div/div[2]/div[4]/div/div/div[2]/div[2]/div/main/section/div[2]/div[2]/div[2]/div/div/div[1]/button");

public WebElement setSearchForSongOrEpisode()
{
   return  driver.findElement(searchForSongOrEpisode);
}

public void addToPlayList()
{
    driver.findElement(addToPlayListButton).click();
}

public void playTheList()
{
    driver.findElement(playTheList).click();
}
}
