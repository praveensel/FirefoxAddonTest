

package Common.templates;



import Common.core.UserAgent;
import Common.driverprovider.NewDriverProvider;
import Common.driverprovider.UseUnstablePageLoadStrategy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class NewTestTemplate extends NewTestTemplateCore {

  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
    prepareURLs();
  }

  @BeforeMethod(alwaysRun = true)
  public void start(Method method, Object[] data) {
    //runProxyServerIfNeeded(method);
    if (method.getAnnotation(UserAgent.class) != null) {
      setBrowserUserAgent(
          method.getAnnotation(UserAgent.class).userAgent()
      );
    }

    if (method.isAnnotationPresent(UseUnstablePageLoadStrategy.class)) {
      NewDriverProvider.setUnstablePageLoadStrategy(true);
    }

    startBrowser();
    //Reset unstable page load strategy to default 'false' value
    NewDriverProvider.setUnstablePageLoadStrategy(false);
    logOut();
  }

  @AfterMethod(alwaysRun = true)
  public void stop() {
    if (isProxyServerRunning) {
      networkTrafficIntereceptor.stop();
    }
    stopBrowser();
  }
}
