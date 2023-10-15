package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Products {
    WebDriver driver;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    private static WebElement backPackATC;

    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    private static WebElement bikeLightATC;

    @FindBy(id="shopping_cart_container")
    private static WebElement shoppingCart;
    @FindBy(id="checkout")
    private static WebElement checkout;


    public Products(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectProducts() {
        bikeLightATC.click();
        backPackATC.click();
    }
    public void clickCart(){
        shoppingCart.click();
    }
    public void checkout() throws InterruptedException {
        Thread.sleep(2000);
        checkout.click();
    }
}
