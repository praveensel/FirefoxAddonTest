package Common.core.Configuration;

import Common.properties.Credentials;
import sun.awt.SunHints;

import java.io.File;

/**
 * Created by praveen on 2/12/2015.
 */
public abstract class AbstractConfiguration {
    public abstract String getBrowser();

    public abstract String getWikiName();

    public abstract String getEnv();

    public abstract String getPlatformVersion();

    public abstract String getPlatform();

    public abstract String getDeviceId();

    public abstract String geMobileConfig();

    public abstract String getCredentialsFilePath();

    public Credentials getCredentials() {
        return new Credentials(new File(this.getCredentialsFilePath()));
    }

    public abstract String getDeviceName();

    public abstract String getAppiumIp();
}
