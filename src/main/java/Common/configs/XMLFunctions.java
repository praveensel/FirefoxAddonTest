package Common.configs;


import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;

import java.io.File;

/**
 * Created by praveen on 2/9/2015.
 */
public class XMLFunctions {

    public static String getXMLConfiguration(File credentialsFile, String s)
    {
        try {
            XMLConfiguration xmlConfiguration=new XMLConfiguration(credentialsFile);
            return xmlConfiguration.getString(s);
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }


    }
}
