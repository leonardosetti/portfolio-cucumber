package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.fail;

public class CatHomeHeader {
    WebDriver driver;

    public CatHomeHeader(GlobalHooks globalHooks) {
        this.driver = globalHooks.getDriver();
    }

    /*@Given("I access the CAT site")
    public void i_access_the_cat_site() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
    @When("I click to top menu {string}")
    public void i_click_to_top_menu(String link) throws Exception {
        driver.findElement(By.linkText(link)).click();
        Thread.sleep(1500);
    }

    @Then("I navigate to page on {string} and page {string}")
    public void i_navigate_to_page_on_and_page(String url, String title) {
        String currentURL = driver.getCurrentUrl();
        String currentTitle = driver.getTitle();
        if (!currentURL.equals(url)) {
            fail("Mismatch URL. Expecting " + url);
        }
        if (!currentTitle.equals(title)) {
            fail("Mismatch page Title. Expecting " + title);
        }
    }

}
