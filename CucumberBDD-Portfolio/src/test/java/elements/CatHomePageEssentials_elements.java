package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatHomePageEssentials_elements {

    WebDriver driver;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/a[2]/picture[1]/img[1]") public WebElement catLogo;
    @FindBy(id = "utility_links_search_icon") public WebElement searchIcon;
    @FindBy(id = "searchinput") public WebElement searchBox;

    public CatHomePageEssentials_elements(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
}
