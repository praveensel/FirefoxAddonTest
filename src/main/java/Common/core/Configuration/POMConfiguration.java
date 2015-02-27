package Common.core.Configuration;

/**
 * Created by praveen on 2/12/2015.
 */
public class POMConfiguration extends AbstractConfiguration {

    private String browser;
    private String browserVer;
    private String platform;
    private String platformVer;
    private String env;
    private boolean saucemode;
    private String sauce_name;
    private String sauce_key;
    private String credentialsFilePath;

    public POMConfiguration() {
        browser = System.getProperty("browser");
        if (browser == null || browser.isEmpty()) {
            browser = "Chrome"; //Set default value to Firefox;
        }

        env = System.getProperty("env");
        if (env == null || env.isEmpty()) {
            env = "prod"; //Set default value to production
        }

        saucemode = Boolean.parseBoolean(System.getProperty("saucemode"));
        /*if (saucemode == null) {
            saucemode = "local"; //Set default value to mediawiki119
        }*/

        browserVer=System.getProperty("browserVer")
        ;
        if(browserVer==null || browserVer.isEmpty() )
        {
            browserVer="35";
        }

        platform=System.getProperty("platform");
        if(platform==null || platform.isEmpty() )
        {
            platform="ANY";
        }

        platformVer=System.getProperty("platform-version");
        if(platformVer==null || platformVer.isEmpty() )
        {
            platformVer="ANY";
        }

        credentialsFilePath = System.getProperty("config");
        sauce_name = System.getProperty("saucename");
        sauce_key = System.getProperty("saucekey");
    }

    @Override
    public String getBrowser() {
        return this.browser;
    }

    @Override
    public String getbrowserVer() {     return this.browserVer;   }

    @Override
    public String getEnv() {
        return this.env;
    }

    @Override
    public String getPlatformVersion() {  return this.platformVer ;  }

    @Override
    public String getPlatform() {
        return this.platform;
    }

    @Override
    public boolean getSaucemode() {
        return this.saucemode;
    }

    @Override
    public String getCredentialsFilePath() { return this.credentialsFilePath; }

    @Override
    public String getSaucename() {return this.sauce_name;}

    @Override
    public String getSaucekey() {return this.sauce_key; }


}


