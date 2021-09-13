package actions;

import elements.CatHomePageEssentials_elements;
import org.openqa.selenium.WebDriver;
import steps.GlobalHooks;

public class CatHomePageEssentials_actions {
    WebDriver driver;

    CatHomePageEssentials_elements catHomePageEssentials_elements;

    public CatHomePageEssentials_actions(GlobalHooks globalHooks) {
        this.driver = globalHooks.getDriver();
        catHomePageEssentials_elements = new CatHomePageEssentials_elements(driver);
    }

    public void clickCatLogo() {
        catHomePageEssentials_elements.catLogo.click();
    }

    public void searchKeyWord(String strSearch) {
        catHomePageEssentials_elements.searchIcon.click();
        catHomePageEssentials_elements.searchBox.sendKeys(strSearch);
    }

public void pickLang(){
        catHomePageEssentials_elements.pickLang.click();
}
}
