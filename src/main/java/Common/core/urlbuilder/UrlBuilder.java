package Common.core.urlbuilder;

/**
 * Created by praveen on 2/12/2015.
 */
public class UrlBuilder {

    public String env=null;

    public String getURl_for_add_on(String env)
    {
        if(env.equalsIgnoreCase("production")){
            return "https://addons.mozilla.org/";
        }

        return "https://addons.mozilla.org/";
    }
}
