package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Checkout {
    WebDriver driver;

    @FindBy(id="first-name")
    private static WebElement firstName;

    @FindBy(id="last-name")
    private static WebElement lastName;

    @FindBy(id="postal-code")
    private static WebElement postalCode;

    @FindBy(id="continue")
    private static WebElement continueBtn;

    @FindBy(id="finish")
    private static WebElement finish;

    @FindBy(id="checkout_complete_container")
    private static WebElement checkoutComplete;


    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterCredentials(String frstN, String lastN, String postalCo) {
        firstName.sendKeys(frstN);
        lastName.sendKeys(lastN);
        postalCode.sendKeys(postalCo);
    }
    public void clickContinue(){
        continueBtn.click();
    }
    public void clickFinish(){
        finish.click();
        Assert.assertTrue(checkoutComplete.isDisplayed());
    }
}
