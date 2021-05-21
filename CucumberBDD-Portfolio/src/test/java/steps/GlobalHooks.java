package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GlobalHooks {

    private WebDriver driver;

    @Before
    public void useDriver() {
        System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        Thread.sleep(1500);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
