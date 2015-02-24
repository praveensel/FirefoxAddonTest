package Common.templates;


import Common.Logging.PageObjectLogging;
import Common.configs.Commonutils;
import Common.contentpattern.URLsContent;
import Common.core.Configuration.AbstractConfiguration;
import Common.core.Configuration.ConfigurationFactory;
import Common.core.UrlBuilder;
import Common.core.networktrafficinterceptor.NetworkTrafficInterceptor;
import Common.driverprovider.NewDriverProvider;
import Common.properties.Properties;
import org.browsermob.proxy.ProxyServer;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import java.io.File;

@Listeners({PageObjectLogging.class})
public class NewTestTemplateCore {

  protected WebDriver driver;
  protected UrlBuilder urlBuilder;
  protected AbstractConfiguration config;
  protected String baseurl;
  private DesiredCapabilities capabilities;
  protected NetworkTrafficInterceptor networkTrafficIntereceptor;
  protected boolean isProxyServerRunning = false;

  public NewTestTemplateCore() {
    config = ConfigurationFactory.getConfig();
  }

  @BeforeSuite(alwaysRun = true)
  public void beforeSuite() {
    prepareDirectories();
  }

  protected void prepareDirectories() {
    Properties.setProperties();
    Commonutils.deleteDirectory("." + File.separator + "logs");
    Commonutils.createDirectory("." + File.separator + "logs");
  }

  private void printProperties() {
    System.out.println("Add on url : " + baseurl);
  }

  protected void prepareURLs() {
    urlBuilder = new UrlBuilder(config.getEnv());
    baseurl = urlBuilder.getURlforaddon(config.getEnv());
    printProperties();
  }

  protected void startBrowser() {
    driver = registerDriverListener(
        NewDriverProvider.getDriverInstanceForBrowser(config.getBrowser(),config.getbrowserVer(),config.getPlatform(),config.getPlatformVersion(),config.getRunmode())
    );
  }

  protected WebDriver startCustomBrowser(String browserName) {
    driver = registerDriverListener(
        NewDriverProvider.getDriverInstanceForBrowser(config.getBrowser(),config.getbrowserVer(),config.getPlatform(),config.getPlatformVersion(),config.getRunmode())
    );
    return driver;
  }

  protected WebDriver registerDriverListener(WebDriver driver) {
   // driver.register(new PageObjectLogging());
    return driver;
  }

  protected void logOut() {
    driver.get(baseurl + URLsContent.LOGOUT);
  }

  protected void logOutCustomDriver(WebDriver customDriver) {
    customDriver.get(baseurl + URLsContent.LOGOUT);
  }

  protected void stopBrowser() {
    if (driver != null) {
      driver.quit();
    }
  }

  protected void stopCustomBrowser(WebDriver customDriver) {
    if (customDriver != null) {
      customDriver.quit();
    }
  }

  protected DesiredCapabilities getCapsWithProxyServerSet(ProxyServer server) {
    capabilities = new DesiredCapabilities();
    try {
      capabilities.setCapability(
          CapabilityType.PROXY, server.seleniumProxy()
      );
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return capabilities;
  }

  protected void setDriverCapabilities(DesiredCapabilities caps) {
    NewDriverProvider.setDriverCapabilities(caps);
  }

  protected void setWindowSize(int width, int height, WebDriver desiredDriver) {
    Dimension dimension = new Dimension(width, height);
    desiredDriver.manage().window().setSize(dimension);
  }

  protected void setBrowserUserAgent(String userAgent) {
    NewDriverProvider.setBrowserUserAgent(config.getBrowser(), userAgent);
  }

  /*protected void runProxyServerIfNeeded(Method method) {
    boolean isGeoEdgeSet = false;
    boolean isNetworkTrafficDumpSet = false;
    String countryCode = null;

    if (method.getAnnotation(GeoEdgeProxy.class) != null) {
      isGeoEdgeSet = true;
      countryCode = method.getAnnotation(GeoEdgeProxy.class).country();
    }

    if (method.getAnnotation(NetworkTrafficDump.class) != null) {
      isNetworkTrafficDumpSet = true;
    }

    if (isGeoEdgeSet || isNetworkTrafficDumpSet) {
      isProxyServerRunning = true;
      networkTrafficIntereceptor = new NetworkTrafficInterceptor();
      networkTrafficIntereceptor.startSeleniumProxyServer();
    } else {
      return;
    }

    if (isGeoEdgeSet) {
      GeoEdgeUtils geoEdgeUtils = new GeoEdgeUtils(config.getCredentialsFilePath());
      String credentialsBase64 = "Basic " + geoEdgeUtils.createBaseFromCredentials();
      String ip = geoEdgeUtils.getIPForCountry(countryCode);
      networkTrafficIntereceptor.setProxyServer(ip);
      networkTrafficIntereceptor.changeHeader("Proxy-Authorization", credentialsBase64);
    }

    capabilities = getCapsWithProxyServerSet(networkTrafficIntereceptor);
    setDriverCapabilities(capabilities);
  }*/
}
