package driverManager;

import driverManager.DriverManagerFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverManager {
    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = DriverManagerFactory.createDriver();
        }
        return driver;
    }
}
