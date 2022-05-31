package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoriPage {
    static By fav = By.cssSelector("[href=\"/tr-TR/TR/favorilistem\"]");

    static By favories = By.xpath("//*[@id=\"model_2425151_5857145\"]/div[1]/img[1]");
    static WebDriver driver;
    public FavoriPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickFav(){
        driver.findElement(fav).click();
    }
    public static void favControl(){
        driver.findElement(favories);
    }
}
