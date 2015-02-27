package PageObjectFactory.AddonPageFactory;

import PageObjectFactory.mozBasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by praveen on 2/27/2015.
 */
public class AboutaddonPage extends mozBasePageObject {


    public AboutaddonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="header-search")
    public WebElement about_Search;

    @FindBy(xpath="//*[@id=\"search-list\"]")
    public List<WebElement> search_result_grid;

    public void TypeSearchTerm(String Searchterm) {
        waitForElementVisibleByElement(about_Search);
        sendKeys(about_Search, Searchterm);

    }

    public void click_search_button()
    {
        pressEnter();
    }

    public void  verify_first_result(){
        System.out.println(search_result_grid.size());
      //  getElementByValue(search_result_grid,"first","true");

    }

}
