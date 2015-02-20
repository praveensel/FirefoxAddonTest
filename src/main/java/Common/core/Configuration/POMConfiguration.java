package Common.core.Configuration;

import java.io.File;

/**
 * Created by praveen on 2/12/2015.
 */
public class POMConfiguration extends AbstractConfiguration {

    private String browser;
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

        credentialsFilePath = System.getProperty("config");
        sauce_name = System.getProperty("saucename");
        sauce_key = System.getProperty("saucekey");
    }

    @Override
    public String getBrowser() {
        return this.browser;
    }

    @Override
    public String getWikiName() {
        return null;
    }

    @Override
    public String getEnv() {
        return this.env;
    }



    @Override
    public String getPlatformVersion() {
        return System.getProperty("platform-version");
    }

    @Override
    public String getPlatform() {
        return System.getProperty("platform");
    }

    @Override
    public String getRunmode() {
        return this.runmode;
    }

    @Override
    public String getDeviceId() {
        return System.getProperty("deviceId");
    }

    @Override
    public String geMobileConfig() {
        return System.getProperty("mobile-config");
    }

    @Override
    public String getCredentialsFilePath() {
        return this.credentialsFilePath;
    }

    @Override
    public String getDeviceName() {
        return null;
    }

    @Override
    public String getAppiumIp() {
        return null;
    }

    @Override
    public String getSaucename() {return this.sauce_name;}

    @Override
    public String getSaucekey() {return this.sauce_key; }


}


