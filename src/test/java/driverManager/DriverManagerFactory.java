package driverManager;

import driverManager.DriverManager;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManagerFactory {
   public static WebDriver driver;
    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        DriverManager.setDriver(driver);
        return driver;
    }
}
