package Testcases;

import Common.properties.Credentials;
import Common.templates.NewTestTemplate;
import Common.templates.NewTestTemplateBeforeClass;
import PageObjectFactory.AddonPage.addonpage.addonspageobject;
import PageObjectFactory.AddonPage.addonpage.mozBasePageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by praveen on 2/13/2015.
 */
public class AmoDetails_Test extends NewTestTemplateBeforeClass {

    Credentials credentials = config.getCredentials();


    @Test()
    public void Statistics_verify_Group_by_period_menu()
    {
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        addonspageobject addonspageobject= PageFactory.initElements(driver, addonspageobject.class);
        addonspageobject.OpenURl();
        addonspageobject.TypeSearchTerm("Adblock") ;
        addonspageobject.click_search_button();
        addonspageobject.click_first_result();
        addonspageobject.Click_Statistic_link();
        addonspageobject.ch();

    }

    @Test()
    public void Add_On_Details_Verify_the_description_available_in_the_add_on_detail_page()
    {

        addonspageobject addonspageobject= PageFactory.initElements(driver, addonspageobject.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        addonspageobject.TypeSearchTerm("Adblock") ;
        addonspageobject.click_search_button();
        addonspageobject.click_first_result();
        addonspageobject.VerifyAboutaddonisshown();

    }

    @Test()
    public void StatisticsVerify_For_last_period_menu()
    {

        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        addonspageobject addonspageobject= PageFactory.initElements(driver, addonspageobject.class);

        addonspageobject.TypeSearchTerm("Adblock") ;
        addonspageobject.click_search_button();
        addonspageobject.click_first_result();
        addonspageobject.Click_Statistic_link();
        addonspageobject.verify_Range_island();

    }

    @Test()
    public void Verify_the_format_and_information_available_in_the_add_on_detail_page_for_logged_in_users()
    {

        addonspageobject addonspageobject= PageFactory.initElements(driver, addonspageobject.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        addonspageobject.click_login();
        addonspageobject.login_to_addon_page(credentials.userName,credentials.password);
        addonspageobject.mouseover_username();
        addonspageobject.verify_account_drop_down_after_logging() ;
        addonspageobject.mousehover_tools();
        addonspageobject.verify_tools_drop_down_after_logging();
        addonspageobject.mousehover_other_apps();
        addonspageobject.verify_other_apps_drop_down_after_logging();

    }

    @Test()
    public void Sort_search_results_by_Updated()


    {
        addonspageobject addonspageobject= PageFactory.initElements(driver, addonspageobject.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        addonspageobject.TypeSearchTerm("Adblock") ;
        addonspageobject.click_search_button();
        addonspageobject.mousehover_more();
        addonspageobject.click_recently_updated_in_Search_result();
        addonspageobject.waitForStringInURL("sort=");
        addonspageobject.verifyURL_Contains_updated();
        ITestResult tr=Reporter.getCurrentTestResult();


    }

    @Test

    public void Check_that_Category_link_loads_respective_category_landing_page()
    {
       System.out.println(System.getenv("SAUCE_ACCESS_KEY"));
        addonspageobject addonspageobject= PageFactory.initElements(driver, addonspageobject.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        addonspageobject.TypeSearchTerm("Video") ;
        addonspageobject.verify_drop_down_suggestion();
    }





}
