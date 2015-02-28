package Testcases;

import Common.contentpattern.URLsContent;
import Common.core.Assertion;
import Common.properties.Credentials;
import Common.templates.NewTestTemplateBeforeClass;

import PageObjectFactory.AddonPageFactory.AddonHomepage;
import PageObjectFactory.AddonPageFactory.AddonPage;
import PageObjectFactory.Collections.CollectionsPage;
import PageObjectFactory.ThemesPageFactory.ThemesPage;
import PageObjectFactory.mozBasePageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

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
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        AddonHomepage.OpenURl();
        AddonHomepage.TypeSearchTerm("Adblock") ;
        AddonHomepage.click_search_button();
        AddonHomepage.click_first_result();
        AddonHomepage.Click_Statistic_link();
        AddonHomepage.ch();

    }

    @Test()
    public void Add_On_Details_Verify_the_description_available_in_the_add_on_detail_page()
    {

        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("Adblock") ;
        AddonHomepage.click_search_button();
        AddonHomepage.click_first_result();
        AddonHomepage.VerifyAboutaddonisshown();

    }

    @Test()
    public void StatisticsVerify_For_last_period_menu()
    {

        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);

        AddonHomepage.TypeSearchTerm("Adblock") ;
        AddonHomepage.click_search_button();
        AddonHomepage.click_first_result();
        AddonHomepage.Click_Statistic_link();
        AddonHomepage.verify_Range_island();

    }

    @Test()
    public void Verify_the_format_and_information_available_in_the_add_on_detail_page_for_logged_in_users()
    {

        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.click_login();
        AddonHomepage.login_to_addon_page(credentials.userName,credentials.password);
        AddonHomepage.mouseover_username();
        AddonHomepage.verify_account_drop_down_after_logging() ;
        AddonHomepage.mousehover_tools();
        AddonHomepage.verify_tools_drop_down_after_logging();
        AddonHomepage.mousehover_other_apps();
        AddonHomepage.verify_other_apps_drop_down_after_logging();

    }

    @Test()
    public void Sort_search_results_by_Updated()


    {
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("Adblock") ;
        AddonHomepage.click_search_button();
        AddonHomepage.mousehover_more();
        AddonHomepage.click_recently_updated_in_Search_result();
        AddonHomepage.waitForStringInURL("sort=");
        AddonHomepage.verifyURL_Contains_updated();
        ITestResult tr=Reporter.getCurrentTestResult();


    }

    @Test

    public void Check_that_Category_link_loads_respective_category_landing_page()
    {
        System.out.println("heeeeeeee"+System.getenv("SAUCE_USERNAME"));
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("Video") ;
        AddonHomepage.verify_drop_down_suggestion();
    }

    @Test
    public void Sort_search_results_by_Newest()
    {
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("fire") ;
        AddonHomepage.click_search_button();
        AddonHomepage.click_newest_from_sort_by();
        AddonHomepage.waitForStringInURL("sort=");
        AddonHomepage.verifyURLcontains(URLsContent.Search_Created);
    }

    @Test
    public void Sort_search_results_by_weekly()
    {
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("fire") ;
        AddonHomepage.click_search_button();
        AddonHomepage.click_newest_from_sort_by();
        AddonHomepage.waitForStringInURL("sort=");
        AddonHomepage.verifyURLcontains(URLsContent.Search_Created);
    }


    @Test
    public void Verify_Sort_by_menu()
    {
        AddonHomepage AddonHomepage =PageFactory.initElements(driver,AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("fire") ;
        AddonHomepage.click_search_button();
        AddonHomepage.verify_sort_by_menus_are_showing();
    }


    @Test
    public void verify_filters_results_menu()
    {
        AddonHomepage AddonHomepage =PageFactory.initElements(driver,AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("fire") ;
        AddonHomepage.click_search_button();
        AddonHomepage.verify_filter_results();
    }

    @Test
    public void    Follow_any_search_suggestion_by_selecting_it_enter()
    {
        AddonHomepage AddonHomepage =PageFactory.initElements(driver,AddonHomepage.class);
        AddonPage addonPage=PageFactory.initElements(driver,AddonPage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("email") ;
        /*AddonHomepage.navigate_by_pressing_enter_on_suggestion_list();
        addonPage.get_title_Addon();*/
        Assertion.assertEquals(AddonHomepage.navigate_by_pressing_enter_on_suggestion_list().toLowerCase(),addonPage.get_title_Addon().toLowerCase());

    }

    @Test
    public void Follow_any_search_suggestion_by_clicking_it()
    {
        AddonHomepage AddonHomepage =PageFactory.initElements(driver,AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("email") ;
        AddonHomepage.VerifyClickedAddonLoads();
    }

    @Test

    public void  search__Verify_the_default_text_in_search_field_in_Themes_landing_pager()
    {
        AddonHomepage AddonHomepage =PageFactory.initElements(driver,AddonHomepage.class);
        ThemesPage themesPage=PageFactory.initElements(driver,ThemesPage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.click_themes();
        Assertion.assertEquals("Themes :: Add-ons for Firefox", themesPage.getTitle_theme());
        Assertion.assertEquals("search for themes",themesPage.get_search_placehoder());
    }

    @Test
    public void Search_for_a_collection()
    {
        AddonHomepage AddonHomepage =PageFactory.initElements(driver,AddonHomepage.class);
        CollectionsPage collectionsPage=PageFactory.initElements(driver,CollectionsPage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.click_collections();
        collectionsPage.verifyURL_Contains_collection();
        Assertion.assertEquals("Collections :: Add-ons for Firefox", collectionsPage.getTitle_collection());
        Assertion.assertEquals("search for collections",collectionsPage.get_search_placeholder());
        collectionsPage.TypeSearchTerm("email");
        collectionsPage.click_search_button();
        collectionsPage.verifyURL_Contains_Cat_collection();
    }

    @Test
    public void Pressing_ESC_should_dismiss_the_suggestion_search_results()
    {
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("email") ;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AddonHomepage.check_search_suggestion_is_showing();
        base.pressEscKey();

        AddonHomepage.check_search_suggestion_not_showing();
    }

    @Test
    public void Verify_that_Long_Name_suggestions_are_truncate()
    {
        AddonHomepage AddonHomepage = PageFactory.initElements(driver, AddonHomepage.class);
        mozBasePageObject base = new mozBasePageObject(driver);
        base.Openaddonspageobject(baseurl);
        AddonHomepage.TypeSearchTerm("email");
        org.openqa.selenium.Dimension source=AddonHomepage.getSearch_suggestion_Dimension();
        AddonHomepage.TypeSearchTerm("flash video downloader");
        AddonHomepage.verify_search_result_not_resized(source);
    }







}
