package Common.core.Configuration;

import java.io.File;

/**
 * Created by praveen on 2/12/2015.
 */
public class POMConfiguration extends AbstractConfiguration {

    private String browser;
    private String browserVer;
    private String platform;
    private String platformVer;
    private String env;
    private String runmode;
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

        runmode = System.getProperty("runmode");
        if (runmode == null || runmode.isEmpty()) {
            runmode = "local"; //Set default value to mediawiki119
        }

        browserVer=System.getProperty("browserVer")
        ;
        if(browserVer==null || browserVer.isEmpty() )
        {
            browserVer="ANY";
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
    public String getRunmode() {
        return this.runmode;
    }

    @Override
    public String getCredentialsFilePath() { return this.credentialsFilePath; }

    @Override
    public String getSaucename() {return this.sauce_name;}

    @Override
    public String getSaucekey() {return this.sauce_key; }


}


