package Common.templates.mobile;


import Common.driverprovider.mobileprovider.MobileDriverProvider;
import Common.templates.NewTestTemplate;

/**
 * Bogna 'bognix' Knychala
 */
public class MobileTestTemplate extends NewTestTemplate {

  @Override
  public void startBrowser() {
    driver = new MobileDriverProvider(config).getDriverInstance();
  }
}
