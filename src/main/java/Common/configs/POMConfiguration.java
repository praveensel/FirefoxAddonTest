package Common.configs;

/**
 * Created by praveen on 2/9/2015.
 */
public class POMConfiguration extends AbstractConfiguration{

    private String browser;
    private String platform;
    private String browserVer;
    private String base_address;
    private String credentialsFilePath;

    public POMConfiguration() {


        browser = System.getProperty("browser");
        if (browser == null || browser.isEmpty()) {
            browser = "FF"; //Set default value to Firefox;
        }

        platform = System.getProperty("platform");
        if (platform == null || platform.isEmpty()) {
            platform = "prod"; //Set default value to production
        }

        browserVer = System.getProperty("browserVer");
        if (browserVer == null || browserVer.isEmpty()) {
            browserVer = "mediawiki119"; //Set default value to mediawiki119
        }

        base_address=System.getProperty("base-address") ;
        if (browserVer == null || base_address.isEmpty()) {
            base_address = "mediawiki119"; //Set default value to mediawiki119
        }
        credentialsFilePath = System.getProperty("configfile");

    }





    @Override
    public String getBrowser() {
        return this.browser;
    }

    @Override
    public String getBrowserVersion() {
        return this.browserVer;
    }

    @Override
    public String getPlatformVersion() {
        return this.platform;
    }

    @Override
    public String getPlatform() {
        return this.platform;
    }

    @Override
    public String getCredentialsFilePath() {
        return this.credentialsFilePath;
    }

    @Override
    public String getURl() {
        return this.base_address;
    }
}
