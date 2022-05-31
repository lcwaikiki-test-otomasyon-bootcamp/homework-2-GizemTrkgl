package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    By searchPageLogo = By.cssSelector("#icon-angle-left.lcw-breadcrumb__item-list__back-icon");
    By product = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/div/div[2]/div[1]/a/div[1]/img");
    WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }
    public void checkSearchPage(){
        driver.findElement(searchPageLogo);
    }
    public void clickProduct(){
        driver.findElement(product).click();
    }
}
