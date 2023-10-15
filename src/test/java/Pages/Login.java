package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    WebDriver driver;
    @FindBy(id="user-name")
    private static WebElement username;
    @FindBy(id="password")
    private static WebElement password;
    @FindBy(id="login-button")
    private static WebElement loginBtn;
    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void enterUsername(String userName) {
        username.sendKeys(userName);
    }
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    public void clickLoginBtn() {
        loginBtn.click();
    }
}
