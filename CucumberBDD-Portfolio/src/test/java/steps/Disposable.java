package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.fail;


public class Disposable {
    WebDriver driver;

    public Disposable(GlobalHooks globalHooks) {
        this.driver = globalHooks.getDriver();
    }

    @Given("I am on CAT Home Page")
    public void i_am_on_cat_home_page() {
        driver.get("https://www.caterpillar.com/");
    }

    @When("I click to Company top menu link")
    public void i_click_to_company_top_menu_link() {
        driver.findElement(By.linkText("COMPANY")).click();
    }

    @Then("I navigate to Company page")
    public void i_navigate_to_company_page() {
        String cURL = driver.getCurrentUrl();
        if (!cURL.equals("https://www.caterpillar.com/en/company.html")) {
            fail("Test failed");
        }
    }

    @When("I click to Language Icon")
    public void i_click_to_language_icon() {
     driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]")).click();
    }
    @When("Select the {string}")
    public void select_the(String lang) {
        driver.findElement(By.linkText(lang)).click();
    }
    @Then("I navigate to Company page {string} accordingly to chosen language")
    public void i_navigate_to_company_page_accordingly_to_chosen_language(String url) {
        String langURL = driver.getCurrentUrl();
        if (!langURL.equals(url)){
            fail("Wrong Translating Page");
        }

    }
}