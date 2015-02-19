package PageObjectFactory.AddonPage.addonpage;

import Common.Logging.PageObjectLogging;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by praveen on 2/13/2015.
 */
public class mozBasePageObject extends BasePageObject {


    public mozBasePageObject(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public addonspageobject Openaddonspageobject(String baseUrl) {
        getUrl(baseUrl );
        PageObjectLogging.log("openAddOnPageObject", baseUrl + " opened", true);
        return new addonspageobject(driver);
    }
}
