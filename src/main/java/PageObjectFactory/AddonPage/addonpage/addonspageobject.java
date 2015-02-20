package PageObjectFactory.AddonPage.addonpage;

import Common.Logging.PageObjectLogging;
import Common.contentpattern.URLsContent;
import Common.core.Assertion;
import org.bouncycastle.jcajce.provider.symmetric.ARC4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

/**
 * Created by praveen on 2/13/2015.
 */
public class addonspageobject extends mozBasePageObject{
    @FindBy(id = "search-q")
    public WebElement search_q;

    @FindBy(xpath = "//*[@id='search']/button")
    public WebElement search;

    @FindBy(id = "language")
    public WebElement lang;

    @FindBy(xpath = "//button[text()='Go']")
    public WebElement go;

    @FindBy(css = "#pjax-results > div.items > div:nth-child(1) > div.info > h3 > a")
    public WebElement First_addon_result;

    @FindBy(css = "#daily-users > a")
    public WebElement Stat;

    @FindBy(css="#page > header > div.criteria.group.island > ul > li")
    public List<WebElement> Groupby;

    @FindBy(css="#page > div:nth-child(4) > section:nth-child(7)")
    public WebElement About_addon;

    @FindBy(css="#page > header > div.criteria.range.island > ul > li")
    public List<WebElement> criteria_range_island;

    @FindBy(css="#aux-nav > ul > li.account.anonymous.nomenu.login.legacy > a:nth-child(2)")
    public WebElement login_addonpage;

    @FindBy(id="id_username")
    public WebElement email_id;

    @FindBy(id="id_password")
    public WebElement password_field;

    @FindBy(id="login-submit")
    public WebElement submit_btn;

    @FindBy(css = "#aux-nav > ul > li.account > a")
    public WebElement username_label;

    @FindBy(css="#aux-nav > ul > li.tools > a")
    public WebElement tools;

    @FindBy(css="#aux-nav > ul > li:nth-child(3) > a")
    public WebElement otherapps;


    @FindBy(css="#aux-nav > ul > li.account > ul > li")
    public List<WebElement> account_list;

    @FindBy(css=" #aux-nav > ul > li.tools > ul > li")
    public List<WebElement> tools_list;

    @FindBy(css="#aux-nav > ul > li:nth-child(3) > ul > li")
    public List<WebElement> other_applications_list;

    @FindBy(css="#sorter > ul > li.extras > a")
    public WebElement search_result_more_link;

    @FindBy(css="#sorter > ul > li.extras > ul > li:nth-child(3) > a")
    public WebElement RecentlyUpdated_Searchresult;

    @FindBy(xpath = "//div[@class='wrap']/ul/li[2]/a/em")
    public WebElement dropdown_suggestion_video;


    public addonspageobject(WebDriver adriver) {
        super(adriver);

    }

    public void OpenURl() {

        driver.navigate().to("https://addons.mozilla.org/en-US/firefox/");
    }
   //for commit
    public void TypeSearchTerm(String Searchterm) {
        waitForElementVisibleByElement(search_q);
        sendKeys(search_q, Searchterm);

    }

    public void click_search_button()
    {
        waitForElementVisibleByElement(search);
        scrollAndClick(search);
    }



    public void click_first_result()
    {
        waitForElementVisibleByElement(First_addon_result);
        scrollAndClick(First_addon_result);
    }

    public void Click_Statistic_link()
    {
        waitForElementVisibleByElement(Stat);
        scrollAndClick(Stat);
    }

    public void ch()
    {
        String t=Groupby.get(1).getAttribute("class");
        Assert.assertEquals(t, "selected");

    }

    public void VerifyAboutaddonisshown()
    {
        scrollToElement(About_addon);
        Assertion.assertTrue(checkIfElementOnPage(About_addon));
        PageObjectLogging.log("verifyMonetizationModuleShown", "Monetization module is visible", true);

    }

    public void verify_Range_island()
    {
        getElementByText(criteria_range_island,"7 days");
        getElementByText(criteria_range_island,"30 days");
        getElementByText(criteria_range_island,"90 days");
        getElementByText(criteria_range_island,"365 days");
        getElementByText(criteria_range_island,"Custom...");
        getElementbyValue(criteria_range_island,"30 days","selected");
    }

    public void click_login()
    {
        waitForElementByElement(login_addonpage) ;
        login_addonpage.click();
    }

    public void login_to_addon_page()
    {
        click_login();
        waitForElementByElement(email_id);
        email_id.sendKeys("praveen.k.be@gmail.com");
        waitForElementByElement(password_field);
        password_field.sendKeys("billyjean");
        waitForElementByElement(submit_btn);
        submit_btn.click();
        PageObjectLogging.log(
                "FillLoginForm",
                "Login form in modal is filled",
                true, driver
        );

    }

    public void verify_account_drop_down_after_logging()
    {
        getElementByText(username_label, "Praveenfox");
        getElementByText(account_list, "My Profile");
        getElementByText(account_list,"Account Settings");
        getElementByText(account_list,"My Collections");
        getElementByText(account_list,"Log out");

    }

    public void mouseover_username()
    {
        waitForElementByElement(username_label);
        mousehover(username_label);

    }

    public void verify_tools_drop_down_after_logging()
    {
        getElementByText(tools_list, "Submit a New Add-on");
        getElementByText(tools_list,"Submit a New Theme");
        getElementByText(tools_list,"Developer Hub");


    }

    public void mousehover_tools()
    {
        waitForElementByElement(tools);
        mousehover(tools);

    }

    public void verify_other_apps_drop_down_after_logging()
    {
        getElementByText(other_applications_list, "Thunderbird");
        getElementByText(other_applications_list,"Firefox for Android");
        getElementByText(other_applications_list,"SeaMonkey");


    }

    public void mousehover_other_apps()
    {
        waitForElementByElement(otherapps);
        mousehover(otherapps);

    }

    public void mousehover_more()
    {
        waitForElementByElement(search_result_more_link);
        mousehover(search_result_more_link);

    }

    public void click_recently_updated_in_Search_result()
    {
        waitForElementByElement(RecentlyUpdated_Searchresult);
        RecentlyUpdated_Searchresult.click();
    }

    public void verifyURL_Contains_updated()
    {
        addonspageobject addonspageobject=new addonspageobject(driver);
        addonspageobject.verifyURLcontains(URLsContent.Search_Updated) ;
    }


    public void wait_for_element_after_update_search(){

        waitForElementVisibleByElement(First_addon_result);

    }

    public void verify_drop_down_suggestion()
    {
        waitForElementByElement(dropdown_suggestion_video);
    }
}

