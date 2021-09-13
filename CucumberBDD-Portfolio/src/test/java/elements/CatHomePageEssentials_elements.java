package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatHomePageEssentials_elements {

    WebDriver driver;
    public void mPickLang(String lang) {
        driver.findElement(By.linkText(lang)).click();
    }
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/a[2]/picture[1]/img[1]") public WebElement catLogo;
    @FindBy(id = "utility_links_search_icon") public WebElement searchIcon;
    @FindBy(id = "searchinput") public WebElement searchBox;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]") public  WebElement pickLang;
 @FindBy(linkText = )

    public CatHomePageEssentials_elements(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }
}
