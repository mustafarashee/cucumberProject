package StepDefinition;

import Pages.Checkout;
import Pages.Login;
import Pages.Products;
import driverManager.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class stepsLogin {
    WebDriver driver;
    Login loginPage;
    Products products;
    Checkout checkout;
    public stepsLogin() {
        this.driver = new WebDriverManager().getDriver();
        this.loginPage = new Login(driver);
        this.products = new Products(driver);
        this.checkout = new Checkout(driver);
    }
    @Given("User is on Login page")
    public void user_is_on_Login_page() throws IOException, InterruptedException {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user give valid {string} and valid {string}")
    public void userGiveValidAndValid(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("user should be able to see the {string} page")
    public void userShouldBeAbleToSeeThePage(String expectedTitle) {
        String actualTitle =  driver.findElement(By.className("title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("user selects two products")
    public void userSelectsTwoProducts() {
        products.selectProducts();
    }

    @And("user clicks on the cart icon")
    public void userClicksOnTheCartIcon() {
        products.clickCart();
    }

    @And("user performs checkout")
    public void userPerformsCheckout() throws InterruptedException {
        products.checkout();
    }

    @Then("user enter it's {string} {string} {string}")
    public void userEnterItS(String first, String last, String code) {
        checkout.enterCredentials(first,last,code);
    }

    @And("user clicks on continue")
    public void userClicksOnContinue() {
        checkout.clickContinue();
    }

    @Then("user can see the {string} information")
    public void userCanSeeTheInformation(String expectedTitle) {
        String actualTitle =  driver.findElement(By.className("title")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("user can see finish it's order by clicking on finish button")
    public void userCanSeeFinishItSOrderByClickingOnFinishButton() {
        checkout.clickFinish();
    }
}
