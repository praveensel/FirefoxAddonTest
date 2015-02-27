package PageObjectFactory.AddonPageFactory;


import PageObjectFactory.mozBasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by praveen on 2/26/2015.
 */
public class AddonPage extends mozBasePageObject {


    public AddonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#addon > hgroup > h1 > span:nth-child(1)")
    public WebElement addon_name_title;


    public String get_title_Addon()
    {
        waitForElementByElement(addon_name_title);
        return getElementText(addon_name_title);

    }
}
