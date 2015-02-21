package Common.driverprovider.mobileprovider;



import Common.core.Configuration.AbstractConfiguration;
import Common.driverprovider.NewDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Bogna 'bognix' Knychala
 */
public class MobileDriverProvider {

  private MobileDriversRegistry mobileDriversRegistry;
  private String platform;
  private String platformVersion;
  private String deviceId;
  private String mobileConfig;
  private String browser;
    private String runmode;

  public MobileDriverProvider(AbstractConfiguration config) {
    platform = config.getPlatform();
    platformVersion = config.getPlatformVersion();

    browser = config.getBrowser();
      runmode=config.getRunmode();

  }

  public WebDriver getDriverInstance() {
    WebDriver driver = null;

    if ("CHROMEMOBILE".equals(browser) || "CHROMEMOBILEMERCURY".equals(browser)) {
      return NewDriverProvider.getDriverInstanceForBrowser(browser, platform, runmode);
    }

    switch (platform.toUpperCase()) {
      case "ANDROID":
        mobileDriversRegistry = new MobileDriversRegistry(platform, mobileConfig);
        driver = getChromeDriver(platformVersion, deviceId);
        break;
      case "IOS":
        //@TODO
        break;
      default:
        throw new WebDriverException(
            "Unknown platform provided \n" +
            "Available platforms:" +
            "\n\t android" +
            "\n\t ios"
        );
    }
    return driver;
  }

  private WebDriver getChromeDriver(String platformVersion, String deviceId) {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setExperimentalOption("androidPackage", "com.android.chrome");
    if (deviceId != null) {
      chromeOptions.setExperimentalOption(
          "androidDeviceSerial", deviceId
      );
    } else if (platformVersion != null) {
      chromeOptions.setExperimentalOption(
          "androidDeviceSerial",
          mobileDriversRegistry.getDeviceForAndroidVersion(platformVersion)
      );
    }
    return new ChromeDriver(chromeOptions);
  }
}
