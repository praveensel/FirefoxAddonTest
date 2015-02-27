package Testcases;

import Common.properties.Credentials;
import Common.templates.NewTestTemplateBeforeClass;
import PageObjectFactory.AddonPageFactory.AboutaddonPage;
import PageObjectFactory.mozBasePageObject;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by praveen on 2/27/2015.
 */
public class AboutaddonCases extends NewTestTemplateBeforeClass {

    Credentials credentials = config.getCredentials();


    @Test()
    public void Statistics_verify_Group_by_period_menu()
    {
        mozBasePageObject base = new mozBasePageObject(driver);
        base.openAboutaddon_page("about:addons");
        AboutaddonPage aboutaddonPage = PageFactory.initElements(driver, AboutaddonPage.class);
        aboutaddonPage.TypeSearchTerm("cooliris");
        aboutaddonPage.click_search_button();
        aboutaddonPage.verify_first_result();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
