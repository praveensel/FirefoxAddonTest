package Common.configs;

import Common.properties.Credentials;

import java.io.File;

/**
 * Created by praveen on 2/9/2015.
 */
public abstract class AbstractConfiguration {


    public abstract String getBrowser();

    public abstract String getBrowserVersion();

    public abstract String getPlatformVersion();

    public abstract String getPlatform();


    public abstract String getCredentialsFilePath();

    public Credentials getCredentials() {
        return new Credentials(new File(this.getCredentialsFilePath()));
    }

    public abstract String getURl();
}
