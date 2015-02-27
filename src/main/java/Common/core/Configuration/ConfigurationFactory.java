package Common.core.Configuration;

/**
 * Created by praveen on 2/12/2015.
 */
public class ConfigurationFactory {

    public static AbstractConfiguration getConfig() {

        if (System.getProperty("run_mvn") == null || "false".equals(System.getProperty("run_mvn"))) {

            System.out.println("Running with manual config file");
            return new ManualConfiguration();
        } else {
            return new POMConfiguration();
        }
    }
}