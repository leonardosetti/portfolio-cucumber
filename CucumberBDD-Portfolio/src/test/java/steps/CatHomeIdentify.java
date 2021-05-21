package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.fail;

public class CatHomeIdentify {
    WebDriver driver;

    public CatHomeIdentify(GlobalHooks globalHooks) {
        this.driver = globalHooks.getDriver();
    }

    @Given("I access the CAT site")
    public void i_access_the_cat_site() {
        driver.get("https://www.caterpillar.com/");
    }

    @When("the CAT home page completely loads")
    public void the_cat_home_page_completely_loads() {
        /*WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/header[1]/div[3]/div[1]/div[1]/a[2]/picture[1]/img[1]")));*/
        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/a[2]/picture[1]/img[1]")).isDisplayed();
        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/a[2]/picture[1]/img[1]")).click();
    }

    @Then("I see the correct default CAT Home Page URL")
    public void i_see_the_correct_default_cat_home_page_url() {
        String cat_default_url = driver.getCurrentUrl();
        if (!cat_default_url.equals("https://www.caterpillar.com/en.html")) {
            fail("The loaded page doesn't corresponds to expected URL");
        }
    }

    @Then("I see the correct default CAT Home Page Title")
    public void i_see_the_correct_default_cat_home_page_title() {
        String cat_default_title = driver.getTitle();
        if (!cat_default_title.equals("Caterpillar | Caterpillar")) {
            fail("The loaded page doesn't corresponds to expected URL");
        }
    }

    @Then("I see the correct default CAT Home Page Logo")
    public void i_see_the_correct_default_cat_home_page_logo() {
        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/a[2]/picture[1]/img[1]")).isDisplayed();
    }
}
