package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    static By productPage = By.cssSelector(".bndl-productDetail.bndl-productDetail-description.bndl-productDetail-description-translate");
    static By favIcon = By.id("add-to-favorite-detail");
    static WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    public static void checkProductPage(){
        driver.findElement(productPage);
    }
    public static void clickFav(){
        driver.findElement(favIcon).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
