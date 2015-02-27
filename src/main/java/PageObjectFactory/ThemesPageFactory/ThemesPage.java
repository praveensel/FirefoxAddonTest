package PageObjectFactory.ThemesPageFactory;

import PageObjectFactory.mozBasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by praveen on 2/26/2015.
 */
public class ThemesPage extends mozBasePageObject {


    @FindBy(css="#search-q")
    public WebElement themes_search_bar;


    public ThemesPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle_theme()
    {
        return driver.getTitle();
    }

    public String get_search_placehoder()
    {
        return   getAttributeValue(themes_search_bar, "placeholder");

    }


}
