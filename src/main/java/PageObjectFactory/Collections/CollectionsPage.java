package PageObjectFactory.Collections;

import Common.contentpattern.URLsContent;
import PageObjectFactory.mozBasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by praveen on 2/26/2015.
 */
public class CollectionsPage extends mozBasePageObject {
    @FindBy(css="#search-q")
    public WebElement collections_search_bar;

    @FindBy(css="#search > button")
    public WebElement search_btn;
    public CollectionsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle_collection()
    {
        return driver.getTitle();
    }

    public String get_search_placeholder()
    {
        return   getAttributeValue(collections_search_bar, "placeholder");

    }

    public void verifyURL_Contains_collection()
    {
       verifyURLcontains(URLsContent.Collections) ;
    }

    public void verifyURL_Contains_Cat_collection()
    {
        verifyURLcontains(URLsContent.CollectionsCat) ;
    }

    public void TypeSearchTerm(String Searchterm) {
        waitForElementVisibleByElement(collections_search_bar);
        sendKeys(collections_search_bar, Searchterm);

    }

    public void click_search_button()
    {
        waitForElementVisibleByElement(search_btn);
        scrollAndClick(search_btn);
    }


}
